package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.category.categoriesGet;

public class getcategoriesSteps {

    @Steps
    categoriesGet get;

    @Given("I set Get Api endpoint")
    public void setGetApiEndpoint() {
        get.setGetApiEndpoint();

    }
    @When("I send Get HTTP request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();

    }
    @Then("I receive invalid http response code 200")
    public void receiveInvalidHttpResponseCode200() {
        get.receiveInvalidHttpResponseCode200();

    }
    @And("I see all the detailed categories")
    public void seeAllTheDetailedCategories() {
        get.seeAllTheDetailedCategories();

    }
}
