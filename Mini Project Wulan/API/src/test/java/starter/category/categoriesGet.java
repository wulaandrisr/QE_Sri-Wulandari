package starter.category;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class categoriesGet {

    protected String url = "https://be-qa.alta.id/api/";

    @Step("I set Get Api endpoint")
    public String setGetApiEndpoint() {
        return url + "categories";
    }
    @Step("I send Get HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setGetApiEndpoint());

    }
    @Step("I receive invalid http response code 200")
    public void receiveInvalidHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I see all the detailed categories")
    public void seeAllTheDetailedCategories() {
        Response resp = SerenityRest.lastResponse();
        String Name = resp.getBody().jsonPath().get("data[2].Name");
        System.out.println("nama : " + Name );

    }
}

