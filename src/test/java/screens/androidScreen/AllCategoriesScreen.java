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
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement kitapIcon;
    @FindBy(xpath = "//android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement dergiIcon;
    @FindBy(xpath = "//android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement cesitliIcon;
    @FindBy(xpath = "//android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement kirtasiyeIcon;
    @FindBy(xpath = "//android.widget.LinearLayout[5]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement hobiIcon;
    @FindBy(xpath = "//android.widget.LinearLayout[6]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement puzzleIcon;
    @FindBy(xpath = "//android.widget.LinearLayout[8]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement aksesuarIcon;
    @FindBy(xpath = "//android.widget.LinearLayout[7]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement duvarAksesuarlariIcon;
    @FindBy(xpath = "//android.widget.LinearLayout[9]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement ahsapUrunlerIcon;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Kitapyurdu\"]")
    public WebElement appKitapYurduIcon;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/frameImageSlide")
    public WebElement bardakPic;





}
