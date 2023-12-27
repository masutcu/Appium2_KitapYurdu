@TC01catagories
Feature: KitapYurdu App

  Background: Main Screen
    Given the application is installed
    And User waits_ 2 _seconds

  Scenario Outline: Test_1 Main Screen CategoriesVisibility
    Given verifies_ "<catagories>"  _visibility
    And User waits_ 1 _seconds
    Examples:
      | catagories    |
      | İlgi Görenler |
      | Çok Satanlar  |
      | Yeni Çıkanlar |


  Scenario: Test_2 All Categories Screen Test
    Given User clicks on catagories
    Then User validate the screen title -Tüm Kategoriler
