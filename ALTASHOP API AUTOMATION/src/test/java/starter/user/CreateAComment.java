package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateAComment {
    protected String email ="ERA@gmail.com";
    protected String password ="Ina";
    public String endpoint = "https://altashop-api.fly.dev/api";
    public String token = "";
    @Step ("I have endpoint auth for create a comment for product")
    public String iSetPostEndpointAuth(){
        return endpoint + "/auth/login";
    }
    @Step("I send endpoint auth create a comment for product")
    public void iSendPostEndpointAuth() {
        String body = "{\n" +
                " \"email\":" + email + ", \n" +
                " \"password\":" + password + ", \n" +
                "}";
        JSONObject requestBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPostEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }
    @Step("I set create a comment for product api endpoint")
    public String iSetPOSTApiEndpoints() {
        return endpoint + "/products/13673/comments";
    }

    @Step("I send create a comment for product HTTP request")
    public void iSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content","memang bagus hp ini");
        SerenityRest.given().header("Authorization","Bearer " + token).header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPOSTApiEndpoints());
    }
    @Step("I received valid HTTP response code {int} for create a comment for product")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received valid data for create a comment for product")
    public void iReceiveValidData() {
        restAssuredThat(response -> response.body("data.Content", equalTo("memang bagus hp ini")));

    }
}