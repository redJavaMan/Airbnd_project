package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
        @BeforeSuite
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.get("https://www.airbnb.ae/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            homePage = new HomePage(driver);
        }
        @AfterSuite
        public void tearDown(){
            driver.quit();
        }
    }


