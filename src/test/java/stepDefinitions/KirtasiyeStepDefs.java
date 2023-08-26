package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;

import static utils.ReusableMethods.*;

public class KirtasiyeStepDefs {

    Screens screens = new Screens();

    @And("kullanici katagorilere tiklar")
    public void kullaniciKatagorilereTiklar() {
        tapOn(screens.kitapYurduKirtasiye().kategorilerMenu);
    }

    @And("kullanici kirtasiye bolumune tiklar")
    public void kullaniciKirtasiyeBolumuneTiklar() {
        tapOn(screens.kitapYurduKirtasiye().kirtasiyeButton);
    }

    @Then("kullaici kirtasiye bolumunde")
    public void kullaiciKirtasiyeBolumunde() {
        Assert.assertTrue(isElementPresent("Kırtasiye"));
    }

    @And("kullanici basliklara sirayla tiklar")
    public void kullaniciBasliklaraSiraylaTiklar() {

    }

    @And("kullanici {string} alanlarina sirayla tiklar")
    public void kullaniciAlanlarinaSiraylaTiklar(String text) throws InterruptedException {
        tapOnElementWithText(text);
    }

    @And("kullanici onceki sayfaya geri doner")
    public void kullaniciOncekiSayfayaGeriDoner() {
        backToPreScreen();
    }

    @Given("App yuklensin")
    public void appYuklensin() {
        Driver.getDriver();
    }
}

