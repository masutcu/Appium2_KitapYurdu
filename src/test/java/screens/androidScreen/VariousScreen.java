package screens.androidScreen;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class VariousScreen {
    public VariousScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(30)), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Film ve Müzik']")
    public WebElement filmTitle;
    @FindBy(xpath = "//android.widget.TextView[@text='CD']")
    public WebElement cdTitle;

}
