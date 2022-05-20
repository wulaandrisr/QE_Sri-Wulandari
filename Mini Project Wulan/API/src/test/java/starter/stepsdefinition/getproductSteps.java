package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.product.productGet;

public class getproductSteps {

    @Steps
    productGet get;

    @Then("I receive valid http response code 200")
    public void receiveValidHttpResponseCode200() {
        get.receiveValidHttpResponseCode200();

    }
    @And("I see all the products")
    public void seeAllTheProducts() {
        get.seeAllTheProducts();

    }

}
