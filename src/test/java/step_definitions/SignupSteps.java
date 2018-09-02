package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.TestContext;
import general.User;
import pages.signup.SignUpPageObject;

import static utils.RandomGenerator.generateRandomPhoneNumber;
import static utils.RandomGenerator.generateRandomString;

public class SignupSteps {

    TestContext test;

    public SignupSteps(TestContext testContext){
        this.test = testContext;

    }
//    private SignUpPageObject signup =  new SignUpPageObject();
//    private User user = new User();
////    private User usertwo= new User("Janis", "Berzins");

    @And("^I enter First name$")
    public void iEnterFirstName() {
        test.getSignUpPage().enterFirstName(test.getUser().getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() {
        test.getSignUpPage().enterLastName(test.getUser().getLastName());
    }

    @And("^I enter mobile phone number$")
    public void iEnterMobilePhoneNumber() {
        test.getSignUpPage().enterMobilePhoneNumber(test.getUser().getMobileNumber());
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() {
        test.getSignUpPage().enterEmailAddress(test.getUser().getEmailAddress());
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        test.getSignUpPage().enterPassword(test.getUser().getPassword());
    }

    @And("^I confirm password$")
    public void confirmPassword() {
        test.getSignUpPage().enterConfirmationPassword(test.getUser().getPassword());
    }

    @And("^I select sign up button in SignUp page$")
    public void iSelectSignUpButtonInSignUpPage()  {
//        Thread.sleep(1000);
        test.getSignUpPage().selectSignUpButton();
    }

//    @And("^And I have created new account$")
//    public void andIHaveCreatedNewAccount() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }

    @And("^I have created new account$")
    public void newAccountcreated() {
        iEnterFirstName();
        iEnterLastName();
        iEnterMobilePhoneNumber();
        iEnterEmailAddress();
        iEnterPassword();
        confirmPassword();
        iSelectSignUpButtonInSignUpPage();

}
//    @And("^I create new account$")
//    public void iCreateNewAccount() throws Throwable {
//        iEnterFirstName();
//
//    }
}
