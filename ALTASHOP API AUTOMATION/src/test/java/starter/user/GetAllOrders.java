package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllOrders {
    protected String email ="ERA@gmail.com";
    protected String password ="Ina";
    public String endpoint = "https://altashop-api.fly.dev/api";
    public String token = "";
    @Step ("I have endpoint auth for get all orders")
    public String iSetGetEndpointAuth(){
        return endpoint + "/auth/login";
    }
    @Step("I send endpoint auth for get all orders")
    public void iSendGetEndpointAuth() {
        String body = "{\n" +
                " \"email\":" + email + ", \n" +
                " \"password\":" + password + ", \n" +
                "}";
        JSONObject requestBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetGetEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }
    @Step("I set get all orders api endpoint")
    public String iSetGetApiEndpoints() {
        return endpoint + "/orders";
    }

    @Step("I send get all orders HTTP request")
    public void iSendGetHTTPRequest() {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(iSetGetApiEndpoints());
    }

    @Step("I received valid HTTP response code {int} for get all orders")
    public void iReceivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for get all orders")
    public void iReceivedValidData() {
        restAssuredThat(response -> response.body("data[0].Product", equalTo("XBox 1")));
        restAssuredThat(response -> response.body("data[0].Price", equalTo(499)));
    }
}
