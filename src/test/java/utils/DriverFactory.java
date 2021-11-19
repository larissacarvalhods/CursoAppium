package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver(){

        if(driver == null) {
            createDriver();
        }
        return driver;
    }


    private static void createDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.ctappium");
        desiredCapabilities.setCapability("activity", "com.ctappium.MainActivity");
        desiredCapabilities.setCapability("newCommandTimeout", "2000");
        desiredCapabilities.setCapability("app", "C:\\Users\\laris\\Downloads\\calculadora\\CTAppium_1_2.apk");
        //  desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        }
    }





    }


