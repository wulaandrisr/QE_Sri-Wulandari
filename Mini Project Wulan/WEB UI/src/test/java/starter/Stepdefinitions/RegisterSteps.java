package starter.Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.RegisterPage;

public class RegisterSteps {

    @Steps
    RegisterPage registerPage;

    @Steps
    HomePage homePage;

    @Given("I am on the register page")
    public void onTheRegisterPage() {
        registerPage.openPage();
        registerPage.clickLoginIcon();
        registerPage.registerButton();
        registerPage.clickRegisterIcon();
        registerPage.validateOnRegisterPage();

    }
    @When("I input invalid username")
    public void inputValidUsername(){
        registerPage.inputUserName("********");

    }
    @And("I input valid email")
    public void inputValidEmail() {
        registerPage.inputEmail("wlndrisri4@gmail.com");

    }
    @And("I input valid password")
    public void inputValidPassword() {
        registerPage.inputPassword("Palemban9");

    }
    @And("I click register button")
    public void clickRegisterButton() {
        registerPage.clickRegisterButton();

    }
    @Then("I receive error notification {string}")
    public void receiveErrorNotification (String notification) {
        registerPage.validateErrorNotification();
        registerPage.validateEqualsErrorNotification(notification);
    }
}
