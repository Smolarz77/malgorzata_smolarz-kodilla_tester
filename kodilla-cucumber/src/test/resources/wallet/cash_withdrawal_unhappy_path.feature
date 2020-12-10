Feature: Cash Withdrawal Unhappy Path

  Scenario Outline: Unsuccessful withdrawal from a wallet
    Given I have deposited <money> in my wallet
    When I request <amount>
    Then <contents> not should be dispensed
    And The balance of my wallet is now <balance>
    Examples:
      | money | amount | contents | balance |
      | money | amount | contents | balance |
      | 0     | 80     | 0        | 0       |
      | 400   | 404    | 0        | 400     |
      | 400   | 0      | 0        | 400     |