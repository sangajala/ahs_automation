package ahs.support;

import ahs.TestRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver getBrowser(){

        if(driver == null){
            driver = invokeBrowser();
            return  driver;
        }
        else {
            return driver;
        }
    }






    private static WebDriver invokeBrowser() {

        DesiredCapabilities caps = null;
        if (TestRunner.SauceLabs) {
            if (TestRunner.BrowserName.equals("IE")) {
                caps = DesiredCapabilities.internetExplorer();
                caps.setCapability("platform", "Windows 7");
                caps.setCapability("version", "9.0");


            } else if (TestRunner.BrowserName.equals("FF")) {
                caps = DesiredCapabilities.firefox();
                caps.setCapability("platform", "Windows 10");
                caps.setCapability("version", "57.0");
            }
            else if (TestRunner.BrowserName.equals("Chrome")) {
                caps = DesiredCapabilities.chrome();
                caps.setCapability("platform", "Windows 10");
                caps.setCapability("version", "57.0");
            }
            else if (TestRunner.BrowserName.equals("FF")) {
                caps = DesiredCapabilities.firefox();
                caps.setCapability("platform", "Windows 10");
                caps.setCapability("version", "57.0");
            }

            try {
                driver = new RemoteWebDriver(new URL("https://yellowapp:de6277be-9bdb-443c-9be2-1bb5a7ff51f5@ondemand.saucelabs.com:443/wd/hub"), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }
}
