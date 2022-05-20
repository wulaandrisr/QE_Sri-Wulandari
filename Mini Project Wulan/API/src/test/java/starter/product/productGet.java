package starter.product;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class productGet {

    protected String url = "https://be-qa.alta.id/api/";

    @Step("I set Get Api endpoint")
    public String setGetApiEndpoint() {
        return url + "products";
    }
    @Step("I send Get HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setGetApiEndpoint());

    }
    @Step("I receive valid http response code 200")
    public void receiveValidHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I see all the products")
    public void seeAllTheProducts() {
        Response resp = SerenityRest.lastResponse();
        Integer Price = resp.getBody().jsonPath().get("data[0].Price");
        System.out.println("harga : " + Price );

    }
}