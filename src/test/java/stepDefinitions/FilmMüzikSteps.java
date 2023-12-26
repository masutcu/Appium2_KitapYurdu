package stepDefinitions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FilmMüzikSteps extends ReusableMethods {
    Screens screen=new Screens();
    ScreenshotStepDefs screenshotStepDefs=new ScreenshotStepDefs();




    @When("validate compatibility of subTitle with the title_{string}")
    public void validateCompatibilityOfSubTitleWithTheTitle_(String title) throws InterruptedException, IOException {
        SoftAssert softAssert=new SoftAssert(); //SoftAssert yapmak için TestNG kütüphanesi pom.xml e eklendi

        //Title alanı birden fazla mainword içeriyorsa  ayırıyoruz
        String []titleElements=title.split(" ");

        //subtitle locatelerinden textleri list içine alıp title ile karşılaştırıyoruz
        List<WebElement> subTitleElements = Driver.getDriver().
                findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.mobisoft.kitapyurdu:id/textViewCategoryName']"));

        for (WebElement element : subTitleElements) {
            System.out.println("alt başlık = " + element.getText());
            for(int i=0; i<=titleElements.length-1; i++ ) {
                System.out.println("başlık1  :" + titleElements[i]);
                System.out.println("başlık2  :" + titleElements[i+1]);
                if (element.getText().toLowerCase().contains(titleElements[i].toLowerCase())) {
                    System.out.println("subTitle " + element.getText() + " :   başlıkla uyumludur");
                    softAssert.assertTrue(element.getText().contains(titleElements[i]));
                    break;
                } else if (element.getText().toLowerCase().contains(titleElements[i+1].toLowerCase())) {
                    System.out.println("subTitle " + element.getText() + " :   başlıkla uyumludur");
                    softAssert.assertTrue(element.getText().contains(titleElements[i+1]));
                    break;

                }else System.out.println("subtitle :"+element.getText()+" başlık değerlerini KAPSAMIYOR");
                getScreenshot();
                softAssert.assertTrue(false);
                System.out.println("subTitle" + element.getText() + "   başlıkla uyumlu DEĞİLDİR");
            }

        }softAssert.assertAll();

    }


    @When("validate compatibility of {string} with the title_{string}")
    public void validateCompatibilityOfWithTheTitle_(String subTitle, String title ) throws IOException {
        validateCompabilitiyOfSubTitleWithTheTitle(subTitle,title);

    }
}
