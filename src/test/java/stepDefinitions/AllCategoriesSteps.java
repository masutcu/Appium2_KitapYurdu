package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.Screens;
import utils.ReusableMethods;

public class AllCategoriesSteps extends ReusableMethods {
    Screens screen=new Screens();



    @Then("User validate the screen title -Tüm Kategoriler")
    public void userValidateTheScreenTitleTumKategoriler() {
        Assert.assertTrue(isElementPresent(screen.allCategoriesScreen().allCategoriesTitle));
    }

    @Given("User clicks on {string} in order")
    public void userClicksOnInOrder(String secenek) {
        switch(secenek){
            case "Kitap":
            tapOn(screen.allCategoriesScreen().kitapIcon);
            break;
            case "Dergi":
                tapOn(screen.allCategoriesScreen().dergiIcon);
                break;
            case "Cesitli":
                tapOn(screen.allCategoriesScreen().cesitliIcon);
                break;
            case "Kirtasiye":
                tapOn(screen.allCategoriesScreen().kirtasiyeIcon);
                break;
            case "Hobi ve Oyuncak":
                tapOn(screen.allCategoriesScreen().hobiIcon);
                break;
            case "Puzzle - Yapboz":
                tapOn(screen.allCategoriesScreen().puzzleIcon);
                break;
            case "Aksesuar":
                tapOn(screen.allCategoriesScreen().aksesuarIcon);
                break;
            case "Duvar Aksesuarlari":
                tapOn(screen.allCategoriesScreen().duvarAksesuarlariIcon);
                break;
            case "Ahsap urunler":
                tapOn(screen.allCategoriesScreen().ahsapUrunlerIcon);
                break;
        } wait(2);
    }


    @And("User returns to pre screen")
    public void userReturnsToPreScreen() {
        backToPreScreen();
    }

    @Then("user verifies_ {string}  _visibility")
    public void userVerifies__visibility(String categories) throws InterruptedException {
        isElementVisibleWithText(categories);
    }
}
