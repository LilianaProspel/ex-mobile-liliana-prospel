package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppiumAndroidDriver {
    public static AppiumDriver driver;
    private static final Logger LOGGER = Logger.getLogger(AppiumAndroidDriver.class.getName());

    public static AppiumAndroidDriver suNavegador() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium:deviceName","Pixel 8 API 28");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("appium:platformVersion","9");
            capabilities.setCapability("appium:automationName","UiAutomator2");
            capabilities.setCapability("appium:appActivity", "com.swaglabsmobileapp.MainActivity");
            capabilities.setCapability("appium:appWaitDuration", 30000);
            capabilities.setCapability("appium:app","C:\\Users\\andre\\IdeaProjects\\ex-mobile-liliana-prospel\\ex-mobile-liliana-prospel\\SwagLabs\\src\\main\\java\\driver\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            LOGGER.log(Level.SEVERE, "URL mal formada", e);
        }
        return new AppiumAndroidDriver();
    }

    public AppiumDriver onDriver() {
        return driver;
    }
}