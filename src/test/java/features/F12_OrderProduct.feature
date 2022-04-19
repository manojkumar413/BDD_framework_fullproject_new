@Regression

Feature: order product successfully

  Scenario: user could order mac note book successfully

    Given user add mac appel note book to shopping cart
    When user go to shopping cart
    And update the shopping cart
    And should register to continue with order
    And enters the shipping address and payment
    Then user could order his product successfully
