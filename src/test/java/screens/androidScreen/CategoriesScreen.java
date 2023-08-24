package screens.androidScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesScreen extends KitapYurduMainScreen{

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.ImageView")
    public WebElement categories;

    @FindBy(xpath = "(//android.widget.ImageView)[4]")
    public WebElement variousIcon;

}
