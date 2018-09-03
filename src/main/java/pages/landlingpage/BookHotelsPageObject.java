package pages.landlingpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BookHotelsPageObject {
    private SelenideElement getHomeButton() {
        return $(By.xpath("//a[@href='https://www.phptravels.net/']"));
    }
    private SelenideElement getHotelNameField() {
        return $(By.xpath("//div[@class = 'select2-search']/input[@class='select2-input select2-focused']"));
    }
    private SelenideElement getBookHotelButton() {
        return $(By.xpath("//a[@href='#HOTELS']"));
    }

    public AccountPageObject selectHomeButton() {
        getHomeButton().click();
        return page(AccountPageObject.class);
    }
    public void enterHotelName(String HotelName) {
        getHotelNameField().sendKeys(HotelName);
    }

    public AccountPageObject selectBookHotelButton() {
        getBookHotelButton().click();
        return page(AccountPageObject.class);
    }

}



//$x("//li[@class = 'active']/a[contains(., 'Home')]")
//     return $(By.xpath("//li[@class = 'active']/a[contains(., 'Home')]"));
