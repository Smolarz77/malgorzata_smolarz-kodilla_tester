Feature: Cash Withdrawal Unhappy Path

  Scenario Outline: Unsuccessful withdrawal from a wallet
    Given I have deposited <money> in my wallet
    When I request <amount>
    Then <contents> not should be dispensed
    And The balance of my wallet is now <balance>
    Examples:
      | money | amount | contents | balance |
      | 0     | 80     | 0        | 0       |
      | 200   | 202    | 0        | 200     |
      | 200   | 0      | 0        | 200     |