@kirtasiye
Feature: Kitap Yurdu Mobil Test
  Scenario Outline: Kirtasiye kategorisi alt baslıklari testi
    Given App yuklensin
    And kullanici katagorilere tiklar
    And kullanici kirtasiye bolumune tiklar
    Then kullaici kirtasiye bolumunde
    And kullanici "<baslik>" alanlarina sirayla tiklar
    #And kullanici onceki sayfaya geri doner
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




