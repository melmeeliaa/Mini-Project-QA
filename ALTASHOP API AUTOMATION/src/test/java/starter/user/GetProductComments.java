package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductComments {
    public String endpoint = "https://altashop-api.fly.dev/api/products/11370/comments";

    @Step("I set get product comments api endpoint")
    public String iSetApiEndpoint() {

        return endpoint;
    }
    @Step("I send get product comments HTTP request")
    public void iSendHTTPRequest() {

        SerenityRest.given().get(iSetApiEndpoint());
    }
    @Step("I received valid HTTP response code {int} for get product comments")
    public void iReceivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for get product comments")
    public void iReceivedValidData() {
        restAssuredThat(response -> response.body("data[1].Content", equalTo("memang bagus hp ini")));
    }
}
