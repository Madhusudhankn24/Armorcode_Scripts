@Login
Feature: Login page

  @Microsoft_existing_user_Login
  Scenario: Check behavior of login via Microsoft for existing user.
    Given Navigate to Armorcode portal
    Then Verify that Login page is displayed
    When User click on Sign in Using microsoft button
    Then Sign in microsoft page should be displayed
    When User enters existing microsoft id and click on next
    And User enters password and click on next
    And Click on yes in stay signed in page
    Then Armorcode dashboard should be displayed

