package screens.androidScreen;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class CategoriesScreen {

    public CategoriesScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(30)), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Kategoriler']")
    public WebElement categories;
    @FindBy(xpath = "//android.widget.TextView[@text='Tümü']")
    public WebElement categoriesAll;


    @FindBy(xpath = "(//android.widget.ImageView)[4]")
    public WebElement variousIcon;

}
