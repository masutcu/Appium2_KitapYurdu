Feature: Kitap Yurdu Mobil Test

  Background: Kullanici kirtasiye tum urunler bolumunda
    Given App yuklensin
    And kullanici katagorilere tiklar
    And kullanici kirtasiye bolumune tiklar
    Then kullaici kirtasiye bolumunde
    And kullanici "Tüm Ürünleri Göster" butonuna tiklar

  Scenario: Kullanici kirtasiye urunleri resimlerini gorur
    Then kullanici urun resimlerini gorur

  Scenario: Kullanici kirtasiye urunleri fiyatlarini gorur
    Then kullanici urun fiyatlarini gorur

  Scenario: Kullanici kirtasiye urunleri sepete ekle gorur
    Then kullanici sepete ekle butonlarini gorur
