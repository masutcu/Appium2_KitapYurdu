package utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

import static java.lang.Double.parseDouble;

public class ReusableMethods {

    public static void tapOnElementWithText(String text) {
        List<WebElement> mobileElementList = Driver.getDriver().findElements(By.className("android.widget.TextView"));
        for (WebElement page: mobileElementList) {
            if (page.getText().equalsIgnoreCase(text)){
                page.click();
            }else{
                scrollWithUiScrollable(text);
            }
            break;
        }
    }

    public static boolean isElementPresent(String text) {
        boolean elementFound = false;
        List<WebElement> mobileElementList = Driver.getDriver().findElements(By.xpath("//android.widget.TextView[@text='" + text + "']"));
        for (WebElement el : mobileElementList) {
            if (el.getText().equals(text)) {
                waitToBeVisible(el, Duration.ofSeconds(10));
                if (el.isDisplayed()) {
                    elementFound = true;
                }
            }
        }
        return elementFound;
    }

    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void tapOn(WebElement element) {
        waitToBeClickable(element, Duration.ofSeconds(10));
        element.click();
    }

    public static void enterText(WebElement element, String text) {
        waitToBeClickable(element, Duration.ofSeconds(10));
        element.sendKeys(text);
    }

    public static void enterText(WebElement element, String text, boolean needClear) {
        waitToBeClickable(element, Duration.ofSeconds(10));
        if (needClear) {
            element.clear();
        }
        element.sendKeys(text);
    }

    public static boolean isElementPresent(WebElement webElement) {
        boolean elementFound = false;
        waitToBeVisible(webElement, Duration.ofSeconds(10));
        if (webElement.isDisplayed()) {
            elementFound = true;
        }
        return elementFound;
    }

