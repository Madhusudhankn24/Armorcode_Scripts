@Dashboard
Feature: Dashboard Page funtionality

  Background: 
    Given User log in to application
    Then Armorcode dashboard should be displayed

  @DASH-018
  Scenario: Date filter with different custom date range and with Common options.
    Given Verify user is on dashboard page
