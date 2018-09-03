package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import general.TestContext;

public class BookHotelSteps {

    private TestContext test;

    public BookHotelSteps(TestContext testContext) {
        this.test = testContext;
    }
    @And("^I select Home button in Navigation bar$")
    public void iSelectHomeButtonInNavigationBar() throws InterruptedException {
        Thread.sleep(1000);
        test.getBookHotelPage().selectHomeButton();
        Thread.sleep(1000);
    }

    @And("^I select book Hotels button$")
    public void iSelectBookHotelsButton() {
        test.getBookHotelPage().selectBookHotelButton();
    }

    @And("^I enter ([^\\\"]*) hotel$")
    public void iEnterHotelName(String hotel) {
        test.getBookHotelPage().enterHotelName(hotel);
    }

//  test.getSignUpPage().enterFirstName(test.getUser().getFirstName());
// public void iSelectSignUpButtonInSignUpPage()  {
////        Thread.sleep(1000);
//        test.getSignUpPage().selectSignUpButton();
//    }

}
