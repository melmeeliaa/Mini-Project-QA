package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateANewProduct {
    public String endpoints = "https://altashop-api.fly.dev/api/products";
    @Step("I set create a new product api endpoint")
    public String iSetPOSTApiEndpoints() {
        return endpoints ;
    }

    @Step("I send create a new product HTTP request")
    public void iSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","Hp Vivo Y22");
        requestBody.put("description","memiliki spesifikasi yang apik");
        requestBody.put("price",3000000);
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetPOSTApiEndpoints());
    }

    @Step("I received valid HTTP response code {int} for create a new product")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I received valid data for create a new product")
    public void iReceiveValidData() {
        restAssuredThat(response -> response.body("data.Name", equalTo("Hp Vivo Y22")));
        restAssuredThat(response -> response.body("data.Description", equalTo("memiliki spesifikasi yang apik")));
        restAssuredThat(response -> response.body("data.Price", equalTo(3000000)));

    }
}