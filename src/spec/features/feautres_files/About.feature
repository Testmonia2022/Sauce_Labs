Feature: Je souhaite tester le bouton about
  En tant que utilisateur je souhaite m informer sur l application Swag Labs

  @about
  Scenario: Je souhaite tester le bouton about
    Given Je me connecte a l application Swag Labs
    When Je clique le menu burger
    And Je clique sur about
    Then Je me redirige vers la page about "Resources"
