package stepDefinitions;

import io.cucumber.java.en.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import screens.Screens;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utils.ReusableMethods.*;

public class Categories_kitapcategories {
    Screens screens = new Screens();

    @Given("kullanici siteye giris yapti")
    public void kullanici_siteye_giris_yapti() {
        Driver.getDriver();
        ReusableMethods.wait(3);
    }

    @And("kullanici siteye girisi dogrulandi")
    public void kullanici_siteye_girisi_dogrulandi() {
        assertTrue(screens.kitapCategories().logo.isEnabled());
    }


    @And("kullanici giris butonuna tiklar")
    public void kullanici_giris_butonuna_tiklar() {
        backToPreScreen();
        bekle(2);
        screens.kitapCategories().hesapButonu.click();

    }

    @And("kullanici {string} girer")
    public void kullanici_girer(String username) {
        screens.kitapCategories().username.sendKeys(ConfigReader.getProperty("uyeGirisiusername"));
    }

    @Given("kullanici {string} gire")
    public void kullanici_gire(String password) {
        screens.kitapCategories().password.sendKeys(ConfigReader.getProperty("uyeGirisipassword"));

    }

    @And("kullanici butona  tiklar")
    public void kullanici_butona_tiklar() {
        screens.kitapCategories().girisbutonu.click();
    }


    @Given("kullanici categories butonuna tikladi")
    public void kullanici_categories_butonuna_tikladi() {
        screens.kitapCategories().categories.click();
    }


    @And("kullanici {string} categoriese tiklar")
    public void kullaniciCategorieseTiklar(String kıtap) throws InterruptedException {
        screens.kitapCategories().kitap.click();

        tapOn(screens.kitapCategories().edebiyat);
     //   assertTrue(screens.kitapCategories().edebiyat.isEnabled());
        backToPreScreen();

        tapOn(screens.kitapCategories().CocukKitabi);
      //  assertTrue(screens.kitapCategories().CocukKitabi.isEnabled());
        backToPreScreen();
        tapOn(screens.kitapCategories().islam);
        backToPreScreen();

        tapOn(screens.kitapCategories().siyaset);
        backToPreScreen();

        tapOn(screens.kitapCategories().tarıh);
        backToPreScreen();

        tapOn(screens.kitapCategories().dıgerDıldekıyayınlar);
        backToPreScreen();

        tapOn(screens.kitapCategories().dersKıtapları);
        backToPreScreen();

        tapOn(screens.kitapCategories().egıtım);
        backToPreScreen();

        tapOn(screens.kitapCategories().orjınaldıl);
        backToPreScreen();
        scroll(Driver.getDriver(),2);
        tapOn(screens.kitapCategories().dıger);
        backToPreScreen();
        //devami gelecek

    }

    @Given("kullanici kitap categorieste oldugu dogrulanir")
    public void kullanici_kitap_categorieste_oldugu_dogrulanir() {
        assertTrue(screens.kitapCategories().kitapTitle.isDisplayed());
    }


    //edebiyat modulu icin stepdef
    @And("kullanici kitap catagoriese tiklar")
    public void kullaniciKitapCatagorieseTiklar() {
        screens.kitapCategories().kitap.click();
        screens.kitapCategories().kitap.isDisplayed();

    }

    @And("kullanici edebiyat bolumune tiklar")
    public void kullaniciEdebiyatBolumuneTiklar() {
        screens.kitapCategories().edebiyat.click();
        screens.kitapCategories().edebiyat.isDisplayed();


    }

    @And("kullanici kac adet kitap oldugunu dogrular")
    public void kullaniciKacAdetKitapOldugunuDogrular() {
        List<WebElement> categoryElements = Driver.getDriver().findElements(By.id("com.mobisoft.kitapyurdu:id/btnGoToProduct")); // Kategorileri temsil eden elementleri seçin

        for (WebElement category : categoryElements) {
           categoryElements.size();
            System.out.println("categoryElements.size() = " + categoryElements.size());
            System.out.println("category.getSize() = " + category.getSize());


        }

    }

    @And("kullanici {string} tiklar")
    public void kullaniciTiklar(String text) throws InterruptedException {
        isElementVisibleWithText(text);
        backToPreScreen();

    }

    //roman bolumu

    @And("kullanici {string} a tiklar")
    public void kullaniciATiklar(String roman) {
        screens.kitapCategories().roman.click();
    }

    @And("kullanici ilk kitapi sepete ekler")
    public void kullaniciIlkKitapiSepeteEkler() {
        screens.kitapCategories().romanilkkitap.click();
        screens.kitapCategories().girisolkayit.click();
        screens.kitapCategories().mail.sendKeys("sibelinko33@gmail.com");
        screens.kitapCategories().sifre.sendKeys("sibelcan33");
        screens.kitapCategories().girisyap.click();
    }



    @And("options alanlarinin gorunurlugunu ve secilebilirligini dogrulanir")
    public void optionsAlanlarininGorunurlugunuVeSecilebilirliginiDogrulanir() throws InterruptedException {
        screens.kitapCategories().sirala.click();
        List<WebElement>options=screens.kitapCategories().siralama;

      //  System.out.println("options.get(0).getText() = " + options.get(0).getText());
        for (WebElement element : options) {

            System.out.println("element = " + element.getText());
            Thread.sleep(1000);
            assertTrue(element.isDisplayed());
            System.out.println( element.getText()+" goruntuleniyor");
            assertFalse(element.isSelected());
            System.out.println( element.getText()+" secili degil");
        }

    }
}
