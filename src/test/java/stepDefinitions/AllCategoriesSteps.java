package stepDefinitions;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.util.List;

import static java.lang.Double.parseDouble;

public class AllCategoriesSteps extends ReusableMethods {
    Screens screen = new Screens();


    @Then("User validate the screen title -Tüm Kategoriler")
    public void userValidateTheScreenTitleTumKategoriler() {
        Assert.assertTrue(isElementPresent(screen.allCategoriesScreen().allCategoriesTitle));
    }

    @Given("User clicks on {string} in order")
    public void userClicksOnInOrder(String secenek) {
        tapOn(screen.categoriesScreen().categories);
        wait(2);

        switch (secenek) {
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
        }
        wait(2);
        backToPreScreen();
        wait(2);
    }


    @And("User returns to pre screen")
    public void userReturnsToPreScreen() {
        backToPreScreen();
    }


    @Then("verifies_ {string}  _visibility")
    public void verifies__visibility(String categories) throws InterruptedException {
        isElementVisibleWithText(categories);
    }


    @Then("User clicks on filmTitle")
    public void userClicksOnFilmTitle() {
        tapOn(screen.variousScreen().filmTitle);
    }

    @Then("User clicks on cdTitle")
    public void userClicksOnCdTitle() {
        tapOn(screen.variousScreen().cdTitle);
    }


    @Given("User cliks on _Tüm Ürünleri Göster_")
    public void userCliksOn_TumUrunleriGoster_() {
        tapOn(screen.cdScreen().tumUrunleriGoster);
    }

    @Then("User clicks on orderButton")
    public void userClicksOnOrderButton() {
        tapOn(screen.cdScreen().orderButton);
    }


    @And("validete  all order options are display and un-selected")
    public void valideteAllOrderOptionsAreDisplayAndUnSelected() {
        List<WebElement> options = screen.cdScreen().orderOptions;
        System.out.println("options.get(1).getText() = " + options.get(1).getText());

        for (WebElement option : options) {
            System.out.println(option.getText());
            wait(1);
            Assert.assertTrue(option.isDisplayed());
            System.out.println(option.getText()+" görüntüleniyor");
            Assert.assertFalse(option.isSelected());
            System.out.println(option.getText()+" seçili değildir");

        }

    }


    @Then("validate the products ranking {string}")
    public void validateTheProductsRanking(String arg0) {
        tapOnElementWithText(arg0);
        validateProductsSortingByPrice(arg0);
    }

    @And("scroll page")
    public void scrollPage() throws InterruptedException {
        scroll(Driver.getDriver(),1);
        wait(2);
    }

    @Then("User clicks on aksesuar title")
    public void userClicksOnAksesuarTitle() {
        tapOnElementWithText("Aksesuar");
        wait(1);
    }

    @And("User clicks on Kupa Ve Bardak title")
    public void userClicksOnKupaVeBardakTitle() {
        tapOnElementWithText("Kupa ve Bardak");
        wait(1);
    }

    @And("User clicks on Kitap Kurdu title")
    public void userClicksOnKitapKurduTitle() {
        tapOnElementWithText("Kitap Kurdu");
        wait(1);
    }

    @And("User clicks on first product")
    public void userClicksOnFirstProduct() {
    tapOn(screen.cdScreen().productList.get(1));
        wait(1);

    }

    @Then("scroll horizantal")
    public void scrollHorizantal() throws InterruptedException {
        swipe(Driver.getDriver(),2);
    }

    @Then("swipe pictures {int} times")
    public void swipePicturesTimes(int times) {
        swipePictures(Driver.getDriver(),screen.allCategoriesScreen().bardakPic, "left", times);
        wait(1);
    }
}