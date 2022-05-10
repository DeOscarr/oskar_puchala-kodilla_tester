Feature: Is it Summer?
  Everybody likes Summer

  Scenario Outline: Today is or isn't Summer
    Given today is <today>
    When I ask whether it's Summer
    Then I should be told <answer>
    Examples:
      | today | answer |
      | the last day of December |"Nope"|
      | second day of January    |"Nope"|
      | 10th day of February         |"Nope"|
      | 20th day of June              |"Nope"|
      |5th day of May                 |"Nope"|
      |first day of August            |"Yes!Summer!"|
      |21th day of June               |"Yes!Summer!"|
      |23th day of August             |"Yes!Summer!"|
    #  Scenario: Winter isn't Summer
    #    Given today is the last day of December
    #    When I ask whether it's Summer
    #    Then I should be told "Nope"
    #
    #    Scenario: Summer is Summer
    #     Given today is first day of August
    #     When I ask whether it's Summer
    #      Then I should be told "Yes! Summer!"