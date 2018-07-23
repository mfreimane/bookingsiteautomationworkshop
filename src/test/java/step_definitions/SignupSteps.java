package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupSteps {
    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
    }

    @When("^I select MY ACCOUNT$")
    public void iSelectMyAccMenu() throws Throwable {
        selectMyAccMenu();
    }

    @And("^I select sign up button$")
    public void iClickOnSignUpButton() throws Throwable {
      clickOnSignUpButton();
    }

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        enterFirstName();
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        enterLastName();
    }

    @And("^I enter mobile phone number$")
    public void iEnterMobilePhoneNumber() throws Throwable {
        enterMobilePhoneNumber();
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() throws Throwable {
        enterEmailAddress();
    }

    @And("^I enter password$")
    public void iEnterPassword() throws Throwable {
        enterPassword();
    }

    @And("^I confirm password$")
    public void confirmPassword() throws Throwable {
        confirmEnteredPassword();
    }

    @Then("^I successfully sign up$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT CREATED!");
    }
}
