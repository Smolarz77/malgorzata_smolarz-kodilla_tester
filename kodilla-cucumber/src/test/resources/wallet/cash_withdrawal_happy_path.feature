Feature: Cash Withdrawal Happy Path

  Scenario Outline: Successful withdrawal from a wallet
    Given I have deposited <money> in my wallet
    When I request <amount>
    Then <contents> should be dispensed
    And The balance of my wallet should be <balance>
    Examples:
      | money | amount  | contents | balance |
      | money | amount  | contents | balance |
      | 400   | 390     | 390      | 10      |
      | 400   | 0       | 0        | 400     |
      | 400   | 400     | 400      | 0       |