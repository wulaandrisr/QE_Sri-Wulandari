package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class loginPost {
    protected String url = "https://be-qa.alta.id/api/auth/";

    @Step ("I set Post Api endpoint")
    public String setPostApiEndpoint() {
        return url + "login";

    }
    @Step("I send Post HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wlndrisri4@gmail.com");
        requestBody.put("password", "12345678");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());

    }
    @Step("I receive valid HTTP response code 400")
    public void receiveInvalidHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));

    }
    @Step("I receive error message for detail user")
    public void receiveErrorMessageForDetailUser() {
        restAssuredThat(response -> response.body("'error'", equalTo("email or password is invalid")));

    }

}
