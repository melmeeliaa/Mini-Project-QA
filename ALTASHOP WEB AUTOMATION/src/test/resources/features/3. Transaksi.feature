Feature: Transaksi


  @Transaksi01-Web-Positive
  Scenario: user bisa membayar produk yang diinginkan
    Given user berada di Homepage AltaShop dan login akun
    When user berada di homepage lalu klik beli pada produk yang diinginkan
    And muncul notif pada cart
    And user klik cart
    And user klik bayar
    And user masuk ke halaman transaksi

  @Transaksi03-Web-Positive
  Scenario: user bisa melihat riwayat transaksi
    Given user berada di Homepage AltaShop dan login akun
    When user klik logo user
    And user klik transaksi
    And user dibawa ke halaman transaksi

  @Transaksi04-Web-Positive
  Scenario: user bisa Mengubah Jumlah Produk pada Keranjang Belanja
    Given user berada di Homepage AltaShop dan login akun
    When user berada di homepage lalu klik beli pada produk yang diinginkan
    And muncul notif pada cart
    And user klik cart
    Then user klik tombol tambah

  @Transaksi05-Web-Positive
  Scenario: user bisa menghapus produk dari keranjang belanja
    Given user berada di Homepage AltaShop dan login akun
    When user berada di homepage lalu klik beli salah satu produk
    And muncul notif pada cart
    And user klik cart
    Then user klik tombol minus
    And muncul alert message pesanan kosong