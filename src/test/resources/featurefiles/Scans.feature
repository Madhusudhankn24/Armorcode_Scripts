Feature: Scans module

  Scenario: Login to application
    Given User log in to application
    Then Armorcode dashboard should be displayed

  @SC-016
  Scenario: verify upload scan functionality sucess scan
    Given click on scans tab
    When Clear filter
    And click on Upload scan button
    And fill required fields in upload scan page
    And upload valid file
    And click on upload button
    Then Sucess message should be displayed in scans
    And tick mark icon should be displayed in scan status
    
  @SC-005(pass)
  Scenario: Check pagination
    Given click on scans tab
    When Clear filter
    And check ten/page filter
    Then ten/page scans should be displayed
    When check twenty/page filter
    Then twenty/page scans should be displayed
    When check fifty/page filter
    Then fifty/page scans should be displayed
    When check hundred/filter
    Then hundred/page scans should be displayed

  @SC-006(pass)
  Scenario: Sorting functionality
    Given click on scans tab
    When Clear filter
    And click on Environment sorting
    Then asecnding Sorting should be displayed

  @SC-008(pass)
  Scenario: Verify Export Report button
    Given click on scans tab
    When Clear filter
    And click on Actiondots
    And click on export report
    Then Report should be downloaded

  @SC-007(pass)
  Scenario: Verify Result details
    Given click on scans tab
    When Clear filter
    And Apply new filter
    And click on Actiondots
    And click on Result details
    Then User should redirected to Findings page for that particular scan

  @SC-015(pass)
  Scenario: Verify upload scan button
    Given click on scans tab
    When Clear filter
    And click on Upload scan button
    Then Scan Upload popup should be displayed

  @SC-036(pass)
  Scenario: Check file name is shown when hovered on download report button
    Given click on scans tab
    When Clear filter
    And click on Actiondots
    And Mousehover on export report
    Then filename tooltip should be displayed

  @SC-037(pass)
  Scenario: Check the inbuilt refresh button
    Given click on scans tab
    When Clear filter
    And click on refresh
    Then Scan page should be refreshed

 @SC-016
  Scenario: verify upload scan functionality unsucess scan
    Given click on scans tab
    When Clear filter
    And click on Upload scan button
    And fill required fields in upload scan page
    And upload sonarqube file in upload scan page
    And click on upload button
    Then Sucess message should be displayed in scans
    And cross icon should be displayed in scan status
    
  @SC-012(defect)
  Scenario: Check conection of scan tool
    Given click on scans tab
    When Clear filter
    And Apply new filter
    And check scan tool
    And click on scan id
    Then Redirecting to finding page and scan tool soruce should be same

  @SC-019
  Scenario: Ensure tooltip are present
    Given click on scans tab
    When mousehover on clear button
    Then clear button Tooltip should be displayed
    When mousehover on More button
    Then More button Tooltip should be displayed
    When mousehover on Upload_scan button
    Then Upload_scan button Tooltip should be displayed
    When mousehover on Reset_filter button
    Then Reset_filter button Tooltip should be displayed
    When mousehover on Additional_columns button
    Then Additional_columns button Tooltip should be displayed
    When mousehover on Refresh button
    Then Refresh button Tooltip should be displayed
    When mousehover on ascending_sort button
    Then ascending_sort button Tooltip should be displayed
    When mousehover on descending_sort button
    Then descending_sort button Tooltip should be displayed
    When mousehover on cancel_sort
    Then cancel_sort button Tooltip should be displayed
@SC-018
  Scenario: verify upload scan functionality without entering any inputs
    Given click on scans tab
    When Clear filter
    And click on Upload scan button
    And click on upload button
    Then Eror message should be displayed in all field
@SC-018
  Scenario: verify upload scan functionality without entering product and subproduct inputs
    Given click on scans tab
    When Clear filter
    And click on Upload scan button
    And Fill environment and sacn_tool field
    And click on upload button
    Then Eror message should be displayed in environment and sacn_tool field
@SC-018
  Scenario: verify upload scan functionality without entering scantool inputs
    Given click on scans tab
    When Clear filter
    And click on Upload scan button
    And fill product subproduct and environment field
    And click on upload button
    Then Eror message should be displayed in sacn_tool field

  @SC-026
  Scenario: Check .exe file accepting in upload scan
    Given click on scans tab
    When Clear filter
    And click on Upload scan button
    And fill required fields in upload scan page
    And upload .exe file
    Then Error msg should be displayed in .exe

  @SC-039
  Scenario: To verify Upload scan with empty file.
    Given click on scans tab
    When Clear filter
    And click on Upload scan button
    And fill required fields in upload scan page
    And upload empty file
    And click on upload button
    Then Should show - in Total, Duplicate, Resolved and New field