package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

public class MainScreenSteps extends ReusableMethods{

    Screens screen=new Screens();
    @Given("the application is installed")
    public void theApplicationIsInstalled() {
      //  Driver.getDriver();

        //tapOn(screen.allCategoriesScreen().appKitapYurduIcon);

    }


    @Then("User clicks on catagories")
    public void userClicksOnCatagories() {
        wait(2);
        tapOn(screen.categoriesScreen().categories);
        wait(2);

    }

    @Given("User clicks on Various title")
    public void userClicksOnVariousTitle() {

        tapOn(screen.categoriesScreen().variousIcon);
    }


    @And("User waits_ {int} _seconds")
    public void userWaits__seconds(int seconds) {
        wait(seconds);
    }



}

