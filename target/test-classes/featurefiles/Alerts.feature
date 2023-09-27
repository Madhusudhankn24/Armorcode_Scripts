@AlertsPage
Feature: ALert Page funtionality

  Background: 
    Given User logged in to application
      | emailID                           | password     |
      | madhusudhan.kv@3ktechnologies.com | Madhu@3ktech |
    Then Armorcode dashboard should be displayed

  @AlertPage
  Scenario: Verify the ALerts page
    When User clicks on Alters button
    Then Alerts page should displayed

  @Alerts @AL-001
  Scenario: Verify that all the information should be properly indented
    When Verify User is on Alerts page
    And Verify Date Column will be sorted in Desending order
    And Click on Severity filter button and filter popup should display
    Then Verify Critical and High Severity will be applied automatically

  @Alerts @AL-002
  Scenario Outline: Check Count of Alerts based on Alert Severity
    And Verify User is on Alerts page
    Then Verify count of Alerts based on <Severity>

    Examples: 
      | Severity |
      | High     |
      | Critical |
      | Info     |
      | Low      |
      | Medium   |

  @Alerts @AL-007
  Scenario: Verify the filters in Alerts page
    When Verify User is on Alerts page
    And Click on Alert ID Filter
    Then Verify By entering Alert ID filter is working properly
    And Click on Date Filter
    Then Verify By entering different option Date filter is working properly
    And Click on status Filter
    Then Verify By selecting status filter is working properly
    And Click on product Filter
    Then Verify By selecting product name filter is working properly
    And Click on sub_product Filter
    Then Verify By selecting sub_product filter is working properly
    And Click on Environment Filter
    Then Verify By selecting Environment filter is working properly

  @Alerts @AL-011
  Scenario: Sorting should working as per the condition( eg: Ascending)
    When Verify User is on Alerts page
    And Click on ALertID sorting
    Then Verify ALertID Sorting is working properly
    And Click on Date Sorting
    Then Verify Date Sorting is working properly
    And Click on Severity sorting
    Then Verify Severity sorting is working properly
    And Click on Status sorting
    Then Verify Status sorting is working properly
    And Click on product sorting
    Then Verify Product sorting is working properly
    And Click on Sub_product sorting
    Then Verify Sub_product sorting is working properly
    And Click on Environmenet sorting
    Then Verify Environmenet sorting is working properly
