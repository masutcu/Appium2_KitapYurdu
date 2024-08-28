@catagories_Clickability
Feature: KitapYurdu App

  Scenario: Various header test
    Then User taps on later on option
    And Scrolls screen to Kategoriler

  Scenario Outline: Various header clickability test
    Then User clicks on "<allCatagories>" in order
    And User waits_ 1 _seconds
    Examples:
      | allCatagories      |
      | Kitap              |
      | Dergi              |
      | Cesitli            |
      | Kirtasiye          |
      | Hobi ve Oyuncak    |
      | Puzzle - Yapboz    |
      | Aksesuar           |
      | Duvar Aksesuarlari |
      | Ahsap urunler      |