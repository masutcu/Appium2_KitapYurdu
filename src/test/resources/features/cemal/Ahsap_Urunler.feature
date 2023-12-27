@Ahsap_Products
  Feature: KitapYurdu_AhsapProducts_Modul
    Scenario: Ahsap_Products_Test
    Given Went_To_Kitap_Yurdu_App
    Then Click_On_the_Categories_Icon
    And Click_On_the_Ahsap_Urunler_Icon
      And Verify_been_On_the_AhsapUrunler_Page
      And Click_On_the_Kesme_Tahtası_Icon
      Then Verify_been_On_the_KesmeTahtası_Page
      Then Print_TheNumber_of_KesmeTahtasi

