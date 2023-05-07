package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class AssignAProductRating {
    protected String email ="ERA@gmail.com";
    protected String password ="Ina";
    public String endpoint = "https://altashop-api.fly.dev/api";
    public String token = "";
    @Step ("I have endpoint auth for assign a product rating")
    public String iSetPostEndpointAuth(){
        return endpoint + "/auth/login";
    }
    @Step("I send endpoint auth for assign a product rating and get token")
    public void iSendPostEndpointAuth() {
        String body = "{\n" +
                " \"email\":" + email + ", \n" +
                " \"password\":" + password + ", \n" +
                "}";
        JSONObject requestBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPostEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }
    @Step("I set assign a product rating api endpoint")
    public String iSetPOSTApiEndpoints() {
        return endpoint + "/products/13673/ratings";
    }

    @Step("I send HTTP request for assign a product rating")
    public void iSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count",4);
        SerenityRest.given().header("Authorization", "Bearer " + token).header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPOSTApiEndpoints());
    }
    @Step("I received valid HTTP response code {int} for assign a product rating")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received valid data for assign a product rating")
    public void iReceiveValidData() {
        restAssuredThat(response -> response.body("data.Ratings", equalTo(4)));

    }
}