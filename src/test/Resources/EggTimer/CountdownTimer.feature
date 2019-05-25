Feature: Count down functionality
  As a user
  I want to be able to select a time in the start a timer option
  So that I am able to verify that the count down functionality works

  Scenario Outline: Verify countdown functionality works when time is entered
    Given I navigate to url
    When I enter "<time>" in start a timer field
    And I click Go
    Then I should see the countdown happen every second
    And The remaining time decreases in one-second increments

    Examples:
    | time |
    |  25  |