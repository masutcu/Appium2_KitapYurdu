package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

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

        //urunDogrula("//android.widget.TextView[@resource-id='com.mobisoft.kitapyurdu:id/count']");

        //System.out.println("toplamUrunSayisi() = " + toplamUrunSayisi());
/*
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

            scroll(Driver.getDriver(),1);

            b = urunListesi.size();

        } while (a < b);

        System.out.println("TOPLAM URUN SAYISI: " + urunListesi.size());
        urunListesi.forEach(System.out::println);

        METOT:

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
}

