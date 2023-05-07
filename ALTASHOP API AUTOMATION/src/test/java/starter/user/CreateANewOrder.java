package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateANewOrder {
    protected String email ="ERA@gmail.com";
    protected String password ="Ina";
    public String endpoint = "https://altashop-api.fly.dev/api";
    public String token = "";
    @Step ("I have endpoint auth for create a new order")
    public String iSetPostEndpointAuth(){
        return endpoint + "/auth/login";
    }
    @Step("I send endpoint auth for create a new order")
    public void iSendPostEndpointAuth() {
        String body = "{\n" +
                " \"email\":" + email + ", \n" +
                " \"password\":" + password + ", \n" +
                "}";
        JSONObject requestBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPostEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }
    @Step("I set create a new order api endpoint")
    public String iSetPOSTApiEndpoints() {
        return endpoint + "/orders";
    }

    @Step("I send create a new order HTTP request")
    public void iSendPOSTHTTPRequest() {
        String productid = "13673";
        String quantity = "3";

        String body = "    {\n" +
                "        \"product_id\":" + productid + ", \n" +
                "        \"quantity\":" + quantity + ", \n" +
                "    }";
        JSONObject requestBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer "+token).contentType("application/json").body("[\n" + requestBody.toString() + "\n]").post(iSetPOSTApiEndpoints());
    }

    @Step("I received valid HTTP response code {int} for create a new order")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received valid data for create a new order")
    public void iReceiveValidData() {
        restAssuredThat(response -> response.body("data[0].Product.Name", equalTo("Hp Vivo Y22")));

    }
}