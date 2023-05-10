package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class LoginSteps {
    @Steps
    LoginPage login;
    @Steps
    RegisterPage register;
    @Given("user berada di Homepage AltaShop")
    public void userBeradaDiHomepageAlta() { login.diHomepageAltaShop();
    }

    @When("user klik button login")
    public void userKlikButtonLogin() { login.klikButtonLogin();
    }

    @And("user input email")
    public void userInputEmail() { login.inputEmail("Imeliaputrissa.ina@gmail.com");
    }

    @And("user input password")
    public void userInputPassword() { login.inputPassword("ina");
    }

    @Then("user klik button login yang kedua")
    public void userKlikButtonLoginYangKedua() { login.klikButtonLoginKedua();
    }

    @And("user menerima error message {string}")
    public void userMenerimaErrorMessage(String arg0) {
        login.munculErrorMessage();
    }

    @And("user input email valid")
    public void userInputEmailValid() { login.inputEmail("ERA@gmail.com");
    }

    @And("user input password valid")
    public void userInputPasswordValid() { login.inputPassword("Ina");
    }

    @And("user kembali di homepage AltaShop")
    public void userKembaliDiHomepageAltaShop() { login.menujuHomepageKembali();
    }

    @And("user input password invalid")
    public void userInputPasswordInvalid() { login.inputPassword("imel");
    }

    @And("user input email invalid")
    public void userInputEmailInvalid() { login.inputEmail("guest@gmail.com");
    }

    @And("user not input email")
    public void userNotInputEmail() { login.inputEmail("");
    }

    @And("user not input password")
    public void userNotInputPassword() { login.inputPassword("");
    }
    //=============================================== Fitur Register ======================================================

}
