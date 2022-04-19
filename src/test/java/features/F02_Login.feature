@Regression
Feature: user could log in

  @oneTime
  Scenario: user  could log in successfully with valid data

    When user at home home page and click log in
    Given user enters valid "12@gmail.com" and "12341234"
    Then user can log in successfully to his account
    And log out
