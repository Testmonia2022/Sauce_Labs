Feature: Je souhaite tester la page de la deconnexion a l application Swag Labs
  En tant que utilisateur je souhaite tester la page de la deconnexion a l application Swag Labs

  @logout
  Scenario: Je souhaite tester la deconnexion de l application Swag Labs
    Given Je me connecte a l application Swag Labs
    When Je clique le menu burger
    And Je clique sur logout
    Then Je me redirige vers la page de connexion "https://www.saucedemo.com/"
