package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class ProductsSteps {
    @Steps
    GetAllProducts getfirst;
    @Steps
    CreateANewProduct postfirst;
    @Steps
    GetProductByID getsecond;
    @Steps
    DeleteAProduct delfirst;
    @Steps
    AssignAProductRating postsecond;
    @Steps
    GetProductRating getthird;
    @Steps
    CreateAComment postthird;
    @Steps
    GetProductComments getfourth;

    //=========================================== GET ALL PRODUCT ======================================================
    @Given("I set get all products api endpoint")
    public void iSetGetAllProductsApiEndpoints() {
        getfirst.iSetGetAllProductsApiEndpoint();
    }

    @When("I send get all products HTTP request")
    public void iSendGetAllProductsHTTPRequest() {
        getfirst.iSendGetAllProductsHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for get all products")
    public void iReceivedValidHTTPResponseCodeForGetAllProducts(int arg0) {
        getfirst.iReceivedValidHTTPResponseCodeForGetAllProducts();
    }

    @And("I received valid data for detail products")
    public void iReceivedValidDataForDetailProducts() {
        getfirst.iReceivedValidDataForDetailUser();
    }

    //========================================== CREATE A NEW PRODUCT ======================================================
    @Given("I set create a new product api endpoint")
    public void iSetCreateANewProductApiEndpoint() {
        postfirst.iSetPOSTApiEndpoints();
    }

    @When("I send create a new product HTTP request")
    public void iSendCreateANewProductHTTPRequest() {
        postfirst.iSendPOSTHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for create a new product")
    public void iReceivedValidHTTPResponseCodeForCreateANewProduct(int arg0) {
        postfirst.iReceiveValidHTTPResponseCode();
    }

    @And("I received valid data for create a new product")
    public void iReceivedValidDataForCreateANewProduct() {
        postfirst.iReceiveValidData();
    }

    //======================================= GET PODUCT BY ID ==========================================================
    @Given("I set get product by ID api endpoint")
    public void iSetGetProductByIDApiEndpoint() {
        getsecond.iSetApiEndpoint();
    }

    @When("I send get product by ID HTTP request")
    public void iSendGetProductByIDHTTPRequest() {
        getsecond.iSendHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for get product by ID")
    public void iReceivedValidHTTPResponseCodeForGetProductByID(int arg0) {
        getsecond.iReceivedValidHTTPResponseCode();
    }

    @And("I received valid data for get product by ID")
    public void iReceivedValidDataForGetProductByID() {
        getsecond.iReceivedValidData();
    }

    //========================================== DELETE A PRODUCT ========================================================
    @Given("I set delete a product api endpoint")
    public void iSetDeleteAProductApiEndpoint() {
        delfirst.iSetDELETEApiEndpoints();
    }

    @When("I send delete a product HTTP request")
    public void iSendDeleteAProductHTTPRequest() {
        delfirst.iSendDELETEHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for delete a product")
    public void iReceivedValidHTTPResponseCodeForDeleteAProduct(int arg0) {
        delfirst.iReceivedValidHTTPResponseCodeDelete();
    }

    @And("I received valid data for delete a product")
    public void iReceivedValidDataForDeleteAProduct() {
        delfirst.iReceivedValidData();
    }

    //============================================= ASSIGN A PRODUCT RATING =============================================
    @Given("I have endpoint auth for assign a product rating")
    public void iHaveEndpointAuthForAssignAProductRating() {
        postsecond.iSetPostEndpointAuth();
    }

    @When("I send endpoint auth for assign a product rating and get token")
    public void iSendEndpointAuthForAssignAProductRating() {
        postsecond.iSendPostEndpointAuth();
    }

    @Then("I set assign a product rating api endpoint")
    public void iSetAssignAProductRatingApiEndpoint() {
        postsecond.iSetPOSTApiEndpoints();
    }

    @And("I send HTTP request for assign a product rating")
    public void iSendAssignAProductRatingHTTPRequest() {
        postsecond.iSendPOSTHTTPRequest();
    }
    @Then("I received valid HTTP response code {int} for assign a product rating")
    public void iReceivedValidHTTPResponseCodeForAssignAProductRating(int arg0) {
        postsecond.iReceiveValidHTTPResponseCode();
    }

    @And("I received valid data for assign a product rating")
    public void iReceivedValidDataForAssignAProductRating() {
        postsecond.iReceiveValidData();
    }

    //=========================================== GET A PRODUCT RATING =========================================
    @Given("I set get product ratings api endpoint")
    public void iSetGetProductRatingsApiEndpoint() {
        getthird.iSetGetApiEndpoint();
    }

    @When("I send get product ratings HTTP request")
    public void iSendGetProductRatingsHTTPRequest() {
        getthird.iSendGetHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for get product ratings")
    public void iReceivedValidHTTPResponseCodeForGetProductRatings(int arg0) {
        getthird.iReceivedValidHTTPResponseCode();
    }

    @And("I received valid data for get product ratings")
    public void iReceivedValidDataForGetProductRatings() {
        getthird.iReceivedValidData();
    }
//==================================== CREATE A COMMENT FOR PRODUCT ====================================================
    @Given("I have endpoint auth for create a comment for product")
    public void iHaveEndpointAuthForCreateACommentForProduct() { postthird.iSetPostEndpointAuth();
    }

    @When("I send endpoint auth create a comment for product")
    public void iSendEndpointAuthCreateACommentForProduct() { postthird.iSendPostEndpointAuth();
    }

    @Then("I set create a comment for product api endpoint")
    public void iSetCreateACommentForProductApiEndpoint() { postthird.iSetPOSTApiEndpoints();
    }

    @And("I send create a comment for product HTTP request")
    public void iSendCreateACommentForProductHTTPRequest() { postthird.iSendPOSTHTTPRequest();
    }

    @And("I received valid HTTP response code {int} for create a comment for product")
    public void iReceivedValidHTTPResponseCodeForCreateACommentForProduct(int arg0) { postthird.iReceiveValidHTTPResponseCode();
    }

    @Then("I received valid data for create a comment for product")
    public void iReceivedValidDataForCreateACommentForProduct() { postthird.iReceiveValidData();
    }
//====================================== GET PRODUCT COMMENTS ===============================================================
    @Given("I set get product comments api endpoint")
    public void iSetGetProductCommentsApiEndpoint() { getfourth.iSetApiEndpoint();
    }

    @When("I send get product comments HTTP request")
    public void iSendGetProductCommentsHTTPRequest() { getfourth.iSendHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for get product comments")
    public void iReceivedValidHTTPResponseCodeForGetProductComments(int arg0) { getfourth.iReceivedValidHTTPResponseCode();
    }

    @And("I received valid data for get product comments")
    public void iReceivedValidDataForGetProductComments() { getfourth.iReceivedValidData();
    }
}
