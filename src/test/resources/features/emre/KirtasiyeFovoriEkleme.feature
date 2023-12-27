@favoriekleme
Feature: Kitap Yurdu Mobil Test

  Background: Kullanici kirtasiye tum urunler bolumunda
    Given App yuklensin
    And kullanici katagorilere tiklar
    And kullanici kirtasiye bolumune tiklar
    Then kullaici kirtasiye bolumunde
    And kullanici "Tüm Ürünleri Göster" butonuna tiklar

  Scenario: Kullanici urunleri favoriye ekleyebilmelidir
    When kullanici bir urundeki fovori butonuna basar
    And kullanici "başarıyla" uyarisini gorur
