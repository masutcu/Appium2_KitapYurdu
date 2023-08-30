@giris
Feature: KitapYurdu App

  Background: Main Screen
    Given the application is installed
    And User waits_ 2 _seconds

  Scenario Outline: Test1 Main Screen Categories
    Given verifies_ "<catagories>"  _visibility
    And User waits_ 1 _seconds
    Examples:
      | catagories    |
      | İlgi Görenler |
      | Çok Satanlar  |
      | Yeni Çıkanlar |

  Scenario: Test2 All Categories Screen Test
    Given User clicks on catagories
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

  Scenario Outline: Test3 Various header test
    Given User clicks on catagories
    Then User clicks on "<allCatagories>" in order
    And User waits_ 1 _seconds
    And User returns to pre screen
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

  Scenario Outline: Test4 Various header test
    Given User clicks on catagories
    Then User clicks on Various title
    And verifies_ "<catagories>"  _visibility
    Examples:
      | catagories    |
      | Film ve Müzik |
      | CD            |
      | Teknoloji     |
      | Abonelik      |

  @uyumluluk1
  Scenario:'Film and Muzik' field test
    Given User clicks on catagories
    And User waits_ 2 _seconds
    Then User clicks on Various title
    And User waits_ 2 _seconds
    Then User clicks on filmTitle
    And User waits_ 2 _seconds
    When validate compatibility of subTitle with the title_"Film Müzik"


  @uyumluluk2
  Scenario:'Film and Muzik' field test
    Given User clicks on catagories
    And User waits_ 2 _seconds
    Then User clicks on Various title
    And User waits_ 2 _seconds
    Then User clicks on filmTitle
    And User waits_ 2 _seconds

  @uyumluluk2
  Scenario Outline:Title Compatibility Test
    When validate compatibility of "<subTitle>" with the title_"Film Müzik"
    Examples:
      | subTitle      |
      | Yabancı Film  |
      | Yerli Müzik   |
      | Yerli Film    |
      | Sağlık Spor   |
      | Yabancı Müzik |

    @CdTest
  Scenario: 'CD' field test
    Given User clicks on catagories
    And User waits_ 2 _seconds
    Then User clicks on Various title
    And User waits_ 2 _seconds
    Then User clicks on cdTitle
    And User waits_ 2 _seconds

  @CdTest
      Scenario: All Products Field test
        Given User cliks on _Tüm Ürünleri Göster_
        Then User clicks on orderButton
        And validete  all order options are display and un-selected


