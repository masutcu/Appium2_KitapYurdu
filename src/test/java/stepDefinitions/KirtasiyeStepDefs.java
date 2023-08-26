package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

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

        for (WebElement resim: screens.kirtasiyeScreens().urunResimleri){
            Assert.assertTrue(isElementPresent(resim));
        }
    }

    @Then("kullanici urun fiyatlarini gorur")
    public void kullaniciUrunFiyatlariniGorur() {
        for (WebElement fiyat: screens.kirtasiyeScreens().urunfiyatlari){
            Assert.assertTrue(isElementPresent(fiyat));
        }
    }

    @Then("kullanici sepete ekle butonlarini gorur")
    public void kullaniciSepeteEkleButonlariniGorur() {
        for (WebElement sepet: screens.kirtasiyeScreens().sepetButtons){
            Assert.assertTrue(isElementPresent(sepet));
        }
    }
}

