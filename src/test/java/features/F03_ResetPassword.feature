@Regression


Feature: recover password

  @oneTime
  Scenario: user could be able to recover password by clicking on forgot password

    Given user at home page password forgotten
    When clicks on forgot password
    Then user enters the email "12@gmail.com" to become the link to recover his password
    And user becomes an email and could recover password
