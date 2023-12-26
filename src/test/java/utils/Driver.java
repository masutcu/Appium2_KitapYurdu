package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {

    public static AndroidDriver driver;
    public static AppiumDriverLocalService service;


    public static AndroidDriver getDriver()  {
        if(driver==null) {
            String appUrl = System.getProperty("user.dir")
                    + File.separator + "apps"
                    + File.separator + "Kitapyurdu_8.25.0_Apkpure.apk";


            UiAutomator2Options options = new UiAutomator2Options()
                    .setApp(appUrl);

            URL url = null;
            try {
                url = new URL("http://0.0.0.0:4723");
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

            driver = new AndroidDriver(url, options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;

    }

    public static void serverBaslat(String ipAdres, int port){
        service=new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress(ipAdres)
                .usingPort(port)
                .build();
        service.start();
    }

    public static void serverKapat(){
        service.stop();

    }
    public static void driverClose(){
        //bunu yapmasak çalışan diğer test bir öncekinin kaldığı yerden devam eder.
        if(driver!=null){
            driver.quit();
            driver=null;
        }

    }

}

