package starter.product;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class productPost {

    protected String url = "https://be-qa.alta.id/api/";

    @Step("I set Post Api endpoint")
    public String setPostApiEndpoint() {
        return url + "products";
    }
    @Step("I send Post HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", " ");
        requestBody.put("price", " ");
        requestBody.put("categories", " ");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());

    }
    @Step("I receive valid http response code 400")
    public void receiveValidHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));

    }
    @Step("I see all the detail products")
    public void seeAllTheDetailProducts() {
        restAssuredThat(response -> response.body("'error'", equalTo("email or password is invalid")));

    }
}