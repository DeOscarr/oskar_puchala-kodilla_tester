Feature: Display balance
  Scenario Outline: User checks the balance of their wallet
    Given there is <deposit> in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is <balance>
    Examples:
      | deposit | balance |
      | 100     | 100     |
      | 1       | 1       |
      | 0       | 0       |