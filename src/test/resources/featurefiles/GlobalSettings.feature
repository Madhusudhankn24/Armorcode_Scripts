@Global_Settings_page
Feature: ALert Page funtionality

  Background: 
    Given User log in to application
    Then Armorcode dashboard should be displayed

  @GS-030
  Scenario: To verify Global Setting button
    When User clicks on global setting button
    Then Global setting page should be displayed

  @GS-031
  Scenario: To verify Edited Product/Sub Products & Projects Names on every where.
    When Verify user is on Global settings page
    When User clicks on Product/Subproduct status button
    Then Customize Product/Subproduct page should be displayed
    And Edit active status
    And Add new status and click on save
    Then Verify that added status is displaped

  @GS-041
  Scenario: To set the basis on which product risk score will be calculated.
    When Verify user is on Global settings page
    When User click on Risk Calculation type button
    Then Risk calculation type page is displayed
    Then Verify that three option Riskiest mean and Inferior is displayed
    And Along with Reset to Default button is displayed
    Then Verify Riskiest is selected by default

  @GS-047
  Scenario: To check SLA template configs
    When Verify user is on Global settings page
    When User clicks on Findings SLA button
    Then Findings SLA page is displayed
    Then Verify Default SLA template should displyed

  @GS-055
  Scenario: To verify deletion of SLA template
    When Verify user is on Global settings page
    When User Click on Add SLA button
    Then Add SLA popup should displayed
    When User enters name and description
    And User enters Critical,High,Medium and low for TraigeSLA,RemediationSLA and ResolutionSLA
    And Click on save
    Then Success popup should be displayed
    And Verify Created SLA is displayd in SLA page
    Then Delete Findings SLA and Check proper message displayed

  @GS-064
  Scenario: Verify Global Settings-Relese Management
    When Verify user is on Global settings page
    When User click on Release management
    Then Release management page should be displayed
    When User click on Add button
    And Release Gate popup should be displayed
    Then Verify that Global and specific options displayed

  @GS-085
  Scenario: Verify the Dashboard has all the data
    When Verify user is on Global settings page
    When User clicks on Dashboards
    And Dashboard page should be displayed
    Then Verify User is able to view OOB dashboards and Default dashboards

  @GS-086
  Scenario: when we hover on the pen Icon tooltip should be display
    When Verify user is on Global settings page
    And Mouse hovers on pencil icon besides dahshboards names
    Then Proper tooltip should be displayed

  @GS-087
  Scenario: when user Click on Pen icon edit dashboard popup should display
    When Verify user is on Global settings page
    And User click on edit icon
    Then Edit dashboard name popup should be displayed
    And User enter newname and click on save
    Then Verify New Dashboard name should be updated

  @GS-093
  Scenario: Verify the checkbox and dashboard name
    When Verify user is on Global settings page
    When user uncheck the dashboard name
    And Updated popup should be displayed
    Then Verify unchecked dashboard is displayed in deafult dashboard dropdown

  @GS-094
  Scenario: Verify the checkbox and dashboard name
    When Verify user is on Global settings page
    When user uncheck the dashboard name
    Then Updated popup should be displayed

  @GS-095
  Scenario: Verify Dashboard config functionality
    When Verify user is on Global settings page
    When User click on Configure dashboard
    Then Custom Dashboard page should display
    Then Verify User is able to add new and delete the widget

  @GS-099
  Scenario: Verify product/Sub product security Dashboard functionality
    When Verify user is on Global settings page
    When User clicks on product Sub product security Dashboard
    Then Custom dahsboard with Security dashboard should display

  @GS-100
  Scenario: Configure Product / Subproduct SSDLC Dashboard functionality
    When Verify user is on Global settings page
    When Configure Product Subproduct SSDLC Dashboard
    Then Custom dashboard with SSDLC dashboard should display

  @GS-101
  Scenario: Select the default Dashboard functionality
    When Verify user is on Global settings page
    And Click on default dashboard dropdown
    And Selects the SSDLC Healthcheck as default dashboard
    Then Success popup should displayed
    And Click logout button

  @GS-101
  Scenario: Select the default Dashboard functionality
    Then Verify SSDLC healthcheck dashboard should display

  @GS-103
  Scenario: Verify Reset to Default
    When Verify user is on Global settings page
    When User Click on ROI Calculation button
    Then ROI Calculation page should be displayed
    And Change the Man hour cost and Time
    And Click on Save
    Then Success popup should be display
    And Click on Reset to Default button
    Then Confirmation popup should display
    And Click on Yes
    Then Man hour and Time should be reset

  @GS-104
  Scenario: Verify Error message of ROI Calculation
    When Verify user is on Global settings page
    And Verify user is on ROI calculation page
    And Clear the value from Both fields
    And Click on Save
    Then Man hour and time required error message should display

  @GS-105
  Scenario: Verify the success popup mesage
    When Verify user is on Global settings page
    And Verify user is on ROI calculation page
    And Change the Man hour cost and Time
    And Click on Save
    Then Success popup should display

  @GS-107
  Scenario: Verify that User can esaily Change Title name of Respective Fields
    When Verify user is on Global settings page
    When User click on Titles button
    Then Titles page should display
    And Click on Manage and change product
    And Verify that popup should display
    And Click on Manage and change sub product
    And Verify that popup should display
    Then Verify in Manage Section specific name should display

  @GS-108
  Scenario: Verify the Title page
    When Verify user is on Global settings page
    When User click on Titles button
    Then Titles page should display

  @GS-109
  Scenario: Verify that User can esaily Change Title name of Respective Fields
    When Verify user is on Global settings page
    And Verify user is on titles page
    And Click on Manage and change product
    And Click on Reset to default button
    Then Confirmation popup is displayed
    And Click on Yes button
    And Success Popup should display
    Then Verify Values set deafault automatically

  @GS-110
  Scenario: Verify that Editable titles should be Disaply at Respective place.
    When Verify user is on Global settings page
    And Verify user is on titles page
    And Click on Finding status change the open status
    And Verify that popup should display
    Then Verify in findings page edited status should display properly

  @GS-110
  Scenario: Verify that Editable titles should be Disaply at Respective place.
    When Verify user is on Global settings page
    And Verify user is on titles page
    And Click on Finding status change the open status
    And Verify that popup should display
    Then Reset to default findings status

  @GS-116
  Scenario: Verify That Devops Widget Configuration
    When Verify user is on Global settings page
    And Click on Devops Widget Configuration button
    Then Devops Widget Configuration page should be display

  @GS-117
  Scenario: Verify the Reset to Default button
    When Verify user is on Global settings page
    And Verify user is on Devops Widget Configuration page
    And Edit some fields and click on Submit button
    And Verify submit popup should display
    And Click on Reset button
    Then The Reset data should display

  @GS-118
  Scenario: Verify the submit button
    When Verify user is on Global settings page
    And Verify user is on Devops Widget Configuration page
    And Edit some fields and click on Submit button
    And Verify submit popup should display
    And Click on Reset button
    Then The Reset data should display

  @GS-120
  Scenario: Verify the Multi ticket setting page
    When Verify user is on Global settings page
    And Click on Multi ticket setting button
    Then Multi ticket setting page should display
    When User enables multi ticket option
    Then popup should display and click on yes
    Then Updated Success popup should display
    And User disables multi ticket option
    Then popup should display and click on yes
    Then Updated Success popup should display

  @GS-127
  Scenario: Verify Global settings finding status page
    When Verify user is on Global settings page
    And Click on Finding status button
    And Finding status page should display
    #need clarification
    Then Verify accept Risk Prepetual option will be already enabled

  @GS-138
  Scenario Outline: Verify Global settings product status page
    When Verify user is on Global settings page
    And Click on product status button
    And product status page should display
    Then Verify that Customize product status <options> should display

    Examples: 
      | options     |
      | Active      |
      | Suspended   |
      | End of life |
      | Add Status  |

  @GS-139
  Scenario: Verify user able to Add product status
    When Verify user is on Global settings page
    And Click on product status button
    And Click on Add status button
    Then Added status popup should display
    And Add new status
    And Click on save button
    Then Verify added status should display

  @GS-150
  Scenario Outline: Verify Risk Score page
    When Verify user is on Global settings page
    And Click on Risk Score button
    Then Risk Score page should display
    And Verify that <Options> should display

    Examples: 
      | Options                  |
      | Product Dropdown         |
      | SubProduct Dropdown      |
      | Environment Dropdowns    |
      | Inverse RiskScore Toggle |
      | Calculate Likelihood     |
      | Calculate Impact         |
      | Risk Score Preview       |
