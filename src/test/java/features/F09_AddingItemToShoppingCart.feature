@Regression

Feature: Adding product to the shopping cart

  Scenario: user could select a product and add it to the shopping cart

    Given user clicks on the product mac appel note book
    When user added it to the shopping cart
    Then user can add this item to the shopping cart and a confirmation message will be shown
