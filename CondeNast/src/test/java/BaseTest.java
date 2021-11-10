import com.wired.commons.DriverClass;
import com.wired.pages.HomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class BaseTest {

    //private AppiumDriver driver;
    protected HomePage homePage ;


    @BeforeClass
    public void BeforeClass() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.wiredar");
        desiredCapabilities.setCapability("appActivity", ".MainActivity");
        //desiredCapabilities.setCapability("avd", "Pixel_4");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        //driver = new AndroidDriver(url, desiredCapabilities);
        DriverClass.setDriver(new AndroidDriver(url, desiredCapabilities));

       // driver.manage().timeouts().implicitlyWait(10, SECONDS);

    }


    @AfterClass
    public void AfterClass(){

        DriverClass.getDriver().quit();
    }

}
