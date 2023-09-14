Feature: global filter

  Scenario: verify global filter
    Given launch the armorcode application

  @tag1
  Scenario: check the global filter
    When check the global filter in armorcode application
    Then global filter is displayed in top

  @tag2
  Scenario: Validate global filter categories.
    When click on topper
    And bu box should be displayed
    When verify Box having all BU, subproducts, team, tier and tool category shouid be displayed

  @tag3
  Scenario: Validate filter
    When click on bu drop down button
    And select any bu
    When click on test_traine drop dowd
    Then slected product should be displayed

  @tag4
  Scenario: Validate filter
    When verify none option shoulbe displayed
    And verify teams opption should be displayed
    Then verify tire option should be displayed

  @tag5
  Scenario: Validate filter
    When click o drop down button in bu
    And select any  bu product and click on it
    When click on team option
    Then verify teams product should be displayed

  @tag6
  Scenario: Validate filter
    When click on tire option
    Then verify subproduct should be displayed

  @tag7
  Scenario: Check for applied filter on gobal filter.
    When select any option
    And click on apply button
    Then applyed succesfully
