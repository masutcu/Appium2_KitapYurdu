Feature: kitapCatagories


  Background: kullanici tekrari
    Given kullanici siteye giris yapti
    And  kullanici categories butonuna tikladi

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

