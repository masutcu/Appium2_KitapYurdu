package stepDefinitions;


import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;



public class Hooks {

    @BeforeAll
    public static void beforeAll(){
        Driver.serverBaslat(ConfigReader.getProperty("localIpAdres"), Integer.parseInt(ConfigReader.getProperty("localPort")));

    }

    @Before //io cucumber dan import edilmeli
    public void setUp(){
        Driver.getDriver().activateApp("com.mobisoft.kitapyurdu");
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshotAs = Driver.getDriver().getScreenshotAs(OutputType.BYTES);//bu şekilde raporun içine eklenir
            scenario.attach(screenshotAs,"image/png", "Hata Resmi");
        }
        Driver.getDriver().terminateApp("com.mobisoft.kitapyurdu");
    }


    @AfterAll
    public static void afterAll(){
        Driver.driverClose();
        Driver.serverKapat();
        ReusableMethods.bekle(2);
        ReusableMethods.raporuAc();

    }
}