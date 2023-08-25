package screens.androidScreen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class KitapYurdu {

    public KitapYurdu(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(30)),this);
    }
    @FindBy(xpath = "//android.widget.ImageView[@resource-id='com.mobisoft.kitapyurdu:id/imageViewBigLogo']")
    public WebElement logo;
    @FindBy(xpath = "(//android.widget.ImageView[@checkable='false'])[15]")
    public WebElement searchImage;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"kitap, yazar, yayınevi ara\")")
    public WebElement searchBox;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='dagobert von mikusch']")
    public WebElement dagobert;
}
