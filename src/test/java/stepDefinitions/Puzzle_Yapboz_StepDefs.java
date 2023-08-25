package stepDefinitions;

import io.cucumber.java.en.*;
import screens.androidScreen.KitapYurdu;
import screens.androidScreen.Puzzle_Yapboz_Screen;
import utils.Driver;

import java.time.Duration;

import static org.junit.Assert.*;
import static utils.ReusableMethods.*;

public class Puzzle_Yapboz_StepDefs extends KitapYurdu {

    Puzzle_Yapboz_Screen kitapYurdu=new Puzzle_Yapboz_Screen();
    @Then("Kitap Yurdu sitesine gidildigi dogrulandi")
    public void kitap_yurdu_sitesine_gidildigi_dogrulandi() {
        Driver.getDriver();
    }

    @When("Kategoriler ikonu tiklandi")
    public void kategoriler_ikonu_tiklandi() {
        kitapYurdu.kategoriler.click();
    }
    @And("{string} bolumunde oldugu dogrulandi")
    public void bolumundeOlduguDogrulandi(String string) {
        switch (string){
            case "Kategoriler":
                assertTrue(kitapYurdu.tumKategoriler.isDisplayed());
                break;
                case "Puzzle Yapboz":
                assertTrue(kitapYurdu.puzzleYapbozTitle.isDisplayed());
                break;
            case "Ahşap Puzzle":
                assertTrue(kitapYurdu.ahsapPuzzleTitle.isDisplayed());
                break;
            case "300 Parça":
                assertTrue(kitapYurdu.ucyuzParcaTitle.isDisplayed());
                break;
            default:
                break;
        }

    }


    @Then("{string} menusu tiklandi")
    public void menusuTiklandi(String string) throws InterruptedException {
        switch (string) {
            case "Puzzle Yapboz":
                wait(15);
            kitapYurdu.puzzleYapboz.click();
                break;
            case "Ahsap Puzzle":
                wait(15);
            kitapYurdu.ahsapPuzzleMenu.click();
                break;
            case "300 Parça":
                wait(15);
            kitapYurdu.ucyuzParcaMenu.click();
                break;
            default:
                break;

        }
    }

    @And("{string} menusunun gorundugu dogrulandi")
    public void menusununGorunduguDogrulandi(String string) {
        switch (string) {
            case "Ahşap Puzzle":

                break;
            case "Ahsap Puzzle":

                break;
            case "300 Parça":

                break;
            default:
                break;

        }

    }
}
