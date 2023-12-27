Feature: kitapCatagories


  Background: kullanici tekrari
    Given kullanici siteye giris yapti
    And  kullanici categories butonuna tikladi

  @Tc02
  Scenario: tc02
    And  kullanici "<kitap>" categoriese tiklar
    And kullanici kitap categorieste oldugu dogrulanir
