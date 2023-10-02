Feature: Je souhaite tester la page de la connexion a l application Swag Labs avec plusieurs comptes
  En tant que utilisateur je souhaite tester la page de la connexion a l application Swag Labs avec plusieurs comptes

  @login_outline
  Scenario Outline: Je souhaite connecter a l applicationavec plusieurs comptes
    Given Je me connecte sur l application swag Labs
    When Je saisie le username "<username>"
    And Je saisie le password "<password>"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "Products"

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
