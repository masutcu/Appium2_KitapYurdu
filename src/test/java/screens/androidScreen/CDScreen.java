package screens.androidScreen;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class CDScreen  {
    public CDScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(30)), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Tüm Ürünleri Göster']")
    public WebElement tumUrunleriGoster;
    @FindBy(xpath = "//android.widget.TextView[@text='Sırala']")
    public WebElement orderButton;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.mobisoft.kitapyurdu:id/textViewSortType']")
    public List<WebElement> orderOptions;
    @FindBy(xpath = "//android.widget.TextView[@text='Pahalıdan Ucuza']")
    public WebElement fromExpensiveToCheep;
    @FindBy(id = "com.mobisoft.kitapyurdu:id/textViewLeftPrice")
    public List<WebElement> priceList;
    @FindBy(id = "com.mobisoft.kitapyurdu:id/productImage")
    public List<WebElement> productList;



}
