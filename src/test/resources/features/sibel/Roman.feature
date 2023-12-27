@sibel
Feature: kitapCatagories


  Background: kullanici tekrari
    Given kullanici siteye giris yapti
    And  kullanici categories butonuna tikladi


      @RomanCeviri
      Scenario:
        And  kullanici kitap catagoriese tiklar
        And  kullanici edebiyat bolumune tiklar
        And  kullanici "roman" a tiklar
      #  And kullanici ilk kitapi sepete ekler
        And options alanlarinin gorunurlugunu ve secilebilirligini dogrulanir

