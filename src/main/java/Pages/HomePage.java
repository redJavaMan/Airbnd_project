package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class HomePage {
    private WebDriver driver;
    protected By search =By.xpath("//div[@data-testid='little-search-icon']");
    protected By destinationField =By.xpath("//input[@id='bigsearch-query-location-input']");
    protected By checkIn = By.xpath("//div[@data-testid='calendar-day-08/11/2023']");
    protected By checkOut= By.xpath("//div[@data-testid='calendar-day-08/25/2023']");
    protected By guests=By.xpath("//div[@class='p1gaj03r dir dir-ltr']");
    protected By adult= By.xpath("//button[@data-testid='stepper-adults-increase-button']");
    protected By child=By.xpath("//button[@data-testid='stepper-children-increase-button']");
    protected By infants=By.xpath("//button[@data-testid='stepper-infants-increase-button']");
    protected By searchButton = By.xpath("//button[@data-testid='structured-search-input-search-button']");
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickSearch(){
        driver.findElement(search).click();
    }
    public void setDestination(String destination){
        driver.findElement(destinationField).sendKeys(destination, Keys.ENTER);
    }
    public void setCheckIn(String inDate){
        driver.findElement(By.xpath("//div[@data-testid='calendar-day-"+inDate+"']")).click();
    }
    public void setCheckOut(String outDate){
        driver.findElement(By.xpath("//div[@data-testid='calendar-day-"+outDate+"']")).click();
    }
    public void addGuest(){
        driver.findElement(guests).click();
    }
    public void addAdult(int a){
        for(int k=0;k<=a;k++){
            driver.findElement(adult).click();
        }
    }
    public void addChild(int c){
        for (int j=0;j<=c;j++){
            driver.findElement(child).click();
        }
    }
    public void addInfants(int i){
        for (int d=0;d<=i;d++){
            driver.findElement(infants).click();
        }
    }
    public ListPage clickSearchButton(){
        driver.findElement(searchButton).click();
        return new ListPage(driver);
    }

}
