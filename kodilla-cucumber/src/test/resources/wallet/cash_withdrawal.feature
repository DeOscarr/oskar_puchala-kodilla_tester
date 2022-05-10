Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <deposit> in my wallet
    When I request <withdraw>
    Then <cash> should be dispensed
    And the balance of my wallet should be <balance>
    Examples:
      | deposit | withdraw | cash | balance |
      |200      | 199      | 199  | 1       |
      |200      |200       | 200  | 0       |
      |10       |9         | 9    | 1       |
      |0        |0         | 0    | 0       |

  Scenario Outline: Failed withdrawal attempt
    Given I have deposited <deposit> in my wallet
    When I request <withdraw>
    Then <cash> should be dispensed
    And the balance of my wallet should be <balance>
    Examples:
      | deposit | withdraw | cash | balance |
      | 200     | 201      | 0    | 200     |
      | 0       | 1        | 0    | 0       |
      |101      |102       | 0    | 101     |