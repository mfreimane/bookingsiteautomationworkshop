package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.RegularUser;
import general.User;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

public class LoginSteps {
    private LoginPageObject login =  new LoginPageObject();
    private User user = new User();
//    private RegularUser regularUser = new RegularUser();

    @And("^I enter a regular user email$")
    public void iEnterRegularUserEmail() throws Throwable {
        login.enterEmailAddress(user.getEmailAddress());
//        login.enterRegularUserEmail(regularUser.getEmail());
    }

    @And("^I enter a regular user password$")
    public void iEnterRegularUserPassword() throws Throwable {
        login.enterRegularUserPassword(user.getPassword());
    }

    @And("^I check \"Remember me\" checkbox$")
    public void iCheckRemeberMeCheckbox() throws Throwable {
        login.checkRememberMeCheckbox();
    }
}
