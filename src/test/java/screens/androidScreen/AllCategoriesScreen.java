package screens.androidScreen;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class AllCategoriesScreen {

    public AllCategoriesScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(30)), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Tüm Kategoriler']")
    public WebElement allCategoriesTitle;
    @FindBy(xpath = "(//android.widget.ImageView)[2]")
    public WebElement kitapIcon;
    @FindBy(xpath = "(//android.widget.ImageView)[3]")
    public WebElement dergiIcon;
    @FindBy(xpath = "(//android.widget.ImageView)[4]")
    public WebElement cesitliIcon;
    @FindBy(xpath = "(//android.widget.ImageView)[5]")
    public WebElement kirtasiyeIcon;
    @FindBy(xpath = "(//android.widget.ImageView)[6]")
    public WebElement hobiIcon;
    @FindBy(xpath = "(//android.widget.ImageView)[7]")
    public WebElement puzzleIcon;
    @FindBy(xpath = "(//android.widget.ImageView)[8]")
    public WebElement aksesuarIcon;
    @FindBy(xpath = "(//android.widget.ImageView)[9]")
    public WebElement duvarAksesuarlariIcon;
    @FindBy(xpath = "(//android.widget.ImageView)[10]")
    public WebElement ahsapUrunlerIcon;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Kitapyurdu\"]")
    public WebElement appKitapYurduIcon;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/frameImageSlide")
    public WebElement bardakPic;





}
