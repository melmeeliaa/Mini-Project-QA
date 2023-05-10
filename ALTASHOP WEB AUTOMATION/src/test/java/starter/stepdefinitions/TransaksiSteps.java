package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.TransaksiPage;

public class TransaksiSteps {
    @Steps
    TransaksiPage bayar;
    @Given("user berada di Homepage AltaShop dan login akun")
    public void userBeradaDiHomepageAltaShopDanLoginAkun() {
        bayar.diHomepageAltaShop();
        bayar.klikButtonLogin();
        bayar.inputEmail("ERA@gmail.com");
        bayar.inputPassword("Ina");
        bayar.klikButtonLoginKedua();}

    @When("user berada di homepage lalu klik beli pada produk yang diinginkan")
    public void userKlikBeliPadaProdukYangDiinginkan() {
        bayar.diHomepageKembali();
        bayar.klikButtonBeli();
    }

    @And("muncul notif pada cart")
    public void munculNotifPadaCart() {
    }

    @And("user klik cart")
    public void userKlikCart() {bayar.klikButtonCart();
    }

    @And("user klik bayar")
    public void userKlikBayar() { bayar.klikButtonBayar();
    }

    @And("user masuk ke halaman transaksi")
    public void userMasukKeHalamanTransaksi() { bayar.halamanTransaksi();
    }

    //=========================================== ================================================
    @When("user klik logo user")
    public void userKlikLogoUser() { bayar.klikLogoUser();
    }

    @And("user klik transaksi")
    public void userKlikTransaksi() { bayar.klikRiwayatTransaksi();
    }

    @And("user dibawa ke halaman transaksi")
    public void userDibawaKeHalamanTransaksi() { bayar.halamanTransaksi();
    }
    //================================================ AS18 =====================================================
    @Then("user klik tombol tambah")
    public void userKlikTombolTambah() { bayar.klikTombolTambah();
    }
    //=============================================== =====================================================
    @When("user berada di homepage lalu klik beli salah satu produk")
    public void userBeradaDiHomepageLaluKlikBeliSalahSatuProduk() { bayar.diHomepageKembali(); bayar.klikButtonBeli();
    }
    @Then("user klik tombol minus")
    public void userKlikTombolMinus() { bayar.klikTombolMinus();
    }


    @And("muncul alert message pesanan kosong")
    public void munculAlertMessagePesananKosong() { bayar.munculPesananKosong();
    }


}
