package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    // =============================== Locator ===============================
    private By ButtonLogin() {
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }
    private By emailField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }
    private By passwordField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }
    private By ButtonLoginKedua() {
        return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By ErrorMessage(){
        return By.xpath("//div[@class='v-alert v-sheet theme--light elevation-2 v-alert--border v-alert--border-top']");
    }
    private By HomepageKembali(){
        return  By.xpath("//div[@class='v-toolbar__content']");
    }

    //=============================================== Functional ======================================================
    @Step
    public void diHomepageAltaShop() {
        open();
        $(ButtonLogin()).shouldBeVisible();
    }
    @Step
    public void klikButtonLogin() {
        $(ButtonLogin()).click();
    }

    @Step
    public void inputEmail(String email) {

        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void klikButtonLoginKedua() {
        $(ButtonLoginKedua()).click();
    }
    @Step
    public void munculErrorMessage() {
        $(ErrorMessage()).waitUntilVisible();
    }
    @Step
    public void menujuHomepageKembali() { $(HomepageKembali()).isPresent();}
}

