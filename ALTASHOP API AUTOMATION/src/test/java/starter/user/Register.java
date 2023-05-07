package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    public String endpoints = "https://altashop-api.fly.dev/api/auth/register";
    @Step("I set register api endpoint")
    public String iSetPOSTApiEndpoints() {
        return endpoints ;
    }

    @Step("I send register HTTP request")
    public void iSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","mel10@gmail.com");
        requestBody.put("password","Ina");
        requestBody.put("fullname","Firstname Lastname");
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPOSTApiEndpoints());
    }

    @Step("I received valid HTTP response code 200 for register")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received valid data for register")
    public void iReceiveValidData() {
        restAssuredThat(response -> response.body("data.Fullname", equalTo("Firstname Lastname")));
        restAssuredThat(response -> response.body("data.Email", equalTo("mel10@gmail.com")));
        restAssuredThat(response -> response.body("data.Password", equalTo("Ina")));
    }
}