package general;

import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.landlingpage.BookHotelsPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

@Data

public class TestContext {

    private User user;
    private AccountPageObject accountPage;
    private NavigationPageObject navigation;
    private BookHotelsPageObject bookHotelPage;
    private LoginPageObject loginPage;
    private SignUpPageObject signUpPage;

    public TestContext() {
         this.user = new User();
         this.accountPage = new AccountPageObject();
         this.navigation = new NavigationPageObject();
         this.bookHotelPage = new BookHotelsPageObject();
         this.loginPage = new LoginPageObject();
         this.signUpPage = new SignUpPageObject();
    }

}
