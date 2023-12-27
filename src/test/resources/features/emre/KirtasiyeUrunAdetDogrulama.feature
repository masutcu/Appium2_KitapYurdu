@urunAdet
Feature: Kitap Yurdu Urun Adet Dogrulama Test
  Scenario: Urunlerin sayisini dogrulama
    When App yuklensin
    And kullanici katagorilere tiklar
    And kullanici kirtasiye bolumune tiklar
    And kullanici "Defter" butonuna tiklar
    And kullanici "Özel Tasarım" butonuna tiklar
    And kullanici "Kitapkurdu Serisi" butonuna tiklar
    Then kullanici kitap sayisini dogrular