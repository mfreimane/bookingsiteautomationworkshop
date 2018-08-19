package pages.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;
import pages.landlingpage.BookHotelsPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.*;

public class NavigationPageObject {

//    private SelenideElement MyAccountButton = $("test");

    private SelenideElement getMyAccountButton() {
        return $x("//div[@id='collapse']/ul/ul/li[@id='li_myaccount']/a");
    }

    private SelenideElement getSignUpButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Sign Up')]")); }

    private SelenideElement getLoginButton() { return $(By.xpath("//nav/descendant::a[contains(text(), 'Login')]")); }

    private SelenideElement getLogoutButton() { return $(""); }

    private SelenideElement getUserccountButton(String username) {
        return $(By.xpath("//nav/descendant::a[contains(text(), '" + username + "')]"));
    }

    public void selectMyAccountButton() {
        getMyAccountButton().click();
    }

    public SignUpPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }

    public LoginPageObject selectLoginButton() {
        getLoginButton().click();
        return page(LoginPageObject.class);
    }

    public BookHotelsPageObject selectLogoutButton() {
        getLogoutButton().click();
        return page(BookHotelsPageObject.class);
    }

    public AccountPageObject selectUserAccountButton(String username) {
        getUserccountButton(username).click();
        return page(AccountPageObject.class);
    }
}

//div[@id='collapse']/ul/ul/li[@id='li_myaccount']/ul/li/a[contains(., 'Sign Up')]"