package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductByID {
    public String endpoint = "https://altashop-api.fly.dev/api/products/13673";

    @Step("I set get product by ID api endpoint")
    public String iSetApiEndpoint() {

        return endpoint;
    }
    @Step("I send get all products HTTP request")
    public void iSendHTTPRequest() {

        SerenityRest.given().get(iSetApiEndpoint());
    }
    @Step("I received valid HTTP response code {int} for get all products")
    public void iReceivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for detail products")
    public void iReceivedValidData() {
        restAssuredThat(response -> response.body("data.Name", equalTo("Hp Vivo Y22")));
        restAssuredThat(response -> response.body("data.Description", equalTo("memiliki spesifikasi yang apik")));
        restAssuredThat(response -> response.body("data.Price", equalTo(3000000)));
    }
}