@Regression

Feature: adding product to the wish list

  Scenario: user could select a product and add it to the wish list

    Given user clicks on the product mac appel note book
    When user add the product to wish list
    Then user can add this item to the wish list and a confirmation message will be shown
