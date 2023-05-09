package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Hello;

public class HelloSteps {
    @Steps
    Hello hello;
    @Given("I set index API endpoint")
    public void iSetIndexAPIEndpoint() { hello.iSetApiEndpoint();
    }

    @When("I send index HTTP request")
    public void iSendIndexHTTPRequest() { hello.iSendHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for index")
    public void iReceivedValidHTTPResponseCodeForIndex(int arg0) { hello.iReceivedValidHTTPResponseCode();
    }

    @And("I received valid data for index")
    public void iReceivedValidDataForIndex() { hello.iReceivedValidData();
    }
}
