Feature: Cash Withdrawal Happy Path

  Scenario Outline: Successful withdrawal from a wallet
    Given I have deposited <money> in my wallet
    When I request <amount>
    Then <contents> should be dispensed
    And The balance of my wallet should be <balance>
    Examples:
      | money | amount  | contents | balance |
      | 200   | 190     | 190      | 10      |
      | 200   | 0       | 0        | 200     |
      | 200   | 200     | 200      | 0       |