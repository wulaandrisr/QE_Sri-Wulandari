package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.loginPost;

public class loginSteps {

    @Steps
    loginPost post;

    @Given("I set Post Api endpoint")
    public void setPostApiEndpoint() {
        post.setPostApiEndpoint();

    }
    @When("I send Post HTTP request")
    public void sendPostHttpRequest() {
        post.sendPostHttpRequest();

    }
    @Then("I receive invalid http response code 400")
    public void receiveInvalidHttpResponseCode400() {
        post.receiveInvalidHttpResponseCode400();

    }
    @And("I receive error message for detail user")
    public void receiveErrorMessageForDetailUser() {
        post.receiveErrorMessageForDetailUser();

    }
}
