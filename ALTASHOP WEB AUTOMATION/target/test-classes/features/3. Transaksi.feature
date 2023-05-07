Feature: Transaksi


  @AS15-positive
  Scenario: user bisa membayar produk yang diinginkan
    Given user berada di Homepage AltaShop dan login akun
    When user berada di homepage lalu klik beli pada produk yang diinginkan
    And muncul notif pada cart
    And user klik cart
    And user klik bayar
    And user masuk ke halaman transaksi

  @AS16-positive
  Scenario: user bisa melakukan pencarian produk dari listdown categories
    Given user berada di Homepage AltaShop dan login akun
    When user klik select categories
    And user memilih salah satu categories
    And Produk yang dicari pada categori tersebut muncul di hasil pencarian

  @AS17-positive
  Scenario: user bisa melihat riwayat transaksi
    Given user berada di Homepage AltaShop dan login akun
    When user klik logo user
    And user klik transaksi
    And user dibawa ke halaman transaksi

  @AS18-positive
  Scenario: user bisa Mengubah Jumlah Produk pada Keranjang Belanja
    Given user berada di Homepage AltaShop dan login akun
    When user berada di homepage lalu klik beli pada produk yang diinginkan
    And muncul notif pada cart
    And user klik cart
    Then user klik tombol tambah

  @AS19-positive
  Scenario: user bisa menghapus produk dari keranjang belanja
    Given user berada di Homepage AltaShop dan login akun
    When user berada di homepage lalu klik beli pada produk yang diinginkan
    And muncul notif pada cart
    And user klik cart
    Then user klik tombol minus
    And muncul alert message pesanan kosong