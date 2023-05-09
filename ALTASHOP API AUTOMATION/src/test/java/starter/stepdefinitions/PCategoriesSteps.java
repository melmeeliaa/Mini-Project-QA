package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.CreateACategories;
import starter.user.DeleteACategory;
import starter.user.GetAllCategories;
import starter.user.GetCategoryByID;

public class PCategoriesSteps {
    @Steps
    CreateACategories createACategories;
    @Steps
    GetCategoryByID getCategoryByID;
    @Steps
    GetAllCategories getAllCategories;
    @Steps
    DeleteACategory deleteACategory;
    @Given("I set create a category api endpoint")
    public void iSetCreateACategoryApiEndpoint() { createACategories.iSetPOSTApiEndpoints();
    }

    @When("I send create a category HTTP request")
    public void iSendCreateACategoryHTTPRequest() { createACategories.iSendPOSTHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for create a category")
    public void iReceivedValidHTTPResponseCodeForCreateACategory(int arg0) { createACategories.iReceiveValidHTTPResponseCode();
    }

    @And("I received valid data for create a category")
    public void iReceivedValidDataForCreateACategory() { createACategories.iReceiveValidData();
    }
//===================================================================================================================
    @Given("I set get category by ID api endpoint")
    public void iSetGetCategoryByIDApiEndpoint() { getCategoryByID.iSetApiEndpoint();
    }

    @When("I send get category by ID HTTP request")
    public void iSendGetCategoryByIDHTTPRequest() { getCategoryByID.iSendHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for get category by ID")
    public void iReceivedValidHTTPResponseCodeForGetCategoryByID(int arg0) { getCategoryByID.iReceivedValidHTTPResponseCode();
    }

    @And("I received valid data for get categoory by ID")
    public void iReceivedValidDataForGetCategooryByID() { getCategoryByID.iReceivedValidData();
    }
//=====================================================================================================================
    @Given("I set get all categories api endpoint")
    public void iSetGetAllCategoriesApiEndpoint() { getAllCategories.iSetApiEndpoint();
    }

    @When("I send get all categories HTTP request")
    public void iSendGetAllCategoriesHTTPRequest() { getAllCategories.iSendHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for get all categories")
    public void iReceivedValidHTTPResponseCodeForGetAllCategories(int arg0) { getAllCategories.iReceivedValidHTTPResponseCode();
    }

    @And("I received valid data for detail categories")
    public void iReceivedValidDataForDetailCategories() { getAllCategories.iReceivedValidData();
    }
//=================================================================================================================
    @Given("I set delete a category api endpoint")
    public void iSetDeleteACategoryApiEndpoint() { deleteACategory.iSetDELETEApiEndpoints();
    }

    @When("I send delete a category HTTP request")
    public void iSendDeleteACategoryHTTPRequest() { deleteACategory.iSendDELETEHTTPRequest();
    }

    @Then("I received valid HTTP response code {int} for delete a category")
    public void iReceivedValidHTTPResponseCodeForDeleteACategory(int arg0) { deleteACategory.iReceivedValidHTTPResponseCodeDelete();
    }

    @And("I received valid data for delete a category")
    public void iReceivedValidDataForDeleteACategory() { deleteACategory.iReceivedValidData();
    }
}
