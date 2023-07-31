package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {
    private WebDriver driver;
    protected By country =By.xpath("//select[@data-testid='login-signup-countrycode']");
    protected By phno = By.id("phoneInputphoneNumber");
    protected By continueBtn = By.xpath("//button[@data-testid='signup-login-submit-btn']");
    public BookingPage(WebDriver driver) {
        this.driver=driver;
    }
    public void selectCountry(String contry){
        Select countrydrp = new Select(driver.findElement(country));
        countrydrp.selectByVisibleText(contry);
    }
    public void setPhno(String no){
        driver.findElement(phno).sendKeys(no);
    }
    public void clickContinue(){
        driver.findElement(continueBtn).click();
    }
}
