package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import screens.Screens;
import screens.androidScreen.Puzzle_Yapboz_Screen;
import utils.Driver;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static utils.ReusableMethods.scroll;


public class Puzzle_Yapboz_StepDefs extends Screens {

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
                kitapYurdu.tumKategoriler.getText().contains("Kategoriler");
                break;
                case "Puzzle Yapboz":
               kitapYurdu.puzzleYapbozTitle.getText().contains("Puzzle");
                break;
            case "Ahşap Puzzle":
                kitapYurdu.ahsapPuzzleTitle.getText().contains("Ahşap Puzzle");
                break;
            case "300 Parça":
                kitapYurdu.ucyuzParcaTitle.getText().contains("300");
                break;
            default:
                break;
        }

    }


    @Then("{string} menusu tiklandi")
    public void menusuTiklandi(String string) throws InterruptedException {
        switch (string) {
            case "Puzzle Yapboz":
            kitapYurdu.puzzleYapboz.click();
                break;
            case "Ahsap Puzzle":
            kitapYurdu.ahsapPuzzleMenu.click();
                break;
            case "300 Parça":
               try {
                   scroll(Driver.getDriver(),1);
               }finally {
                   scroll(Driver.getDriver(),1);
               }
            kitapYurdu.ucyuzParcaMenu.click();
                break;
            case "Lava":
                kitapYurdu.lava.click();
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

    @And("Sayfada yazilan sayida urun oldugu dogrulandi")
    public void sayfadaYazilanSayidaUrunOlduguDogrulandi() throws InterruptedException {

        Set<String > elements= new HashSet<>();
        List<WebElement> list=null;
        int firstSize=0;
        int secondSize=0;


    int scroll = 2;
    for (int i = 0; i < scroll; i++) {
        // Scroll işlemleri burada gerçekleştirilir

        list = Driver.getDriver().findElements(By.xpath("//android.widget.TextView[@resource-id='com.mobisoft.kitapyurdu:id/textViewProductName']"));
        for (int h = 0; h < list.size(); h++) {
                elements.add(list.get(h).getAttribute("text"));
                firstSize=elements.size();

                secondSize=firstSize;
            }
        scroll(Driver.getDriver(), 1);
        scroll++;
        if ((secondSize/2)!=0){
            break;
        }
        }

        System.out.println("elements = " + elements);
        assertTrue(elements.size()==5);
    }

    }

