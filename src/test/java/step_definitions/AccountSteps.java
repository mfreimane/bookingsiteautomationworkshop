package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.TestContext;

public class AccountSteps {

    private TestContext test;

    public AccountSteps(TestContext testContext){
        this.test = testContext;
    }

//    private NavigationPageObject navigate = new NavigationPageObject();
//    private User user = new User();

    @Then("^I successfully sign up$")
    public void userAccountPageIsOpened() {
        System.out.println("ACCOUNT CREATED!");
    }
    @Then("^I successfully logged in$")
    public void iSuccessfullyLoggedIn() {
        System.out.println("REGULAR_USER IS SUCCESSFULLY LOGGED IN!");
//        successfullyLoggedIn();
    }

    @And("^I logout$")
    public void iLogout() {
        test.getNavigation().selectLogoutButton();
    }

    @And("^I select User Account button$")
    public void iSelectUserAccountButton() {
        // Write code here that turns the phrase above into concrete actions
        test.getNavigation().selectUserAccountButton(test.getUser().getFirstName());
    }

    @When("^I select Logout button in Navigation bar$")
    public void iSelectLogoutButtonInNavigationBar() {
        test.getNavigation().selectLogoutButton();
    }
}
