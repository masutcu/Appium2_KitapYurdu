@SwipePic
Feature: KitapYurdu App

  Scenario: Scroll sağa-sola deneme
    Given User clicks on catagories
    And User waits_ 2 _seconds
    Then User clicks on aksesuar title
    And User clicks on Kupa Ve Bardak title
    And User clicks on Kitap Kurdu title
    And User clicks on first product
    Then swipe pictures
    #Then scroll horizantal
