@sibel
Feature: kitapCatagories
@tc01
  Scenario: tc01
    Given kullanici siteye giris yapti
    And kullanici siteye girisi dogrulandi
    And kullanici giris butonuna tiklar
    And kullanici "userName" girer
    And kullanici "password" gire
    And kullanici butona  tiklar

  @Tc02
  Scenario: tc02
    Given kullanici siteye giris yapti
    And kullanici siteye girisi dogrulandi
    Given  kullanici categories butonuna tikladi
    And  kullanici "<kitap>" categoriese tiklar
    And kullanici kitap categorieste oldugu dogrulanir



