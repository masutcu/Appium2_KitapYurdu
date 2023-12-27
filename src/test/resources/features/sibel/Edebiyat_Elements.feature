Feature: kitapCatagories


  Background: kullanici tekrari
    Given kullanici siteye giris yapti
    And  kullanici categories butonuna tikladi

  @Edebiyatmodulutumelementler
  Scenario: edebiyat modulu
    And kullanici kitap catagoriese tiklar
    And  kullanici edebiyat bolumune tiklar
    And kullanici kac adet kitap oldugunu dogrular