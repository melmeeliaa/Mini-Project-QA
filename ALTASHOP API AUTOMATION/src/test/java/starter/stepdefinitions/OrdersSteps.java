package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.CreateANewOrder;
import starter.user.GetAllOrders;
import starter.user.GetOrderByID;

public class OrdersSteps {
    @Steps
    CreateANewOrder postfirst;
    @Steps
    GetAllOrders getfirst;
    @Steps
    GetOrderByID getsecond;
//============================================= CREATE A NEW ORDER =======================================================
    @Given("I have endpoint auth for create a new order")
    public void iHaveEndpointAuthForCreateANewOrder() { postfirst.iSetPostEndpointAuth();
    }

    @When("I send endpoint auth create a new order")
    public void iSendEndpointAuthCreateANewOrder() { postfirst.iSendPostEndpointAuth();
    }
    @Then("I set create a new order api endpoint")
    public void iSetCreateANewOrderApiEndpoint() { postfirst.iSetPOSTApiEndpoints();
    }

    @And("I send create a new order HTTP request")
    public void iSendCreateANewOrderHTTPRequest() { postfirst.iSendPOSTHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for create a new order")
    public void iReceivedValidHTTPResponseCodeForCreateANewOrder(int arg0) { postfirst.iReceiveValidHTTPResponseCode();
    }

    @And("I received valid data for create a new order")
    public void iReceivedValidDataForCreateANewOrder() { postfirst.iReceiveValidData();
    }

//====================================== GET ALL ORDERS ===============================================================
    @Given("I have endpoint auth for get all orders")
    public void iHaveEndpointAuthForGetAllOrders() { getfirst.iSetGetEndpointAuth();
    }

    @When("I send endpoint auth for get all orders")
    public void iSendEndpointAuthForGetAllOrders() { getfirst.iSendGetEndpointAuth();
    }

    @Then("I set get all orders api endpoint")
    public void iSetGetAllOrdersApiEndpoint() { getfirst.iSetGetApiEndpoints();
    }

    @And("I send get all orders HTTP request")
    public void iSendGetAllOrdersHTTPRequest() { getfirst.iSendGetHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for get all orders")
    public void iReceivedValidHTTPResponseCodeForGetAllOrders(int arg0) { getfirst.iReceivedValidHTTPResponseCode();
    }

    @And("I received valid data for get all orders")
    public void iReceivedValidDataForGetAllOrders() { getfirst.iReceivedValidData();
    }
//============================================= GET ORDER BY ID =====================================================
    @Given("I have endpoint auth for get order by ID")
    public void iHaveEndpointAuthForGetOrderByID() { getsecond.iSetGetEndpointAuth();
    }

    @When("I send endpoint auth for get order by ID")
    public void iSendEndpointAuthForGetOrderByID() { getsecond.iSendGetEndpointAuth();
    }

    @Then("I set get order by ID api endpoint")
    public void iSetGetOrderByIDApiEndpoint() { getsecond.iSetGetApiEndpoints();
    }

    @And("I send get order by ID HTTP request")
    public void iSendGetOrderByIDHTTPRequest() { getsecond.iSendGetHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for get order by ID")
    public void iReceivedValidHTTPResponseCodeForGetOrderByID(int arg0) { getsecond.iReceivedValidHTTPResponseCode();
    }

    @And("I received valid data for get order by ID")
    public void iReceivedValidDataForGetOrderByID() { getsecond.iReceivedValidData();
    }
}