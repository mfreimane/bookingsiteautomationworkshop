package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.User;
import pages.signup.SignUpPageObject;

import static utils.RandomGenerator.generateRandomPhoneNumber;
import static utils.RandomGenerator.generateRandomString;

public class SignupSteps {

    private SignUpPageObject signup =  new SignUpPageObject();
    private User user = new User();
//    private User usertwo= new User("Janis", "Berzins");

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        signup.enterFirstName(user.getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        signup.enterLastName(user.getLastName());
    }

    @And("^I enter mobile phone number$")
    public void iEnterMobilePhoneNumber() throws Throwable {
        signup.enterMobilePhoneNumber(user.getMobileNumber());
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() throws Throwable {
        signup.enterEmailAddress(user.getEmailAddress());
    }

    @And("^I enter password$")
    public void iEnterPassword() throws Throwable {
        signup.enterPassword(user.getPassword());
    }

    @And("^I confirm password$")
    public void confirmPassword() throws Throwable {
        signup.enterConfirmationPassword(user.getPassword());
    }
//    @And("^I create new account$")
//    public void iCreateNewAccount() throws Throwable {
//        iEnterFirstName();
//
//    }
}
