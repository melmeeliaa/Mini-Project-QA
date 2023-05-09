package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage register;
    @Then("user klik register")
    public void userKlikRegister() { register.klikLinkRegister();
    }

    @And("user input nama lengkap")
    public void userInputNamaLengkap() { register.inputNamaLengkap("Ikatan Ionik");
    }

    @And("user input email untuk register")
    public void userInputEmailUntukRegister() { register.inputEmail("ERA@gmail.com");
    }

    @And("user input password untuk register")
    public void userInputPasswordUntukRegister() { register.inputPassword("Ina");
    }

    @Then("user klik register yang kedua")
    public void userKlikRegisterYangKedua() { register.klikButtonRegister();
    }

    @And("user menerima ERROR message {string}")
    public void userMenerimaERRORMessage(String arg0) { register.munculErrorMessage();
    }

    @And("user tidak input nama lengkap")
    public void userTidakInputNamaLengkap() { register.inputNamaLengkap("");
    }

    @And("user tidak input email untuk register")
    public void userTidakInputEmailUntukRegister() { register.inputEmail("");
    }

    @And("user tidak input password untuk register")
    public void userTidakInputPasswordUntukRegister() { register.inputPassword("");
    }

    @And("user input email untuk register yang belum pernah terdaftar")
    public void userInputEmailUntukRegisterYangBelumPernahTerdaftar() { register.inputEmail("jancok1@gmail.com");
    }

    @And("user berada di halaman login")
    public void userBeradaDiHalamanLogin() { register.halamanLogin();
    }
}
