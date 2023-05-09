package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProducts {
    public String endpoint = "https://altashop-api.fly.dev/api/products";

    @Step("I set get all products api endpoint")
    public String iSetGetAllProductsApiEndpoint() {

        return endpoint;
    }
    @Step("I send get all products HTTP request")
    public void iSendGetAllProductsHTTPRequest() {

        SerenityRest.given().get(iSetGetAllProductsApiEndpoint());
    }
    @Step("I received valid HTTP response code {int} for get all products")
    public void iReceivedValidHTTPResponseCodeForGetAllProducts() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for detail products")
    public void iReceivedValidDataForDetailUser() {
        restAssuredThat(response -> response.body("data[0].Name", equalTo("description")));

    }
}
