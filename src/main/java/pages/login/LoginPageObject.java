package pages.login;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.WebElementSelector;
import general.RegularUser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.yaml.snakeyaml.Yaml;
import pages.account.AccountPageObject;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginPageObject {
    WebDriver driver = new ChromeDriver();
    private SelenideElement getEmailfield() {
        return $("input[name = 'username']");
    }
    private SelenideElement getPasswordfield() {
        return $("input[name = 'password']");
    }
    private SelenideElement getLoginButton() { return $(".btn-lg"); }

    public void enterEmailAddress(String email) {
        getEmailfield().sendKeys(email);
    }
    public void enterRegularUserPassword(String password) {
        getPasswordfield().sendKeys(password);
    }

    public void checkRememberMeCheckbox()
    {
        WebElement rememberMe = driver.findElement(By.xpath("//input[@id=\"remember-me\"]"));

        if (!rememberMe.isSelected())
            rememberMe.click();

        assertTrue(rememberMe.isSelected());

        if (rememberMe.isSelected())
            rememberMe.click();

        assertFalse(rememberMe.isSelected());
    }

    public AccountPageObject selectLoginButtonInLoginForm() {
        getLoginButton().click();
        return page(AccountPageObject.class);
    }
}
////    private WebElementSelector driver;
//    List<WebElement> checkbox=driver.findElements(By.xpath("//input[@id=\"remember-me\"]"));
//    for (int=0; i<checkbox.size(); i++) {
//
//        WebElement ele= checkbox.get(i);
//
//        String id=ele.getAttribute("id");
//        if(id.equalsIgnoreCase("code"))
//        {
//            ele.click();
//            break;
//        }
//    }

//    private SelenideElement getEmail() {
//        return $("test");
//    }
//    public static void main(String[] args) throws IOException {
//        Yaml yaml = new Yaml();
//        try (InputStream in = LoginPageObject.class
//                .getResourceAsStream("src/main/resources/RegularUser.yml")) {
//            RegularUser RegularUser = yaml.loadAs(in, RegularUser.class);
//            System.out.println(RegularUser);
//        }
//    }
////    public void enterRegularUserEmail(String email) {
////        setEmail().sendKeys(email);
////    }
//    public AccountPageObject enterRegularUserEmail(String email) {
//        getEmail().click();
//        return page(AccountPageObject.class);
//    }