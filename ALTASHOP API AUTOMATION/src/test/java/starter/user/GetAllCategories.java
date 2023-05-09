package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {
    public String endpoint = "https://altashop-api.fly.dev/api/categories";

    @Step("I set get all categories api endpoint")
    public String iSetApiEndpoint() {

        return endpoint;
    }
    @Step("I send get all categories HTTP request")
    public void iSendHTTPRequest() {

        SerenityRest.given().get(iSetApiEndpoint());
    }
    @Step("I received valid HTTP response code {int} for get all categories")
    public void iReceivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for get all categories")
    public void iReceivedValidData() {
        restAssuredThat(response -> response.body("data[0].Name", equalTo("!@#$%")));
        restAssuredThat(response -> response.body("data[0].Description", equalTo("for gaming purposes")));
    }
}