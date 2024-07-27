package myTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import myPages.BasePage;
import myPages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    WebDriver driver;
    public Page page;

    @BeforeMethod
    @Parameters(value={"browser"})
    public void setUpTest(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Please check the browser....."+browser);
        }

        driver.get("https://app.hubspot.com/login");
        driver.manage().window().maximize();
        page = new BasePage(driver);
    }
}
