Feature: Prevent users from going overdrawn
  Scenario: User tries to take out more money than their balance
    Given I have credited $100
    When I withdraw $200
    Then Nothing should be dispensed
    And I should be told that I don't have enough money in my wallet