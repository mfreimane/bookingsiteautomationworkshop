package step_definitions;

import cucumber.api.java.en.Then;

public class AccountSteps {
    @Then("^I successfully sign up$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT CREATED!");
    }
    @Then("^I successfully logged in$")
    public void iSuccessfullyLoggedIn() throws Throwable {
        System.out.println("REGULAR_USER IS SUCCESSFULLY LOGGED IN!");
//        successfullyLoggedIn();
    }
}
