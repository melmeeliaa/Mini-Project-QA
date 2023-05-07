package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetOrderByID {
    protected String email ="ERA@gmail.com";
    protected String password ="Ina";
    public String endpoint = "https://altashop-api.fly.dev/api";
    public String token = "";
    @Step ("I have endpoint auth for get order by ID")
    public String iSetGetEndpointAuth(){
        return endpoint + "/auth/login";
    }
    @Step("I send endpoint auth for get order by ID")
    public void iSendGetEndpointAuth() {
        String body = "{\n" +
                " \"email\":" + email + ", \n" +
                " \"password\":" + password + ", \n" +
                "}";
        JSONObject requestBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetGetEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }
    @Step("I set get order by ID api endpoint")
    public String iSetGetApiEndpoints() {
        return endpoint + "/orders/10713";
    }

    @Step("I send get order by ID HTTP request")
    public void iSendGetHTTPRequest() {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(iSetGetApiEndpoints());
    }

    @Step("I received valid HTTP response code {int} for get order by ID")
    public void iReceivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for get order by ID")
    public void iReceivedValidData() {
        restAssuredThat(response -> response.body("data.Product.Name", equalTo("Hp Vivo Y22")));
    }
}
