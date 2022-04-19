@Regression

Feature: select tag

  Scenario: user could select awesome tag

    When user navigates to Apparel & shoes
    Then user navigates to awesome tag
    And user could find all products under the awesome tag
