import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class HomePageTest {
    public WebDriverWait wait;

    @BeforeMethod

    public void setUp() throws Throwable{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "TECHNO CAMO CM");
        capabilities.setCapability("udid", "030091184G001114");//DEVICE ID FROM ADB
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("appPackage", "com.daretoinnovate.app");
        AppiumDriver wd = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(wd, 10);
    }

    @Test
public void basicTest() throws InterruptedException{

        wait.until(visibilityOfElementLocated(By.linkText("com.daretoinnovate.app/Sign_Up"))).click();
    }


}