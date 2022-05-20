package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.product.productPost;

public class postproductSteps {

    @Steps
    productPost post;

    @Then("I receive valid http response code 400")
    public void receiveValidHttpResponseCode400() {
        post.receiveValidHttpResponseCode400();
    }

    @And("I see all the detail products")
    public void seeAllTheDetailProducts() {
        post.seeAllTheDetailProducts();

    }
}
