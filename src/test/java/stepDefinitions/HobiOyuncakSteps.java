package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.opentelemetry.api.internal.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import screens.androidScreen.Hobies;
import utils.Driver;
import utils.ReusableMethods;

import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class HobiOyuncakSteps extends ReusableMethods {
    Hobies hobies = new Hobies();
    ReusableMethods reusableMethods = new ReusableMethods();

    @Given("APP yuklensin")
    public void app_yuklensin() {
        Driver.getDriver();
    }

    @Given("Kullanici katagorilere tiklar")
    public void kullanici_katagorilere_tiklar() {
        hobies.kategorilerMenu.click();
    }

    @Given("kullanici Hobi ve Oyuncak bolumune tiklar")
    public void kullanici_hobi_ve_oyuncak_bolumune_tiklar() {

        hobies.hobiesMenu.click();
    }

    @And("Hobi ve Oyuncak bolumunde içerikler olduğu doğrulanır.")
    public void hobiVeOyuncakBolumundeIçeriklerOlduğuDoğrulanır() {
        hobies.educationalgames.isDisplayed();
        reusableMethods.wait(2);
        hobies.funtoy.isDisplayed();
        reusableMethods.wait(2);
        hobies.forchild.isDisplayed();
        reusableMethods.wait(2);
        hobies.wisdomgame.isDisplayed();
        reusableMethods.wait(2);
        hobies.woodentoy.isDisplayed();

    }


    @And("Kategorilerde {string} bölümünde toplam ürün sayısı doğrulanır")
    public void kategorilerdeBölümündeToplamÜrünSayısıDoğrulanır(String secenek) throws InterruptedException {

        switch (secenek) {
            case "Egitici ve Ogretici Oyunlar":
                hobies.educationalgames.click();


                reusableMethods.wait(2);
                String text = hobies.count.getText();
                System.out.println("text = " + text);

                String[] textword = text.split(" ");

                String firstWord = textword[0];

                // String'i integer'a çevirme
                int sayi = Integer.parseInt(firstWord);

                System.out.println("İlk kelime: " + firstWord);
                List<WebElement> resim = Driver.getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id='com.mobisoft.kitapyurdu:id/productImage']"));
                System.out.println("resim.size() = " + resim.size());
                Assert.assertEquals(resim.size(), sayi);
            case "Büyükler icin":
                hobies.foradult.click();
                reusableMethods.wait(2);
                String text1 = hobies.count.getText();
                System.out.println("text1 = " + text1);

                String[] textword1 = text1.split(" ");

                String firstWord1 = textword1[0];

                // String'i integer'a çevirme
                int sayi1 = Integer.parseInt(firstWord1);

                System.out.println("İlk kelime: " + firstWord1);
                List<WebElement> resim1 = Driver.getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id='com.mobisoft.kitapyurdu:id/productImage']"));
                System.out.println("resim.size() = " + resim1.size());
                Assert.assertEquals(resim1.size(), sayi1);
            case "Ahsap Oyuncak":
                hobies.woodentoy.click();
                reusableMethods.wait(2);
                String text2 = hobies.count.getText();
                System.out.println("text2 = " + text2);

                String[] textword2 = text2.split(" ");

                String firstWord2 = textword2[0];

                // String'i integer'a çevirme
                int sayi2 = Integer.parseInt(firstWord2);
                List<WebElement> resim2;

                do{ System.out.println("İlk kelime: " + firstWord2);
                    resim2 = Driver.getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id='com.mobisoft.kitapyurdu:id/productImage']"));
                    System.out.println("resim.size() = " + resim2.size());
                    ReusableMethods.wait(5);
                    ReusableMethods.scroll(Driver.getDriver(),1);
                    ReusableMethods.wait(5);
                }while (resim2.size()==sayi2);

                Assert.assertEquals(resim2.size(), sayi2);

        }
//        hobies.foradult.click();
//        reusableMethods.wait(2);
//        String text=hobies.count.getText();
//        System.out.println("text = " + text);
//
//        String[] textword=text.split(" ");
//
//        String firstWord = textword[0];
//
//        // String'i integer'a çevirme
//        int sayi = Integer.parseInt(firstWord);
//
//        System.out.println("İlk kelime: " + firstWord);
//        List<WebElement> resim=Driver.getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id='com.mobisoft.kitapyurdu:id/productImage']"));
//        System.out.println("resim.size() = " + resim.size());
//        Assert.assertEquals(resim.size(),sayi);
    }

}