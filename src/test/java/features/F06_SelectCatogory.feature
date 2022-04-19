@Regression
  @smoke

Feature: Hover category

  Scenario: user could hover at computer category and selects note book item

    When user hover at computer category and selects notebook
    Then user could see all notebooks
