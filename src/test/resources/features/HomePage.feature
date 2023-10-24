Feature: Anasayfa Kontrolleri

  Background: Anassayfaya Gidilmesi KOntrolü
    Given Kullanıcı giriş sayfsına gider.
    Then Kullanıcı Login Olur


  Scenario:
    And Hamburger menünün geldiği görülür.
    When Hamburger menü butonuna tıklandığında
    Then Eleman sayısı alınır.

