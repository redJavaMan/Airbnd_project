package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class AppartmentPage {
    private WebDriver driver;
    private String parentWindow;
    private String childWindow;
    protected By reserve = By.xpath("(//button[@data-testid='homes-pdp-cta-btn'])[2]");
    protected By close = By.xpath("//button[@aria-label='Close']");

    public AppartmentPage(WebDriver driver) {
        this.driver=driver;
    }
    public void getWindowHandles(){
        Set<String> windowHandles=driver.getWindowHandles();
        Iterator<String> iterator=windowHandles.iterator();
        parentWindow= iterator.next();
        childWindow=iterator.next();
    }
    public void toParentWindow(){
        driver.switchTo().window(parentWindow);
    }
    public void toChildWindow(){
        driver.switchTo().window(childWindow);
    }
    public void closeAlert(){
        driver.findElement(close).click();
    }


    public BookingPage clickReserve(){
        driver.findElement(reserve).click();
        return new BookingPage(driver);
    }
}
