Feature: Display balance
  Scenario Outline: User checks the balance of an account in credit
    Given my account has been credited with <money>
    When I check the balance
    Then I should see that the balance is <balance>

    Examples:
      | money | balance |
      | 400  |   400   |