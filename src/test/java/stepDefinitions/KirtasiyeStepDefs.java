package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static utils.ReusableMethods.*;

public class KirtasiyeStepDefs {

    Screens screens = new Screens();

    @Given("App yuklensin")
    public void appYuklensin() {
        Driver.getDriver();
        ReusableMethods.wait(3);
    }

    @And("kullanici katagorilere tiklar")
    public void kullaniciKatagorilereTiklar() {
        tapOn(screens.kirtasiyeScreens().kategorilerMenu);
    }

    @And("kullanici kirtasiye bolumune tiklar")
    public void kullaniciKirtasiyeBolumuneTiklar() {
        tapOn(screens.kirtasiyeScreens().kirtasiyeButton);
    }

    @Then("kullaici kirtasiye bolumunde")
    public void kullaiciKirtasiyeBolumunde() {
        Assert.assertTrue(isElementPresent("Kırtasiye"));
    }

    @And("kullanici {string} alanlarina sirayla tiklar")
    public void kullaniciAlanlarinaSiraylaTiklar(String text) throws InterruptedException {
        tapOnElementWithText(text);
    }

    @And("kullanici onceki sayfaya geri doner")
    public void kullaniciOncekiSayfayaGeriDoner() {

        backToPreScreen();
    }

    @And("kullanici {string} bilgilerini dogrular")
    public void kullaniciBilgileriniDogrular(String text) {

        Assert.assertTrue(isElementPresent(text));
    }

    @And("kullanici {string} butonuna tiklar")
    public void kullaniciButonunaTiklar(String text) {
        tapOnElementWithText(text);
    }

    @Then("kullanici urun resimlerini gorur")
    public void kullaniciUrunResimleriniGorur() {

        for (WebElement resim : screens.kirtasiyeScreens().urunResimleri) {
            Assert.assertTrue(isElementPresent(resim));
        }
    }

    @Then("kullanici urun fiyatlarini gorur")
    public void kullaniciUrunFiyatlariniGorur() {
        for (WebElement fiyat : screens.kirtasiyeScreens().urunfiyatlari) {
            Assert.assertTrue(isElementPresent(fiyat));
        }
    }

    @Then("kullanici sepete ekle butonlarini gorur")
    public void kullaniciSepeteEkleButonlariniGorur() {
        for (WebElement sepet : screens.kirtasiyeScreens().sepetButtons) {
            Assert.assertTrue(isElementPresent(sepet));
        }
    }

    @When("kullanici bir urundeki fovori butonuna basar")
    public void kullaniciBirUrundekiFovoriButonunaBasar() {
        tapOn(screens.kirtasiyeScreens().favoriteButton);
    }

    @And("kullanici {string} uyarisini gorur")
    public void kullaniciUyarisiniGorur(String text) {
        String message = screens.kirtasiyeScreens().popUpMessage.getAttribute("name").toLowerCase();
        Assert.assertTrue(message.contains(text.toLowerCase()));
        System.out.println("tam mesaj = " + message);
    }

    @Then("kullanici kitap sayisini dogrular")
    public void kullaniciKitapSayisiniDogrular() throws InterruptedException {

        List<String> urunListesi = new ArrayList<>();

        int a = 0;
        int b = 0;

        do {
            a = urunListesi.size();

            for (int i = 0; i < screens.kirtasiyeScreens().urunlerWebElements.size(); i++) {

                if (!urunListesi.contains(screens.kirtasiyeScreens().urunlerWebElements.get(i).getText())) {
                    urunListesi.add(screens.kirtasiyeScreens().urunlerWebElements.get(i).getText());
                }
            }

            scroll(Driver.getDriver(), 1);

            b = urunListesi.size();

        } while (a < b);

        System.out.println("TOPLAM URUN SAYISI: " + urunListesi.size());

        urunListesi.forEach(System.out::println);

        int expectedUrunSayisi = parseInt(screens.kirtasiyeScreens().expectedUrunSayisi.getText().replaceAll("[\\D]", ""));

        Assert.assertEquals(expectedUrunSayisi, urunListesi.size());
/*
        METOT OLARAK:

         public static int toplamUrunSayisi() throws InterruptedException {

        List<WebElement> urunlerWebElements;

        List<String> urunListesi = new ArrayList<>();

        int a = 0;
        int b = 0;

        do {
            urunlerWebElements = Driver.getDriver().findElements(By.id("com.mobisoft.kitapyurdu:id/textViewProductName"));

            a = urunListesi.size();

            for (int i = 0; i < urunlerWebElements.size(); i++) {

                if (!urunListesi.contains(urunlerWebElements.get(i).getText())) {
                    urunListesi.add(urunlerWebElements.get(i).getText());
                }
            }

            scroll(Driver.getDriver(), 1);

            b = urunListesi.size();

        } while (a < b);

        System.out.println("TOPLAM URUN SAYISI: " + urunListesi.size());
        urunListesi.forEach(System.out::println);

        return urunListesi.size();
    }

 */
    }

