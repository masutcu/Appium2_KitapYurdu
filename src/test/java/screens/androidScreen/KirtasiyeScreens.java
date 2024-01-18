package screens.androidScreen;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class KirtasiyeScreens  {
    public KirtasiyeScreens(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(30)), this);
    }
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.ImageView")
    public WebElement kategorilerMenu;

    @FindBy(xpath = "(//android.widget.ImageView)[5]")
    public WebElement kirtasiyeButton;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/productImage")
    public List<WebElement> urunResimleri;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/textViewLeftPrice")
    public List<WebElement> urunfiyatlari;

    @FindBy(xpath = "//android.widget.TextView[@text='Sepete Ekle']" )
    public List<WebElement> sepetButtons;

    @FindBy(xpath = "(//android.widget.Button[@resource-id='com.mobisoft.kitapyurdu:id/favoriteButton'])[1]" )
    public WebElement favoriteButton;

    @FindBy(xpath = "//android.widget.Toast")
    public WebElement popUpMessage;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/textViewProductName")
    public List<WebElement> urunlerWebElements;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/count")
    public WebElement expectedUrunSayisi;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/minValue")
    public WebElement minValue;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/maxValue")
    public WebElement maxValue;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/ok")
    public WebElement okButtonFiltre;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/textViewRightPrice")
    public List<WebElement> urunlerinFiyatlari;


}
