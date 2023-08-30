@kirtasiye
Feature: Kitap Yurdu Mobil Test

  Background: Kategorilerde kirtasiye bolumune gelme
    Given App yuklensin
    And kullanici katagorilere tiklar
    And kullanici kirtasiye bolumune tiklar
    Then kullaici kirtasiye bolumunde

  Scenario Outline: Kirtasiye kategorisi alt baslıklari testi2
    And kullanici "<baslik>" bilgilerini dogrular
    Examples:
      | baslik               |
      | Defter               |
      | Ajanda               |
      | Diğer                |
      | Kalem - Kalem Kutusu |
      | Ofis Ürünleri        |
      | Okul Çantası         |
      | Bloknot              |
      | Masa Takvimi         |
      | Set Ürünler          |
      | Silgi - Kalemtıraş   |
      | Ahşap Kalemlik       |