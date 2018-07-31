package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.header.NavigationPageObject;

public class HomepageSteps {

    private NavigationPageObject homepage = new NavigationPageObject();

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("Navigation is visible");
    }

    @When("^I select MY ACCOUNT$")
    public void iSelectMyAccMenu() throws Throwable {
        homepage.selectMyAccountButton();
    }

    @And("^I select sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        homepage.selectSignUpButton();
    }

    @And("^I select Login button$")
    public void iSelectLoginbutton() throws Throwable {
        homepage.selectLoginButton();
    }
}
