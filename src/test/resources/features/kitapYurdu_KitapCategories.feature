@sibel
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


  @Tc02
  Scenario: tc02
    And  kullanici "<kitap>" categoriese tiklar
    And kullanici kitap categorieste oldugu dogrulanir


  @Edebiyatmodulutumelementler
Scenario: edebiyat modulu
    And kullanici kitap catagoriese tiklar
    And  kullanici edebiyat bolumune tiklar
    And kullanici kac adet kitap oldugunu dogrular

    @EDEBIYATTIKLAMA
    Scenario Outline: tumelementkere tiklama
      And  kullanici kitap catagoriese tiklar
      And  kullanici edebiyat bolumune tiklar
      And  kullanici "<tumkitaplari>" tiklar

      Examples:
        | tumkitaplari  |
        | Roman(çeviri) |
        | Roman(yerli)  |
        | şiir(yerli)   |
        | Hikaye(yerli) |
        | Deneme(yerli) |
        | Çizgi Roman   |
        | İnceleme      |


      @edebiyatRomanCeviri

      Scenario:
        And  kullanici kitap catagoriese tiklar
        And  kullanici edebiyat bolumune tiklar
        And  kullanici "roman" a tiklar
      #  And kullanici ilk kitapi sepete ekler
And options alanlarinin gorunurlugunu ve secilebilirligini dogrulanir

