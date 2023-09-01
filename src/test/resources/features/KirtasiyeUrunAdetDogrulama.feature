Feature: Kitap Yurdu Mobil Test
  Scenario: Urunlerin sayisini dogrulama
    When App yuklensin
    And kullanici katagorilere tiklar
    And kullanici kirtasiye bolumune tiklar
    And kullanici "Defter" butonuna tiklar
    And kullanici "Özel Tasarım" butonuna tiklar
    And kullanici "Kitapkurdu" butonuna tiklar
    Then kullanici kitap sayisini dogrular