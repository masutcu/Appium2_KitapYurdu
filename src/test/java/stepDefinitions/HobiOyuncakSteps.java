package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.opentelemetry.api.internal.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import screens.androidScreen.Hobies;
import utils.Driver;
import utils.ReusableMethods;

import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class HobiOyuncakSteps extends ReusableMethods {
    Hobies hobies = new Hobies();
    ReusableMethods reusableMethods = new ReusableMethods();

    @Given("APP yuklensin")
    public void app_yuklensin() {
        Driver.getDriver();
    }

    @Given("Kullanici katagorilere tiklar")
    public void kullanici_katagorilere_tiklar() {
        hobies.kategorilerMenu.click();
    }

    @Given("kullanici Hobi ve Oyuncak bolumune tiklar")
    public void kullanici_hobi_ve_oyuncak_bolumune_tiklar() {

        hobies.hobiesMenu.click();
    }

    @And("Hobi ve Oyuncak bolumunde içerikler olduğu doğrulanır.")
    public void hobiVeOyuncakBolumundeIçeriklerOlduğuDoğrulanır() {
        hobies.educationalgames.isDisplayed();
        reusableMethods.wait(2);
        hobies.funtoy.isDisplayed();
        reusableMethods.wait(2);
        hobies.forchild.isDisplayed();
        reusableMethods.wait(2);
        hobies.wisdomgame.isDisplayed();
        reusableMethods.wait(2);
        hobies.woodentoy.isDisplayed();

    }



}