@kitap
Feature: KitapYurdu
  Scenario: Kitap Ara
    Given Kitap Yurdu sitesine gidildi
    When Sitede oldugu dogrulandi
    Then Search ikonu tiklandi
    And SearchBox "dağ" kelimesi aratildi
    And dagobert kelimesi oldugu dogrulandi