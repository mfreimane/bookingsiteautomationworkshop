package step_definitions;

import cucumber.api.java.en.Then;

public class AccountSteps {
    @Then("^I successfully sign up$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT CREATED!");
    }
}
