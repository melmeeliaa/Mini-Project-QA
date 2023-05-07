package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    // =============================== Locator ===============================
    private By LinkRegister() {
        return By.xpath("//a[@href='/auth/register']");
    }
    private By namaLengkapField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }
    private By emailField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }
    private By passwordField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input");
    }
    private By ButtonRegister() {
        return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By ErrorMessage(){
        return By.xpath("//div[@class='v-alert__content']");
    }
    private By ButtonLogin() {
        return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }

    //=============================================== Functional ======================================================

    @Step
    public void klikLinkRegister() {
        $(LinkRegister()).click();
    }
    @Step
    public void inputNamaLengkap(String nama) {

        $(namaLengkapField()).type(nama);
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
    public void klikButtonRegister() {
        $(ButtonRegister()).click();
    }
    @Step
    public void munculErrorMessage() {
        $(ErrorMessage()).waitUntilVisible();
    }
    @Step
    public void halamanLogin() {
        $(ButtonLogin()).shouldBeVisible();
    }
}

