package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;
import starter.screen.LogoutScreen;

public class LogoutSteps {
    @Steps
    LogoutScreen logoutScreen;
    @Given("user on homepage AltaShop for logout feature")
    public void userOnHomepageAltaShopForLogoutFeature() { logoutScreen.onHomepageAltaShop();
    }

    @When("user click login button for logout feature")
    public void userClickLoginButtonForLogoutFeature() { logoutScreen.clickButtonLogin();
    }
    @And("user logs in first")
    public void userMelakukanLoginTerlebihDahulu() {
        logoutScreen.inputEmail("ERA@gmail.com");
        logoutScreen.inputPassword("Ina");
        logoutScreen.clickButtonLoginSecond();
    }

    @And("user clicks logout after entering on the altashop homepage")
    public void userKlikLogoutSetelahMasukDiHomepageAltashop() { logoutScreen.clickButtonLogout();
    }


}
