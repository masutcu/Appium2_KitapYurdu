package stepDefinitions;

import io.cucumber.java.en.*;
import screens.androidScreen.KitapYurdu;
import utils.Driver;

import static org.junit.Assert.*;
import static screens.androidScreen.KitapYurdu.*;
import static utils.ReusableMethods.scroll;

public class KitapYurdu_StepDefs {
    KitapYurdu kitapYurdu= new KitapYurdu();


    @Given("Kitap Yurdu sitesine gidildi")
    public void kitap_yurdu_sitesine_gidildi() {
        Driver.getDriver();
    }
    @When("Sitede oldugu dogrulandi")
    public void sitede_oldugu_dogrulandi() {
        assertTrue(kitapYurdu.logo.isDisplayed());
    }
    @Then("Search ikonu tiklandi")
    public void search_ikonu_tiklandi() {
        kitapYurdu.searchImage.click();
    }
    @Then("SearchBox {string} kelimesi aratildi")
    public void search_box_kelimesi_aratildi(String text) {
        kitapYurdu.searchBox.sendKeys(text);
    }
    @Then("dagobert kelimesi oldugu dogrulandi")
    public void dagobert_kelimesi_oldugu_dogrulandi() throws InterruptedException {

        scroll(Driver.getDriver(), 1);
        assertTrue(kitapYurdu.dagobert.isDisplayed());
    }


}
