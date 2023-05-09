package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateACategories {
    public String endpoints = "https://altashop-api.fly.dev/api/categories";
    @Step("I set create a category api endpoint")
    public String iSetPOSTApiEndpoints() {
        return endpoints ;
    }

    @Step("I send create a category HTTP request")
    public void iSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","gaming");
        requestBody.put("description","for gaming purposes");
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPOSTApiEndpoints());
    }

    @Step("I received valid HTTP response code 201 for create a category")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received valid data for create a category")
    public void iReceiveValidData() {
        restAssuredThat(response -> response.body("data.Name", equalTo("gaming")));
        restAssuredThat(response -> response.body("data.Description", equalTo("for gaming purposes")));

    }
}