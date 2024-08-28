package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.Screens;
import screens.androidScreen.AhsapScreen;
import screens.androidScreen.CategoriesScreen;
import utils.Driver;

public class Ahsap_Products_Steps  {
    CategoriesScreen categoriesScreen = new CategoriesScreen();
    AhsapScreen ahsapScreen = new AhsapScreen();

    @Given("Went_To_Kitap_Yurdu_App")
    public void went_to_kitap_yurdu_app() {
        Driver.getDriver();
    }
    @Then("Click_On_the_Categories_Icon")
    public void click_on_the_categories_ıcon() {
        categoriesScreen.categories.click();
    }
    @Then("Click_On_the_Ahsap_Urunler_Icon")
    public void click_on_the_ahsap_urunler_ıcon() {
    ahsapScreen.ahsap_urunler.click();
    }

    @And("Verify_been_On_the_AhsapUrunler_Page")
    public void verify_been_on_the_ahsapUrunler_page() {
        Assert.assertTrue(ahsapScreen.ahsap_urunler_text.isDisplayed());    }

    @Then("Print_TheNumber_of_KesmeTahtasi")
    public void print_thenumber_of_kesmetahtasi() {
        String ahsap_Urun_Sayisi_Metin = ahsapScreen.ahsap_Urun_Sayisi_Text.getText();
        for (int i = 0; i < ahsap_Urun_Sayisi_Metin.length(); i++) {
            char Ahsap_Urun_Sayisi = ahsap_Urun_Sayisi_Metin.charAt(i);
            if (Character.isDigit(Ahsap_Urun_Sayisi)) {
                System.out.print(Ahsap_Urun_Sayisi + " Adet Kesme Tahtası Bulunmaktadır.");
            }
        }}

    @And("Click_On_the_Kesme_Tahtası_Icon")
    public void click_on_the_kesme_tahtası_ıcon() {
        ahsapScreen.kesme_tahtasi.click();
    }

    @Then("Verify_been_On_the_KesmeTahtası_Page")
    public void verify_been_on_the_kesmetahtası_page() {
        Assert.assertTrue(ahsapScreen.kesme_tahtasi.isDisplayed());

    }
}
