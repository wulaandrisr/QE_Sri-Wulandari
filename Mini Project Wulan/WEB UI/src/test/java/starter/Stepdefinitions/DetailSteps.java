package starter.Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailPage;
import starter.pages.HomePage;

public class DetailSteps {

    @Steps
    DetailPage detailPage;

    @Steps
    HomePage homePage;

        @Given("I am on the home page")
    public void onTheHomePage() {
        detailPage.openPage();
        homePage.validateOnHomePage();

    }

    @When("I click the detail product")
    public void clickTheDetailProduct() {
        detailPage.validateDetailButton();



    }
    @Then("I see the detail product")
    public void seeTheDetailProduct() {

    }

}
