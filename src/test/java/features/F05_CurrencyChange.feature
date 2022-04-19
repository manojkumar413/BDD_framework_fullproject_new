@Regression

Feature: change the currency

  Scenario: user could select Euro instead of US Dollar

    When user selects currency drop list and chooses Euro
    Then user sees the price of the product in Euro
