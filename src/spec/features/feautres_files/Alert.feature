@alert_feature
Feature: Je souhaite tester l alert
  En tant que utilisateur je souhaite tester l alert

  @alert
  Scenario: Je souhaite tester l affichage de l alert
    Given Je me connecte sur l application demoqa
    When Je click sur le bouton alertButton
    Then l alerte se declenche "You clicked a button"

  @timer_alert
  Scenario: Je souhaite tester l affichage de timer alert
    Given Je me connecte sur l application demoqa
    When Je click sur le bouton timerAlertButton
    Then l alerte se declenche apres cinque secondes "This alert appeared after 5 seconds"

  @confirm_alert
  Scenario: Je souhaite tester l affichage de confirm alert
    Given Je me connecte sur l application demoqa
    When Je click sur le bouton confirmAlertButton
    And Je click sur le bouton ok
    Then le message "You selected" s affiche

  @prompt_alert
  Scenario: Je souhaite tester l affichage de prompt alert
  Given Je me connecte sur l application demoqa
    When Je click sur le bouton promptAlertButton
    And Je saisie le nom "test"
    And Je clique sur le bouton ok
    Then le message suivant "You entered" s affiche  