package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCategoryByID {
    public String endpoint = "https://altashop-api.fly.dev/api/categories/13673";

    @Step("I set get category by ID api endpoint")
    public String iSetApiEndpoint() {

        return endpoint;
    }
    @Step("I send get category by ID HTTP request")
    public void iSendHTTPRequest() {

        SerenityRest.given().get(iSetApiEndpoint());
    }
    @Step("I received valid HTTP response code {int} for get category by ID")
    public void iReceivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for get category by ID")
    public void iReceivedValidData() {
        restAssuredThat(response -> response.body("data.Name", equalTo("gaming")));
        restAssuredThat(response -> response.body("data.Description", equalTo("for gaming purposes")));
    }
}