    public static void waitToBeVisible(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitToBeClickable(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver) Driver.getDriver();
        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))"));

        tapOn(driver.findElement(By.xpath("//android.widget.TextView[@text='" + elementText + "']")));
    }

    public static void tap(AppiumDriver driver, WebElement element) {
        Point location = element.getLocation();
        Dimension size = element.getSize();

        Point centerOfElement = getCenterOfElement(location, size);

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(100)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));
    }

    public static void doubleTap(AppiumDriver driver, WebElement element) {
        Point location = element.getLocation();
        Dimension size = element.getSize();

        Point centerOfElement = getCenterOfElement(location, size);

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(100)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(100)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));

    }

    public static void longTap(AppiumDriver driver, WebElement element) {
        Point location = element.getLocation();
        Dimension size = element.getSize();

        Point centerOfElement = getCenterOfElement(location, size);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

        Sequence sequence = new Sequence(finger1, 1).
                addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement)).
                addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg())).
                addAction(new Pause(finger1, Duration.ofSeconds(4))).
                addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));
    }

    public static void scroll(AppiumDriver driver, int scroll) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2 ;
        int startY = size.getHeight() / 2 ;
        int endX = startX;
        int endY = (int) (size.getHeight()*0.25);
        //buradaki 0,25 şu şekildedir; imleç ekranın ortasında yani 0,50 de,
        // y ekseninde 0,25 seçtiğimizde 0,50 den 0,25 e çekiyor yani aşağı  kayıyor.
        // Eğer 0,75 deseydik ters yönde  kaydıracaktı. Ne kadar kaydıracağı ise değişiyor.


        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

        for (int i = 0; i <scroll ; i++) {
        Sequence sequence = new Sequence(finger1,1).
                addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), startX, startY)).
                addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg())).
                addAction(new Pause(finger1, Duration.ofMillis(100))).
                addAction(finger1.createPointerMove(Duration.ofMillis(300),PointerInput.Origin.viewport(),endX,endY)).
                addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));}
        Thread.sleep(3000);
    }
    public static void swipePictures(AndroidDriver driver, WebElement element, String direction) {

        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", direction, //left veya right olmalıdır
                "percent", 1,//1 den büyük olamaz. 0.3 olunca kaydırılacak alanın 1/3 ü kadar kaydıracak
                "speed", 500
        ));
        wait(1);
    }

    //Sağa kaydırma
    public static void swipe(AppiumDriver driver, int scroll) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2 ;
        int startY = size.getHeight() / 2 ;
        int endX = (int) (size.getWidth()*0.01);
        int endY = startY;
        //buradaki 0,25 şu şekildedir; imleç ekranın ortasında yani 0,50 de,
        // x ekseninde 0,25 seçtiğimizde 0,50 den 0,25 e çekiyor yani sola  kayıyor.
        // Eğer 0,75 deseydik ters yönde  kaydıracaktı. Ne kadar kaydıracağı ise değişiyor.


        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

        for (int i = 0; i <scroll ; i++) {
            Sequence sequence = new Sequence(finger1,1).
                    addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), startX, startY)).
                    addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg())).
                    addAction(new Pause(finger1, Duration.ofMillis(100))).
                    addAction(finger1.createPointerMove(Duration.ofMillis(400),PointerInput.Origin.viewport(),endX,endY)).
                    addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            driver.perform(Collections.singletonList(sequence));}
        Thread.sleep(3000);
    }

    public static void dragAndDrop(AppiumDriver driver, WebElement element1, WebElement element2){

        Point sourceCenter = getCenterOfElement(element1.getLocation(), element1.getSize());
        Point targetCenter = getCenterOfElement(element2.getLocation(), element2.getSize());

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        Sequence sequence = new Sequence(finger,1).
                addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), sourceCenter)).
                addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())).
                addAction(new Pause(finger, Duration.ofMillis(200))).
                addAction(finger.createPointerMove(Duration.ofMillis(3000), PointerInput.Origin.viewport(), targetCenter)).
                addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));
    }

    private static Point getCenterOfElement(Point location, Dimension size){
        return new Point(location.getX() + size.getWidth() /2,
                location.getY() + size.getHeight() /2);
    }

    public static  void tabOnElementWithText(String text) throws InterruptedException {

        List<WebElement> elements = Driver.getDriver().findElements(AppiumBy.className("android.widget.TextView"));

        for (WebElement element : elements) {
            System.out.println("element.getText() = " + element.getText());
            if (element.getText().contains(text)) {
                System.out.println("element.getText()111 = " + element.getText());
                element.click();
                break;
            } else ReusableMethods.scroll(Driver.getDriver(), 1);

        }

    }

    public static void backToPreScreen(){
        Driver.getDriver().navigate().back();
    }

    /**
     * Bu method locate alanlarında class tag name i aynı olan elementlerin attirubute isimlerinde farklılık varsa
     * farklı olan kısımlarını text parametresi ile locate alanına bir loop içinde ekleyip,
     * tek locate ile bütün elementleri gezmemizi sağlar. Byrada gezilen elementlerin assertion ları yapılmaktadır.
     * @param text :buraya attirubute alanınıdaki farklı text ler yazılır.
     * @throws InterruptedException
     */
    public static  void isElementVisibleWithText(String text) throws InterruptedException {

        List<WebElement> elements = Driver.getDriver().findElements(AppiumBy.className("android.widget.TextView"));

        for (WebElement element : elements) {
            System.out.println("element.getText() = " + element.getText());
            if (element.getText().contains(text)) {
                System.out.println("element.getText()111 = " + element.getText());

                Assert.assertTrue(isElementPresent(element));
                break;
            } else scroll(Driver.getDriver(), 1);
            break;
        }

    }
    public static void getScreenshot() throws IOException {
        //after verification take screenshot
        //I use this code to take a screenshot when needed
        // naming the screenshot with the current date to avoid duplication

        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);

        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + date + ".png";
        File finalDestination = new File(target);

        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
    }
    public static void validateCompabilitiyOfSubTitleWithTheTitle(String subTitle, String title) throws IOException {
        //Title alanı birden fazla mainword içeriyorsa  ayırıyoruz
        String[] titleElements = title.split(" ");
        for (int i = 0; i < titleElements.length; i++) {
            System.out.println("subtitle :" + subTitle);
            System.out.println("i :" + titleElements[i]);
            System.out.println("i+1 :" + titleElements[i + 1]);
            if (subTitle.contains(titleElements[i])) {
                Assert.assertTrue(subTitle.contains(titleElements[i]));
                System.out.println("sub title :" + subTitle + " başlık " + titleElements[i] + " kapsıyor");
                break;
            } else if (subTitle.contains(titleElements[i + 1])) {
                Assert.assertTrue(subTitle.contains(titleElements[i + 1]));
                System.out.println("sub title :" + subTitle + " başlık " + titleElements[i + 1] + " kapsıyor");
                break;
            } else System.out.println("subtitle :" + subTitle + " başlık değerlerini KAPSAMIYOR");
            getScreenshot();
            Assert.assertTrue(false);
        }
    }

    /**
     * Bu method Sıralama seçenekleri arasında 'Pahalıdan Ucuza' veya 'Ucuzdan Pahalıya'
     * şeklindeki parametreler ile sıralanan ürünlerin doğru şekilde görüntülenip görüntülenmediğini doğrular
     * @param option alanına 'Pahalıdan Ucuza' veya 'Ucuzdan Pahalıya' gelmelidir.
     */
    public static void validateProductsSortingByPrice(String option)  {
        List<WebElement> priceList1= Driver.getDriver().findElements(By.id(("com.mobisoft.kitapyurdu:id/textViewLeftPrice")));
        int sizeOfList=priceList1.size();


        if(option.equals("Ucuzdan Pahalıya")){


                for (int n = 0; n < priceList1.size()-1; n++) {
                    String price1 = priceList1.get(n).getText().replace("TL","").replace(",",".").trim();
                    System.out.println("price1 = " + price1);
                    String price2 = priceList1.get(n+1).getText().replace("TL","").replace(",",".").trim();
                    System.out.println("price2 = " + price2);
                    double first= parseDouble(price1);
                    double second= parseDouble(price2);
                    Assert.assertTrue(first<=second);

            }

        } else if (option.equals("Pahalıdan Ucuza")) {



                for (int n = 0; n < priceList1.size()-1; n++) {
                    String price1 = priceList1.get(n).getText().replace("TL","").replace(",",".").trim();
                    System.out.println("price1 = " + price1);
                    String price2 = priceList1.get(n+1).getText().replace("TL","").replace(",",".").trim();
                    System.out.println("price2 = " + price2);
                    double first= parseDouble(price1);
                    double second= parseDouble(price2);
                    Assert.assertTrue(first>=second);

            }
        } else System.out.println("Parametreniz hatalı olabilir, Kontrol edin");

    }


    /**
     * Bu metot sayfadaki ürünlerin texlerini tek tek alıp Set içine koyar. Scroll yaparak aşağıya iner.
     * Son ürünü de aldıktan sonra kapanır.
     * @param locate Ürün sayısını gösteren text elementinin locate'dir. Xpath olarak verirseniz metinden
     *               sadece sayıyı alıp Set'in size ile karşılaştırır.
     * @throws InterruptedException
     */
    public static void urunDogrula(String locate) throws InterruptedException {
        Set<String> elements = new HashSet();
        List<WebElement> list = null;
        String count = Driver.getDriver().findElement(By.xpath(locate)).getAttribute("text");
        Integer expectedElementSize = Integer.parseInt(count.replaceAll("[^0-9]", ""));
        System.out.println("count = " + expectedElementSize);
        Integer actualElementSize = -1;

        int size=0;
        do {
            for(size = 0; size < 4; ++size) {
                try {
                    list = Driver.getDriver().findElements(By.xpath("//android.widget.TextView[@resource-id='com.mobisoft.kitapyurdu:id/textViewProductName']"));
                    elements.add(((WebElement)list.get(size)).getAttribute("text"));
                } catch (Exception var7) {
                }
            }

            if (expectedElementSize.equals(actualElementSize)) {
                break;
            }

            scroll(Driver.getDriver(), 1);
            actualElementSize = elements.size();


        } while(actualElementSize != expectedElementSize);
        System.out.println("actualElementSize = " + actualElementSize);
        System.out.println("expectedElementSize = " + expectedElementSize);

        Assert.assertEquals(actualElementSize , expectedElementSize);
    }
    public static void raporuAc(){
        // Rapor dosyasının tam yolu
        String raporYolu = "C:\\Users\\Lenovo\\IdeaProjects\\Appium_KitapYurdu_Project\\raporlar\\CucumberRapor.html";

        try {
            // Google Chrome'un çalıştırılması
            String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
            String command = chromePath + " " + raporYolu;
            Process process = Runtime.getRuntime().exec(command);

            // İşlemi bekleyin
            process.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void bekle(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            System.out.println("Bekleme yapilamadi");
            throw new RuntimeException(e);
        }
    }


}












