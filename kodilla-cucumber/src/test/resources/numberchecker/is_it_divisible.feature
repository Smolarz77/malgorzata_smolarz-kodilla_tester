Feature: Is it divisible?
  All numbers are divisible

  Scenario Outline: Number is or isn`t divisible
    Given number is <number>
    When I ask number is divisible
    Then I should be told <answer>
    Examples:
      | number | answer |
      | 30 | "FizzBuzz" |
      | 10  | "Buzz" |
      | 9  | "Fizz" |
      | 7  | "None" |
