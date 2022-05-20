package starter.register;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class registerPost {
    protected String url = "https://be-qa.alta.id/api/auth/";

    @Step ("I set Post Api endpoint")
    public String setPostApiEndpoint() {
        return url + "register";

    }
    @Step("I send Post HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("fullname", " ");
        requestBody.put("email", "wlndrisri4@gmail.com");
        requestBody.put("password", "123123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());

    }
    @Step("I receive valid HTTP response code 400")
    public void receiveInvalidHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));

    }
    @Step("I receive error message for register")
    public void receiveErrorMessageForRegister() {
        restAssuredThat(response -> response.body("'error'", equalTo("email or password is invalid")));

    }

}