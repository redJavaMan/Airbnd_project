package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListPage {
    private WebDriver driver;
    protected By appartment = By.xpath("(//div[@data-testid='card-container'])[6]");

    public ListPage(WebDriver driver) {
        this.driver = driver;
    }

    public AppartmentPage clickAppartment() {
        driver.findElement(appartment).click();
        return new AppartmentPage(driver);
    }

}
