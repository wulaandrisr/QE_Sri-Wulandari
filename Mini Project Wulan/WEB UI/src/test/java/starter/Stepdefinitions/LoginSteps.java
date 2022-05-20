package starter.Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPage.openPage();
        loginPage.clickLoginIcon();
        loginPage.validateOnLoginPage();


    }
    @When("I input invalid email")
    public void inputInvalidEmail() {
        loginPage.inputEmail("wulandari4@gmail.com");

    }
    @And("I input invalid password")
    public void inputInvalidPassword() {
        loginPage.inputPassword("********");

    }
    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();


    }
    @Then("I receive error message {string}")
    public void receiveErrorMessage(String message) {
        loginPage.validateErrorMessage();
        loginPage.validateEqualsErrorMessage(message);

    }

}
