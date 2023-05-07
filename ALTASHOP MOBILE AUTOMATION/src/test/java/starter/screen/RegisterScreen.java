package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {
    // =============================== Locator ===============================
    private By ButtonLogin() {
        return AppiumBy.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By LinkRegister() {
        return AppiumBy.xpath(
                "//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By fullnameField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By emailField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By passwordField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }
    private By registerButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    private By errorMessageGagal() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Gagal :(\"]");
    }
    private By fullNameMessage() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"fullname can not empty\"]");
    }
    private By notInputEmail() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    }
    private By notInputPassword() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    }
    private By buttonCart() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"0\"]");
    }
    //=============================================== Functional ======================================================
    @Step
    public void onHomepageAltaShop() {
        Assert.assertTrue(waitUntilVisible(ButtonLogin()).isDisplayed());}
    @Step
    public void clickButtonLogin() {onClick(ButtonLogin());}
    @Step
    public void clickLinkRegister() {onClick(LinkRegister());}
    @Step
    public void inputFullname(String name) {
        onClick(fullnameField()); onType(fullnameField(), name);
    }
    @Step
    public void inputEmail(String email) {
        onClick(emailField()); onType(emailField(), email);
    }
    @Step
    public void inputPassword(String password) {
        onClick(passwordField()); onType(passwordField(), password);
    }
    @Step
    public void clickRegisterButton() {onClick(registerButton());}
    @Step
    public String getMessageGagal() {
        return waitUntilVisible(errorMessageGagal()).getText();
    }
    @Step
    public String getMessageonFullname() {
        return waitUntilVisible(fullNameMessage()).getText();
    }
    @Step
    public String getMessageonEmailCanNotEmpty() {
        return waitUntilVisible(notInputEmail()).getText();
    }
    @Step
    public String getMessageonPasswordCanNotEmpty() {
        return waitUntilVisible(notInputPassword()).getText();
    }
    @Step
    public void onHomepageAltaShopAgain() {
        Assert.assertTrue(waitUntilVisible(buttonCart()).isDisplayed());}
}
