@Regression

Feature: filter by color

  Scenario: user can filter shoes by red color

    Given user navigates to Apparel & shoes
    When selects the red shoes
    Then user could see the price of the red shoes
