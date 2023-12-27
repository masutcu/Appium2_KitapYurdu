@compatibility2
  #Bu test bir önceki testin okunurluğunu arttırmak amacıyla outline kullanımı ile yapılmıştır.
  #Amaç başlıklandırmadaki mantık hatasının otomasyonda gösteriminin sağlanmasıdır.
Feature: KitapYurdu App

  Scenario:'Film and Muzik' field test
    Given User clicks on catagories
    And User waits_ 2 _seconds
    Then User clicks on Various title
    And User waits_ 2 _seconds
    Then User clicks on filmTitle
    And User waits_ 2 _seconds


  Scenario Outline:Title Compatibility Test
    When validate compatibility of "<subTitle>" with the title_"Film Müzik"
    Examples:
      | subTitle      |
      | Yabancı Film  |
      | Yerli Müzik   |
      | Yerli Film    |
      | Sağlık Spor   |
      | Yabancı Müzik |