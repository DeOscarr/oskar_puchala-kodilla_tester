Feature: Is number divisible by_?
  Scenario Outline: Number is divisible by divider
    Given the number to be checked is <number>
    When I ask if this number is divisible by divider
    Then I should be told <respond>
    Examples:
      |number |respond|
      |3     |"Fizz"|
      |5     |"Buzz"|
      |15      |"FizzBuzz"|
      |9       |"Fizz"|
      |45      |"FizzBuzz"|
      |44       |"None"|
      |4       |"None"|
      |0       |"None"|