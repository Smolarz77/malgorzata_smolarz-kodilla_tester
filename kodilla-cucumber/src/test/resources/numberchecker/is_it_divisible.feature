Feature: Is divisible by number?
  Scenario Outline: Number is or isn't divisible by number
    Given Game has a <number>
    When Checking if number is divisible by 3 and 5
    Then Game should return <answer>
    Examples:
      | number | answer     |
      | 24      | "Fizz"     |
      | 60     | "FizzBuzz" |
      | 10     | "Buzz"     |
      | 11      | "None"     |