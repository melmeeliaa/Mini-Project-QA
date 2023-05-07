package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetUserInformation{
    protected String email ="ERA@gmail.com";
    protected String password ="Ina";
    public String token = "";
    public String endpoint = "https://altashop-api.fly.dev/api/auth";
    @Step ("I have endpoint auth for get user information")
    public String iSetGetEndpointAuth(){
        return endpoint + "/login";}
    @Step("I send endpoint auth for get user information and get token")
    public void iSendGetEndpointAuth() {
        String body = "{\n" +
                " \"email\":" + email + ", \n" +
                " \"password\":" + password + ", \n" +
                "}";
        JSONObject requestBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetGetEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");}
    @Step("I set get user information api endpoint")
    public String iSetGetApiEndpoint() {
        return endpoint + "/info";}
    @Step("I send get user information HTTP request")
    public void iSendGetHTTPRequest() {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(iSetGetApiEndpoint());}
    @Step("I received valid HTTP response code {int} for get user information")
    public void iReceivedValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(200));}
    @Step("I received valid data for get user information\"")
    public void iReceivedValidData() {
        restAssuredThat(response -> response.body("data.Fullname", equalTo("Imelia Putri")));
        restAssuredThat(response -> response.body("data.Email", equalTo("ERA@gmail.com")));
        restAssuredThat(response -> response.body("data.Password", equalTo("Ina")));
    }
}
