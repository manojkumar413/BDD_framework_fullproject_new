@Regression

Feature: adding product to compare lise

  Scenario: user could select a product and add it to the compare list
    Given user clicks on the product mac appel note book
    When user added it to compare list
    Then user can add this item to the compare list and a confirmation message will be shown
