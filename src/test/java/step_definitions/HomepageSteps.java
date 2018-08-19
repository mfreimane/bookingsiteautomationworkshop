package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;
import pages.header.NavigationPageObject;

public class HomepageSteps {

    private TestContext test;

    public HomepageSteps(TestContext testContext){
        this.test = testContext;
    }

//    private NavigationPageObject homepage = new NavigationPageObject();

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() {
        System.out.println("Navigation is visible");
    }

    @When("^I select MY ACCOUNT$")
    public void iSelectMyAccMenu() {
        test.getNavigation().selectMyAccountButton();
    }

    @And("^I select sign up button$")
    public void iSelectSignUpButton() {
        test.getNavigation().selectSignUpButton();
    }

    @And("^I select Login button$")
    public void iSelectLoginbutton() {
        test.getNavigation().selectLoginButton();
    }

    @And("^I am in Signup form$")
        public void iAmInSignUpForm() throws Throwable {
        iHaveOpenedHomepage();
        iSelectMyAccMenu();
        iSelectSignUpButton();
    }
}
