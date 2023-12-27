package screens.androidScreen;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class KitapCategories {
    public KitapCategories() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(30)), this);
    }


    @FindBy(id = "com.mobisoft.kitapyurdu:id/imageViewSmallLogo")
    public WebElement logo;


    @FindBy(id = "com.mobisoft.kitapyurdu:id/btn_ic_header_account")
    public WebElement hesapButonu;
    @FindBy(id = "com.mobisoft.kitapyurdu:id/editTextMail")
    public WebElement username;
    @FindBy(id = "com.mobisoft.kitapyurdu:id/editTextPassword")
    public WebElement password;

    @FindBy(id = "com.mobisoft.kitapyurdu:id/btnLogin")
    public WebElement girisbutonu;

    @FindBy(xpath = "(//android.widget.ImageView)[2]")
    public WebElement kitap;


    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.ImageView")
    public WebElement categories;

    @FindBy(xpath = "//android.widget.TextView[@text='Kitap']")
    public WebElement kitapTitle;


    @FindBy(xpath = "//android.widget.TextView[@text='Edebiyat']")
    public WebElement edebiyat;

    @FindBy(xpath = "//android.widget.TextView[@text='Çocuk Kitapları']")
    public WebElement CocukKitabi;


    @FindBy(xpath = "//android.widget.TextView[@text='Siyaset']")
    public WebElement siyaset;

    @FindBy(xpath = "//android.widget.TextView[@text='İslam']")
    public WebElement islam;

    @FindBy(xpath = "//android.widget.TextView[@text='Tarih']")
    public WebElement tarıh;

    @FindBy(xpath = "//android.widget.TextView[@text='Diğer Dildeki Yayınlar']")
    public WebElement dıgerDıldekıyayınlar;


    @FindBy(xpath = "//android.widget.TextView[@text='Ders Kitapları']")
    public WebElement dersKıtapları;

    @FindBy(xpath = "//android.widget.TextView[@text='Eğitim']")
    public WebElement egıtım;
    @FindBy(xpath = "//android.widget.TextView[@text='Orijinal Dil']")
    public WebElement orjınaldıl;

    @FindBy(xpath = "//android.widget.TextView[@text='Diğer']")
    public WebElement dıger;

    @FindBy(xpath = "//android.widget.TextView[@text='Ekonomi']")
    public WebElement Ekonomi;

    @FindBy(xpath = "//android.widget.TextView[@text='Felsefe-Düşünce']")
    public WebElement FelsefeDüşünce;

    @FindBy(xpath = "//android.widget.TextView[@text='Sınav']")
    public WebElement Sınav;

    @FindBy(xpath = "//android.widget.TextView[@text='Kişisel Gelişim']")
    public WebElement KişiselGelişim;


    @FindBy(xpath = "//android.widget.TextView[@text='Bilim & Mühendislik']")
    public WebElement bılımvemuhendsılık;

    @FindBy(xpath = "//android.widget.TextView[@text='Hukuk']")
    public WebElement Hukuk;

    @FindBy(xpath = "//android.widget.TextView[@text='Kültür']")
    public WebElement Kültür;

    @FindBy(xpath = "//android.widget.TextView[@text='Sanat']")
    public WebElement Sanat;


    @FindBy(xpath = "//android.widget.TextView[@text='Sosyoloji']")
    public WebElement Sosyoloji;

    @FindBy(xpath = "//android.widget.TextView[@text='Sağlık-Tıp']")
    public WebElement SağlıkTıp;

    @FindBy(xpath = "//android.widget.TextView[@text='Psikoloji']")
    public WebElement Psikoloji;
    @FindBy(xpath = "//android.widget.TextView[@text='Sinema-Tiyatro']")
    public WebElement SinemaTiyatro;
    @FindBy(xpath = "//android.widget.TextView[@text='Başvuru Kitapları']")
    public WebElement BaşvuruKitapları;
    @FindBy(xpath = "//android.widget.TextView[@text='Din']")
    public WebElement Din;




    //edebiay modulu screenleri

    @FindBy (id = "com.mobisoft.kitapyurdu:id/btnGoToProduct")
    public WebElement edebiyattumurunler;

    @FindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Roman (çeviri) Tümü\"]/android.widget.TextView")
    public WebElement roman;
    @FindBy (xpath = "//android.widget.TextView[@text=\"Sepete Ekle\"]")
    public WebElement romanilkkitap;


    @FindBy (xpath = "//android.widget.TextView[@text='Giriş Yap / Üye Ol']")
    public WebElement girisolkayit;


    @FindBy (xpath = "com.mobisoft.kitapyurdu:id/loginButton")
    public WebElement girisyap;



    @FindBy (xpath = "com.mobisoft.kitapyurdu:id/textview_mail")
    public WebElement mail;
    @FindBy (xpath = "com.mobisoft.kitapyurdu:id/textview_password")
    public WebElement sifre;

    @FindBy (id = "com.mobisoft.kitapyurdu:id/sortButton")
    public WebElement sirala;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.mobisoft.kitapyurdu:id/textViewSortType'])")
    public List<WebElement> siralama;



}
