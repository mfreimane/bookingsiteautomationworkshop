package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.RegularUser;
import general.TestContext;
import general.User;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

public class LoginSteps {

    private TestContext test;

    public LoginSteps(TestContext testContext) {
        this.test = testContext;
    }

//    private LoginPageObject login =  new LoginPageObject();
//    private User user = new User();
////    private RegularUser regularUser = new RegularUser();

    @And("^I enter a regular user email$")
    public void iEnterRegularUserEmail() {
        test.getLoginPage().enterEmailAddress(test.getUser().getEmailAddress());
//        login.enterRegularUserEmail(regularUser.getEmail());
    }

    @And("^I enter a regular user password$")
    public void iEnterRegularUserPassword() {
        test.getLoginPage().enterRegularUserPassword(test.getUser().getPassword());
    }

    @And("^I check \"Remember me\" checkbox$")
    public void iCheckRemeberMeCheckbox() {
        test.getLoginPage().checkRememberMeCheckbox();
    }

    @And("^I select login button in Login form$")
    public void iSelectLoginButtonInLoginForm() {
        // Write code here that turns the phrase above into concrete actions
        test.getLoginPage().selectLoginButtonInLoginForm();
    }
}
