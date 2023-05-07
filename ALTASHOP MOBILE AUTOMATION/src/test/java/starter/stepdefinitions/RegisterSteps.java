package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.RegisterScreen;

public class RegisterSteps {
    @Steps
    RegisterScreen registerScreen;
    @Given("user on homepage AltaShop for register feature")
    public void userOnHomepageAltaShopForRegisterFeature() { registerScreen.onHomepageAltaShop();
    }

    @When("user click login button for register feature")
    public void userClickLoginButtonForRegisterFeature() { registerScreen.clickButtonLogin();
    }
    @Then("user click link register for register feature")
    public void userClickLinkRegisterForRegisterFeature() { registerScreen.clickLinkRegister();
    }

    @And("user input fullname for register feature")
    public void userInputFullnameForRegisterFeature() { registerScreen.inputFullname("Imelia Putri");
    }
    @And("user input registered email for register feature")
    public void userInputRegisteredEmailForRegisterFeature() { registerScreen.inputEmail("ERA@gmail.com");
    }

    @And("user input password for register feature")
    public void userInputPasswordForRegisterFeature() { registerScreen.inputPassword("Ina");
    }

    @Then("user click register button for register feature")
    public void userClickRegisterButtonForRegisterFeature() { registerScreen.clickRegisterButton();
    }

    @And("user see error message duplicate email {string}")
    public void userSeeErrorMessageDuplicateEmail(String arg0) { registerScreen.getMessageGagal();
    }
    //========================================== AS41 ============================================================

    @And("user does not input fullname for register feature")
    public void userDoesNotInputFullnameForRegisterFeature() { registerScreen.inputFullname("");
    }

    @And("user input email for register feature")
    public void userInputEmailForRegisterFeature() { registerScreen.inputEmail("lagi1@gmail.com");
    }

    @And("user see error message fullname is required or can not empty")
    public void userSeeErrorMessage() { registerScreen.getMessageonFullname();
    }
    //================================================== AS42 ====================================================
    @And("user does not input email for register feature")
    public void userDoesNotInputEmailForRegisterFeature() { registerScreen.inputEmail("");
    }

    @And("user see error message email is required or can not empty")
    public void userSeeErrorMessageEmailIsRequiredOrCanNotEmpty() { registerScreen.getMessageonEmailCanNotEmpty();
    }
    //============================================ AS43 ==================================================================================
    @And("user does not input password for register feature")
    public void userDoesNotInputPasswordForRegisterFeature() { registerScreen.inputPassword("");
    }

    @And("user see error message password is required or can not empty")
    public void userSeeErrorMessagePasswordIsRequiredOrCanNotEmpty() { registerScreen.getMessageonPasswordCanNotEmpty();
    }
    //================================================== AS44 ===================================================
    @And("user on homepage AltaShop again")
    public void userOnHomepageAltaShopAgain() { registerScreen.onHomepageAltaShopAgain();
    }


}