    Integer randomMin;
    Integer randomMax;

    @And("kullanici en az ve en cok bolumleri random doldurur")
    public void kullaniciEnAzVeEnCokBolumleriRandomDoldurur() {

        randomMin = (int) (Math.random() * 2 + 30);
        System.out.println(randomMin);
        screens.kirtasiyeScreens().minValue.sendKeys(randomMin.toString());

        randomMax = randomMin + 30;
        System.out.println(randomMax);
        screens.kirtasiyeScreens().maxValue.sendKeys(randomMax.toString());

        screens.kirtasiyeScreens().okButtonFiltre.click();
    }

    @Then("kullanici urunleri girilen fiyat araliginda oldugunu gorur")
    public void kullaniciUrunleriGirilenFiyatAraligindaOldugunuGorur() throws InterruptedException {

        List<String> urunListesi = new ArrayList<>();

        int a = 0;
        int b = 0;

        do {
            a = urunListesi.size();

            for (int i = 0; i < screens.kirtasiyeScreens().urunlerinFiyatlari.size(); i++) {

                if (!urunListesi.contains(screens.kirtasiyeScreens().urunlerinFiyatlari.get(i).getText())) {
                    urunListesi.add(screens.kirtasiyeScreens().urunlerinFiyatlari.get(i).getText());
                }
            }

            scroll(Driver.getDriver(), 1);

            b = urunListesi.size();

        } while (a < b);

        urunListesi.forEach(System.out::println);

        List<Integer> urunFiyatListesi = urunListesi.stream().map(s -> s.replaceAll("[^0-9.]", "")).map(Integer::parseInt).collect(Collectors.toList());

        urunFiyatListesi.forEach(System.out::println);
        System.out.println("randomMin = " + randomMin*100);
        System.out.println("randomMax = " + randomMax*100);

        for (int i=0; i< urunFiyatListesi.size(); i++){
            Assert.assertTrue(urunFiyatListesi.get(i)>(randomMin*100));
            Assert.assertTrue(urunFiyatListesi.get(i)<(randomMax*100));
        }

    }

    //Uruleri Sıralama Doğrulama Metotu:
        /*
        public static void siralamadogrulama(String siralamaCinsi,String locateById) throws InterruptedException {

        List<WebElement> urunlerWebElements;

        List<String> urunListesi = new ArrayList<>();

        int a = 0;
        int b = 0;

        do {
            urunlerWebElements = Driver.getDriver().findElements(By.id(locateById));

            a = urunListesi.size();

            for (int i = 0; i < urunlerWebElements.size(); i++) {

                if (!urunListesi.contains(urunlerWebElements.get(i).getText())) {
                    urunListesi.add(urunlerWebElements.get(i).getText());
                }
            }

            scroll(Driver.getDriver(), 1);

            b = urunListesi.size();

        } while (a < b);

        if (siralamaCinsi.equalsIgnoreCase("ucuzdan pahalıya")){

            for (int i=0; i<urunListesi.size()-1; i++) {

               int first = parseInt(urunListesi.get(i).trim().replaceAll("[\\D]",""));
               System.out.println("first = " + first);
               int second = parseInt(urunListesi.get(i+1).trim().replaceAll("[\\D]",""));
               System.out.println("second = " + second);

               Assert.assertTrue(first<=second);

            }
        }else if (siralamaCinsi.equalsIgnoreCase("pahalıdan ucuza")){

            for (int i=0; i<urunListesi.size()-1; i++) {

                int first = parseInt(urunListesi.get(i).trim().replaceAll("[\\D]",""));
                System.out.println("first = " + first);
                int second = parseInt(urunListesi.get(i+1).trim().replaceAll("[\\D]",""));
                System.out.println("second = " + second);

                Assert.assertTrue(first>=second);}


        }else if(siralamaCinsi.equalsIgnoreCase("alfabetik")){

            /*

            System.out.println("urunListesi = " + urunListesi);

            List<String> ilkHali = new ArrayList<>(urunListesi);

            Collections.sort(urunListesi);
            System.out.println("urunListesi = " + urunListesi);

            //Assert.assertTrue(ilkHali.equals(urunListesi));

    }else {
        System.out.println("Bu şekilde bir sıralama cinsi yok");
    }

        System.out.println("urunListesi.size() = " + urunListesi.size());

}
*/
}




