package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Hello {
    public String endpoint = "https://altashop-api.fly.dev/api/hello";

    @Step("I set index API endpoint")
    public String iSetApiEndpoint() {

        return endpoint;
    }
    @Step("I send index HTTP request")
    public void iSendHTTPRequest() {

        SerenityRest.given().get(iSetApiEndpoint());
    }
    @Step("I received valid HTTP response code {int} for index")
    public void iReceivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for detail products")
    public void iReceivedValidData() {
        restAssuredThat(response -> response.body("data", equalTo("hello")));
    }
}