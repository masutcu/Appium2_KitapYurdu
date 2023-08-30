@hobi
Feature: KitapYurdu
 Scenario Outline:  Various header's product test for hobby and toy
    Given APP yuklensin
    And Kullanici katagorilere tiklar
    And kullanici Hobi ve Oyuncak bolumune tiklar
    And Hobi ve Oyuncak bolumunde içerikler olduğu doğrulanır.
   And Kategorilerde "<Hobi ve Oyuncak>" bölümünde toplam ürün sayısı doğrulanır

   Examples:
     | Hobi ve Oyuncak             |
     | Egitici ve Ogretici Oyunlar |
     | Büyükler icin               |
     | Ahsap Oyuncak               |







