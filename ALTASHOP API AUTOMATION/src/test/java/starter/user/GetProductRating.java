package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetProductRating {
    public String endpoint = "https://altashop-api.fly.dev/api/products/13673/ratings";

    @Step("I set get product ratings api endpoint")
    public String iSetGetApiEndpoint() {

        return endpoint;
    }
    @Step("I send get product ratings HTTP request")
    public void iSendGetHTTPRequest() {

        SerenityRest.given().get(iSetGetApiEndpoint());
    }
    @Step("I received valid HTTP response code {int} for get product ratings")
    public void iReceivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for get product ratings")
    public void iReceivedValidData() {
        restAssuredThat(response -> response.body("data", equalTo(4)));
    }
}
