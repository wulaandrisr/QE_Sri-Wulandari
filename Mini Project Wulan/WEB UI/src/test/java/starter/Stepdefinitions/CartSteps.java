package starter.Stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;
import starter.pages.HomePage;

public class CartSteps {

    @Steps
    CartPage cartPage;

    @Steps
    HomePage homePage;

    //    @Given("I am on the home page")
//    public void onTheHomePage() {
//        cartPage.openPage();
//        homePage.validateOnHomePage();
//
//    }
    @When("I click the cart button")
    public void clickTheCartButton() {
        cartPage.validateCartButton();


    }
    @Then("I saw my cart page")
    public void sawMyCartPage() {

    }

}
