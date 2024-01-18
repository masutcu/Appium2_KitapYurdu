package screens.androidScreen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class Hobies  {

    public Hobies(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(30)),this);
    }
    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.mobisoft.kitapyurdu:id/icon'])[3]")
    public WebElement kategorilerMenu;
    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.mobisoft.kitapyurdu:id/imageView'])[5]")
    public WebElement hobiesMenu;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Çocuklar İçin Oyun\")")
    public WebElement forchild;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Eğlenceli Oyuncaklar\")")
    public WebElement funtoy;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Eğlenceli Oyuncaklar\")")
    public WebElement wisdomgame;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Eğitici ve Öğretici Oyunlar\")")
    public WebElement educationalgames;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Büyükler İçin Oyun\")")
    public WebElement foradult;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ahşap Oyuncak\")")
    public WebElement woodentoy;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.mobisoft.kitapyurdu:id/count']")
    public WebElement count;
    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.mobisoft.kitapyurdu:id/productImage'])[i]")
    public WebElement urunsayisi;





}
