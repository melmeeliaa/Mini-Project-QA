package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TransaksiPage extends PageObject {

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
    private By ButtonBeli(){
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[2]/div/div[3]/div[2]/button[2]/span");
    }

    private By ButtonCart() {
        return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[1]");
    }
    private By ButtonBayar() {
        return By.xpath("//*[@id=\"button-bayar\"]");
    }
    private By Transaksi() {
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div");
    }
    private By FieldCategories() {
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[1]/div/div[1]/div[1]/div[1]");
    }
    private By selectCategories() {
        return By.xpath("/html/body/div[1]/div[1]/main/div/div/div[1]");
    }

    private By productCategories() {
        return By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div");
    }
    private By logoUser() {
        return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[2]");
    }
    private By riwayatTransaksi() {
        return By.xpath("/html/body/div[1]/div[2]/div/div[1]");
    }
    private By tombolTambah() {
        return By.xpath("/html/body/div[1]/div[1]/main/div/div/div[1]/div/div[1]/div[2]/button[2]/span");
    }
    private By tombolMinus() {
        return By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div/div[1]/div[2]/button[1]/span");
    }
    private By alertMessage() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div");
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
    public void diHomepageKembali() {
        $(ButtonBeli()).shouldBeVisible();
    }
    @Step
    public void klikButtonBeli() {
        $(ButtonBeli()).click();
    }

    @Step
    public void klikButtonCart() {
        $(ButtonCart()).click();
    }
    @Step
    public void klikButtonBayar() {
        $(ButtonBayar()).click();
    }
    @Step
    public void halamanTransaksi() {
        $(Transaksi()).isPresent();
    }
    @Step
    public void klikFieldCategories() {
        $(FieldCategories()).click();
    }
    @Step
    public void klikSelectCategories() {
        $(selectCategories()).click();
    }
    @Step
    public void munculprodukcategories() {
        $(productCategories()).isPresent();
    }
    @Step
    public void klikLogoUser() {
        $(logoUser()).click();
    }
    @Step
    public void klikRiwayatTransaksi() {
        $(riwayatTransaksi()).click();
    }
    @Step
    public void klikTombolTambah() {
        $(tombolTambah()).click();
    }
    @Step
    public void klikTombolMinus() {
        $(tombolMinus()).click();
    }
    @Step
    public void munculPesananKosong() {
        $(alertMessage()).isVisible();
    }
}

