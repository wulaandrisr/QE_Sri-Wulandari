package starter.Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.ProductPage;

public class ProductSteps extends PageObject {

    @Steps
    ProductPage productPage;
//
//    @Steps
//    HomePage homePage;
//
//    @Given("I am on the home page")
//    public void onTheHomePage() {
//        productPage.openPage();
//        homePage.validateOnHomePage();
//
//    }
    @When("I click the cart icon")
    public void clickTheCartIcon() {
        productPage.clickCartButton();

    }

    @And("I delete the product")
    public void deleteTheProduct() {
        productPage.clickDeleteButton();

    }


    @Then("I succeeded in delete the products on a cart")
    public void succeededInDeleteProductsOnACart() {

    }

}
