package screens.androidScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class KirtasiyeScreens extends KitapYurduMainScreen {
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
}
