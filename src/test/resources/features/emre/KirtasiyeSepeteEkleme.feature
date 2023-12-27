@sepeteEkle
Feature: Kitap Yurdu Mobil Test

  Background: Kullanici kirtasiye tum urunler bolumunda
    Given App yuklensin
    And kullanici katagorilere tiklar
    And kullanici kirtasiye bolumune tiklar
    Then kullaici kirtasiye bolumunde
    And kullanici "Tüm Ürünleri Göster" butonuna tiklar

  Scenario: Kullanici urunleri sepete ekleyebilmelidir
    When kullanici "Sepete Ekle" butonuna tiklar
    And kullanici "Sepetinize Eklendi" uyarisini gorur

