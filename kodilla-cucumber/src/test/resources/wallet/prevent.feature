Feature: Prevent users from taking out more money than their wallet contains
  Scenario Outline: User tries to take out more money than their balance
    Given there is <deposit> in my wallet
    When I withdraw <withdraw>
    Then nothing should be dispensed
    And I should be told <feedback>
    Examples:
      | deposit | withdraw | feedback |
      | 100     | 200      | "You don't have that much money"|
      | 100     | 101      | "You don't have that much money"|
      | 0       | 1        | "You don't have that much money"|