package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen loginScreen;
    //========================================== AS34 ===================================================
    @And("user input email for login feature")
    public void userInputEmailForLoginFeature() { loginScreen.inputEmail("Imeliaputrissa.ina@gmail.com");
    }

    @And("user input password for login feature")
    public void userInputPasswordForLoginFeature() { loginScreen.inputPassword("Ina");

    }
    @And("user see error message {string}")
    public void userSeeErrorMessage(String arg0) { loginScreen.getRecordNotFound();
    }
    //================================= AS35 ============================================================
    @Given("user on homepage AltaShop for login feature")
    public void userOnHomepageAltaShopForLoginFeature() { loginScreen.onHomepageAltaShop();
    }

    @When("user click login button for login feature")
    public void userClickLoginButtonForLoginFeature() { loginScreen.clickButtonLogin();
    }

    @And("user input email valid for login feature")
    public void userInputEmailValidForLoginFeature() { loginScreen.inputEmail("ERA@gmail.com");
    }

    @And("user input password valid for login feature")
    public void userInputPasswordValidForLoginFeature() { loginScreen.inputPassword("Ina");
    }

    @Then("user click login button again for login feature")
    public void userClickLoginButtonAgainForLoginFeature() { loginScreen.clickButtonLoginSecond();
    }
    //==================================== AS36 ============================================================

    @And("user input password invalid for login feature")
    public void userInputPasswordInvalidForLoginFeature() { loginScreen.inputPassword("Imel");
    }

    @And("user see error message password invalid {string}")
    public void userSeeErrorMessagePasswordInvalid(String arg0) { loginScreen.getPasswordInvalid();
    }
    //==================================== AS37 ============================================================
    @And("user input email invalid for login feature")
    public void userInputEmailInvalidForLoginFeature() { loginScreen.inputEmail("putri@gmail.com");
    }

    @And("user see error message email invalid {string}")
    public void userSeeErrorMessageEmailInvalid(String arg0) { loginScreen.getEmailInvalid();
    }
    //============================================ AS38 =======================================================
    @And("user does not input email for login feature")
    public void userDoesNotInputEmailForLoginFeature() { loginScreen.inputEmail("");
    }

    @And("user see error message email required {string}")
    public void userSeeErrorMessageEmailRequired(String arg0) { loginScreen.getMessageEmailEmpty();
    }
    //============================================ AS39 =======================================================
    @And("user does not input password for login feature")
    public void userDoesNotInputPasswordForLoginFeature() { loginScreen.inputPassword("");
    }

    @And("user see error message password required {string}")
    public void userSeeErrorMessagePasswordRequired(String arg0) { loginScreen.getMessagePasswordEmpty();
    }
}
