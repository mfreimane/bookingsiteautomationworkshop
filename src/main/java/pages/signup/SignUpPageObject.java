package pages.signup;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import java.lang.reflect.AccessibleObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignUpPageObject {

    private SelenideElement getFirstNamefield() {
        return $("test");
    }

    private SelenideElement getLasttNamefield() {
        return $("test");
    }

    private SelenideElement getMobileNumberfield() {
        return $("test");
    }

    private SelenideElement getEmailfield() {
        return $("test");
    }

    private SelenideElement getPasswordfield() {
        return $("test");
    }

    private SelenideElement getConfirmPasswordfield() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    public void enterFirstName(String firstname) {
        getFirstNamefield().sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        getLasttNamefield().sendKeys(lastname);
    }

    public void enterMobilePhoneNumber(String mobile_number) {
        getMobileNumberfield().sendKeys(mobile_number);
    }

    public void enterEmailAddress(String email) {
        getEmailfield().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordfield().sendKeys(password);
    }

    public void enterConfirmationPassword(String password) {
        getConfirmPasswordfield().sendKeys(password);
    }

    public AccountPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(AccountPageObject.class);
    }
}
