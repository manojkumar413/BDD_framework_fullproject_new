@Regression

  Feature: User Registration

    Scenario: User could register with valid data

      Given User clicks on register button
      When enters "Male", "first name", "last name", "12@gmail.com" and "12341234"
      Then User registered successfully and confirmation message will appear
      And log out