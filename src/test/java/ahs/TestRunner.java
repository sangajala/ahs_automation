package ahs;

import ahs.support.BrowserFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty","html:target/cucumber-html-report","json:target/cucumber.json"},
        tags = {"@appointment"}
)
public class TestRunner {

    public static boolean SauceLabs = true;
    public static String BrowserName = "Chrome";
    static WebDriver browser;

    @BeforeClass
    public static void initBrowser(){
        browser = BrowserFactory.getBrowser();
    }

    @AfterClass
    public static void close(){
        browser.quit();
        browser = null;
    }

}

