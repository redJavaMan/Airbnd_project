package Search;

import Base.BaseTest;

import Pages.AppartmentPage;
import Pages.BookingPage;
import Pages.ListPage;
import org.testng.annotations.Test;

public class DetailsTest extends BaseTest {
    @Test
    public void testSearch()  {
        homePage.clickSearch();
        homePage.setDestination("Al Haram");
        homePage.setCheckIn("08/11/2023");
        homePage.setCheckOut("08/21/2023");
        homePage.addGuest();
        homePage.addAdult(5);
        homePage.addChild(3);
        homePage.addInfants(2);
        ListPage listPage = homePage.clickSearchButton();
        AppartmentPage appartmentPage=listPage.clickAppartment();
        appartmentPage.getWindowHandles();
        appartmentPage.toChildWindow();
        appartmentPage.closeAlert();
        BookingPage bookingPage=appartmentPage.clickReserve();
        bookingPage.selectCountry("India");
        bookingPage.setPhno("7355675588");
        bookingPage.clickContinue();
    }
}
