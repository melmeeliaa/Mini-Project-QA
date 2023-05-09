package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LogoutScreen extends BasePageObject {
    // =============================== Locator ===============================
    private By ButtonLogin() {
        return AppiumBy.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By emailField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By passwordField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By ButtonLoginSecond() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By ButtonLogout() {
        return AppiumBy.xpath(
                "\t\n" +
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    //=============================================== Functional ======================================================
    @Step
    public void onHomepageAltaShop() {
        Assert.assertTrue(waitUntilVisible(ButtonLogin()).isDisplayed());}
    @Step
    public void clickButtonLogout() {onClick(ButtonLogout());}
    @Step
    public void clickButtonLogin() {onClick(ButtonLogin());}
    @Step
    public void inputEmail(String email) {
        onClick(emailField()); onType(emailField(), email);
    }
    @Step
    public void inputPassword(String password) {
        onClick(passwordField()); onType(passwordField(), password);
    }
    @Step
    public void clickButtonLoginSecond() {onClick(ButtonLoginSecond());}
}