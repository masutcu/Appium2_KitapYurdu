@subTitleVisibility
Feature: KitapYurdu App

  Scenario Outline: Test4 Various header test
    Given User clicks on catagories
    Then User clicks on Various title
    And verifies_ "<catagories>"  _visibility
    Examples:
      | catagories         |
      | Film ve Müzik      |
      | CD                 |
      | Teknoloji          |
      | Kitap Hediye Kartı |
      | Abonelik           |
