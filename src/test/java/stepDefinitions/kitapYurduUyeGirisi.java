package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.*;


import screens.Screens;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utils.ReusableMethods.*;

public class kitapYurduUyeGirisi {
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

}
