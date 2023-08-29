
@giris
Feature: KitapYurdu App
  Scenario Outline: : Main Screen
    Given the application is installed
    And User waits_ 2 _seconds
    Then verifies_ "<catagories>"  _visibility
    And User waits_ 1 _seconds

    Examples:
      | catagories |
      | İlgi Görenler |
      | Çok Satanlar |
      | Yeni Çıkanlar |

  Scenario: All Categories Screen Test
    Then User clicks on catagories
    Then User validate the screen title -Tüm Kategoriler

   Scenario Outline: Various header test
      Given User clicks on "<allCatagories>" in order
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

  Scenario: Various header test
    Given User clicks on Various title
