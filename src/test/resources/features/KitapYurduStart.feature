
@giris
Feature: KitapYurdu App
  Scenario: : Main Screen
    Given the application is installed
    And User waits_ 2 _seconds
    Then User clicks on catagories
    And User waits_ 2 _seconds
    Then User validate the screen title -Tüm Kategoriler

   Scenario Outline: Various header test
      Given User clicks on "<allCatagories>" in order
      And User waits_ 1 _seconds
      Then User returns to allCatagories screen
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

  Scenario: Various header test
    Given User clicks on Various title
