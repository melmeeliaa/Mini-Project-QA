package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteAProduct {
    public String endpoint = "https://altashop-api.fly.dev/api/products/13008";
    @Step("I set delete a product api endpoint")
    public String iSetDELETEApiEndpoints() {
        return endpoint;
    }

    @Step("I send delete a product HTTP request")
    public void iSendDELETEHTTPRequest() {
        SerenityRest.given().delete(iSetDELETEApiEndpoints());
    }

    @Step("I received valid HTTP response code {int} for delete a product")
    public void iReceivedValidHTTPResponseCodeDelete() {
        restAssuredThat(response -> response.statusCode(204));
    }
    @Step("I received valid data for delete a product")
    public void iReceivedValidData() {
        restAssuredThat(response -> response.body("data", equalTo(null)));
    }
}