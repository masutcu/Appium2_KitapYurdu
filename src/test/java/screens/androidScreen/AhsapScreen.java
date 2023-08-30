package screens.androidScreen;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class AhsapScreen {
    public AhsapScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(30)),this);
    }
    @FindBy(xpath = "//(//android.widget.ImageView)[10]")
    public WebElement ahsap_urunler;

    @FindBy(xpath = "//android.widget.TextView[@text='Ahşap Ürünler']")
    public WebElement ahsap_urunler_text;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.mobisoft.kitapyurdu:id/count']")
    public WebElement ahsap_Urun_Sayisi_Text;

    @FindBy(xpath = "//android.widget.TextView[@text='Kesme Tahtası']")
    public WebElement kesme_tahtasi;


}
