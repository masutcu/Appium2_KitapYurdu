Feature: Kitap Yurdu Mobil Test
  Scenario: Urunlerin sayisini dogrulama
    When App yuklensin
    And kullanici katagorilere tiklar
    And kullanici kirtasiye bolumune tiklar
    And kullanici "Tüm Ürünleri Göster" butonuna tiklar
    And kullanici "Filtrele" butonuna tiklar
    And kullanici "Kitapyurdu Fiyatı" butonuna tiklar
    And kullanici en az ve en cok bolumleri random doldurur
    Then kullanici urunleri girilen fiyat araliginda oldugunu gorur
