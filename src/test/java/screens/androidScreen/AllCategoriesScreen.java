package screens.androidScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllCategoriesScreen extends KitapYurduMainScreen{

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


}
