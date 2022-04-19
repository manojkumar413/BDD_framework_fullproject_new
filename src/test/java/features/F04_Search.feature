@Regression
@oneTime

Feature: user could search for any product on the system


  Scenario: user could search for product using full name

    Given user writes item name "mac" to search it
    When user clicks on search button
    Then user finds the product and can add it to the cart
