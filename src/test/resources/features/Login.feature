Feature: Login Olma Kontrolleri


  Background:SwagLabs sayfasına gitmek istiyorum.
    Given Kullanıcı giriş sayfsına gider.
    Then Giriş Sayfasının geldiği dogrulanir.

  Scenario Outline: Farklı kullanıcılarla  login olunabilmesi kontrolleri
    And Username alanına "<Kullanıcı Adı>" girişi yapılır.
    And Password alanına "<Şifre>" girişi yapılır.
    When Login butonuna tıklandığında
    Then Anasayfanın geldiği doğrulanır.
    Examples:
      | Kullanıcı Adı           | Şifre        |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |


  Scenario Outline: Username alanının boş bırakılması kontrolü
    And Username alanına "<Kullanıcı Adı>" girişi yapılır.
    And Password alanına "<Şifre>" girişi yapılır.
    When Login butonuna tıklandığında
    Then Hata mesajı alındığı görülür.
    Examples:
      | Kullanıcı Adı | Şifre        |
      |               | secret_sauce |
      |               | secret_sauce |
      |               | secret_sauce |
      |               | secret_sauce |
      |               | secret_sauce |

  Scenario Outline: Password alanının boş bırakılması kontrolü
    And Username alanına "<Kullanıcı Adı>" girişi yapılır.
    And Password alanına "<Şifre>" girişi yapılır.
    When Login butonuna tıklandığında
    Then PHata mesajı alındığı görülür.
    Examples:
      | Kullanıcı Adı           | Şifre |
      | standard_user           |       |
      | problem_user            |       |
      | performance_glitch_user |       |
      | error_user              |       |
      | visual_user             |       |


  Scenario Outline: Username ve Password alanının yanlış girilmesi kontrolü
    And Username alanına "<Kullanıcı Adı>" girişi yapılır.
    And Password alanına "<Şifre>" girişi yapılır.
    When Login butonuna tıklandığında
    Then Match hata mesajı alındığı görülür.
    Examples:
      | Kullanıcı Adı | Şifre |
      | asd           | 123   |
      | asd           | 234   |
      | asd           | 345   |
      | asd           | 312   |
      | asd           | 4324  |




