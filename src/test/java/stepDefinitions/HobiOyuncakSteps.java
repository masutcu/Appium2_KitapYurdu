package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.opentelemetry.api.internal.Utils;
import org.junit.Assert;
import screens.androidScreen.Hobies;
import utils.Driver;
import utils.ReusableMethods;

import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HobiOyuncakSteps {
    Hobies hobies=new Hobies();
    ReusableMethods reusableMethods=new ReusableMethods();
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

    @And("Büyükler için bölümünde ürün sayısı doğrulanır.")
    public void büyüklerIçinBölümündeÜrünSayısıDoğrulanır() {
        hobies.foradult.click();
        reusableMethods.wait(3);
String text=hobies.count.getText();
        System.out.println("text = " + text);

        String[] textword=text.split(" ");

        String firstWord = textword[0];
        System.out.println("İlk kelime: " + firstWord);
        Assert.assertTrue(firstWord.equals("24"));
        }
    }

