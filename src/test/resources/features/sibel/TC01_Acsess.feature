Feature: kitapCatagories


  Background: kullanici tekrari
    Given kullanici siteye giris yapti
    And  kullanici categories butonuna tikladi


  @tc01
  Scenario: tc01
    And kullanici siteye girisi dogrulandi
    And kullanici giris butonuna tiklar
    And kullanici "userName" girer
    And kullanici "password" gire
    And kullanici butona  tiklar