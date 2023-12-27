@OrderOptionsByPrice
Feature: KitapYurdu App


  Scenario: 'CD' field Order Options test
    Given User clicks on catagories
    And User waits_ 2 _seconds
    Then User clicks on Various title
    And User waits_ 2 _seconds
    Then User clicks on cdTitle
    And User waits_ 2 _seconds
    Then User cliks on _Tüm Ürünleri Göster_
    And User clicks on orderButton
    And validete  all order options are display and un-selected


  Scenario: Option sorting by price test
    Given validate the products ranking "Ucuzdan Pahalıya"
    And scroll page