package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginSteps {
    @And("^I select Login button$")
    public void iSelectLoginbutton() throws Throwable {
        selectLoginbutton();
    }

    @And("^I enter a regular user email$")
    public void iEnterRegularUserEmail() throws Throwable {
        enterRegularUserEmail();
    }

    @And("^I enter a regular user password$")
    public void iEnterRegularUserPassword() throws Throwable {
        enterRegularUserPassword();
    }

    @And("^I check \"Remember me\" checkbox$")
    public void iCheckRemeberMeCheckbox() throws Throwable {
        checkRememberMeCheckbox();
    }

    @Then("^I successfully logged in$")
    public void iSuccessfullyLoggedIn() throws Throwable {
        successfullyLoggedIn();
    }
}
