package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    public String endpoints = "https://altashop-api.fly.dev/api/auth/login";
    public String token = "";
    @Step("I set login api endpoint")
    public String iSetPOSTApiEndpoints() {
        return endpoints ;
    }

    @Step("I send login HTTP request")
    public void iSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","ERA@gmail.com");
        requestBody.put("password","Ina");
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPOSTApiEndpoints());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step("I received valid HTTP response code {int} for login")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received valid data for login")
    public void iReceiveValidData() {
        restAssuredThat(response -> response.body("data", equalTo(token)));
    }
}