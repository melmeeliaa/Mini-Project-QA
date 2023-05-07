package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUserInformation;
import starter.user.Login;
import starter.user.Register;

public class AuthenticationSteps {
    @Steps
    Register register;
    @Steps
    Login login;
    @Steps
    GetUserInformation getUI;
//======================================== REGISTER =============================================================
    @Given("I set register api endpoint")
    public void iSetRegisterApiEndpoint() { register.iSetPOSTApiEndpoints();
    }

    @When("I send register HTTP request")
    public void iSendRegisterHTTPRequest() { register.iSendPOSTHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for register")
    public void iReceivedValidHTTPResponseCodeForRegister(int arg0) { register.iReceiveValidHTTPResponseCode();
    }

    @And("I received valid data for register")
    public void iReceivedValidDataForRegister() { register.iReceiveValidData();
    }

//======================================= LOGIN ==============================================================

    @Given("I set login api endpoint")
    public void iSetLoginApiEndpoint() { login.iSetPOSTApiEndpoints();
    }

    @When("I send login HTTP request")
    public void iSendLoginHTTPRequest() { login.iSendPOSTHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for login")
    public void iReceivedValidHTTPResponseCodeForLogin(int arg0) { login.iReceiveValidHTTPResponseCode();
    }

    @And("I received valid token data for login")
    public void iReceivedValidTokenDataForLogin() { login.iReceiveValidData();
    }

//============================================ GET USER INFORMATION ===============================================
    @Given("I have endpoint auth for get user information")
    public void iHaveEndpointAuthForGetUserInformation() {getUI.iSetGetEndpointAuth();
    }

    @When("I send endpoint auth for get user information and get token")
    public void iSendEndpointAuthForGetUserInformationAndGetToken() { getUI.iSendGetEndpointAuth();
    }

    @Then("I set get user information api endpoint")
    public void iSetGetUserInformationApiEndpoint() { getUI.iSetGetApiEndpoint();
    }

    @And("I send get user information HTTP request")
    public void iSendGetUserInformationHTTPRequest() { getUI.iSendGetHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for get user information")
    public void iReceivedValidHTTPResponseCodeForGetUserInformation(int arg0) { getUI.iReceivedValidHTTPResponseCode();
    }

    @And("I received valid data for get user information")
    public void iReceivedValidDataForGetUserInformation() { getUI.iReceivedValidData();
    }
}
