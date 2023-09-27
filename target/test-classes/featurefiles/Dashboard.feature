@Dashboard
Feature: Dashboard Page funtionality

  Background: 
    Given User log in to application
    Then Armorcode dashboard should be displayed

  @Custom_Dashboard @DASH-018 @TestRail(6)
  Scenario: Date filter with different custom date range and with Common options.
    Given Verify user is on Dashboard page
    Then Selects All BU dashboard
    And Click on Date filter
    And Selects Date range and click on Apply
    Then Verify Should display data as per selected date range or option.
    And Selects Date common options and click on Apply
    Then Verify Should display data as per selected date range or option.

  @Custom_Dashboard @DASH-019
  Scenario: Verify Customize Dashboard
    Given Verify user is on Dashboard page
    And Click on Dashboard filter and Selects Creat dashboard option
    Then Verify Custom dashboard page should display

  @Custom_Dashboard @DASH-020
  Scenario: Verify Customize Dashboard Search field
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Click on Search field and Search for Widgets
    Then Related Widgets should display

  @Custom_Dashboard @DASH-023
  Scenario: Verify Customize Dashboard cancel field
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Click on Cancel button
    Then Verify User should able to back jump on default dashboard

  @Custom_Dashboard @DASH-024
  Scenario: Verify Customize Dashboard Next field
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page

  @Custom_Dashboard @DASH-025
  Scenario: Verify Customize Dashboard Add Name field.
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Click on Save button
    Then Verify dashboard created popup should display
    Then Verify Customize Dashboard should be created as same name which is added by user

  @Custom_Dashboard @DASH-026
  Scenario: Verify Customize Dashboard Add Product /Subproduct Field
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Selects products and subproducts By individual
    And Click on Save button
    And Verify dashboard created popup should display
    Then Verify that able to view particular product/subproduct Data on Customize Dashboard.

  @Custom_Dashboard @DASH-027
  Scenario: Verify Customize Dashboard Add Environment Field
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Selects Production Environment
    And Click on Save button
    And Verify dashboard created popup should display
    Then Verify data will Populate in all widget according to Production Enviroment.
    And Click on Edit button
    Then User should navigate to custom dashboard page
    And Click on Next button
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Selects Statging Environment
    And Click on Save button
    And Verify dashboard created popup should display
    Then Verify data will Populate in all widget according to Staging Enviroment
    And Click on Edit button
    Then User should navigate to custom dashboard page
    And Click on Next button
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Selects Both production and staging Environment
    And Click on Save button
    And Verify dashboard created popup should display
    Then Verify data will be Populate in all widget According to Both Env.

  @Custom_Dashboard @DASH-028
  Scenario: Verify Customize Dashboard Add Date Range Field
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Verify Default Date range is "Last 7 days"
    And Click on Save button
    Then Verify Customize dashboard is created for "Last 7 days"
    And Click on Edit button
    Then User should navigate to custom dashboard page
    And Click on Next button
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Selects another Date Range
    And Click on Save button
    Then Verify Customize dashboard is created for Custom date range

  @Custom_Dashboard @DASH-030
  Scenario: Verify Enable public Dashboad Funtionality
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Enable public toggle
    Then Verify product and subproduct dropdown is disabled
    And Click on Save button
    Then Verify dashboard created popup should display
    And Click on Edit icon
    Then Verify Share button is disabled

  @Custom_Dashboard @DASH-031
  Scenario: Verify Save & Add Another button Funtionality
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Click on save & add another button
    Then Verify dashboard created popup should display
    Then Verify user should jump on the main page of the customize dashboard.

  @Custom_Dashboard @DASH-032
  Scenario: Verify Save button Funtionality
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Click on Save button
    Then Verify dashboard created popup should display
    Then Verify Customize Dashboard should be created as same name which is added by user

  @Custom_Dashboard @DASH-033
  Scenario: Verify customize dashboard Date range Funtionality
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    Then Verify User should able to change Date Range on the customize Dashboard.

  @Custom_Dashboard @DASH-034
  Scenario: Verify Edit custom dashboard Funtionality
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Selects Production Environment
    And Click on Save button
    And Verify dashboard created popup should display
    Then Verify data will Populate in all widget according to Production Enviroment.
    And Click on Edit button
    Then User should navigate to custom dashboard page
    And Click on Next button
    Then Verify User should able to jump on next page
    Then Verify User should able to edit Customize dashboard.

  @Custom_Dashboard @DASH-035
  Scenario: Verify Delete dashboard Funtionality
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Click on Save button
    Then Verify dashboard created popup should display
    And Click on Edit and click on delete button
    And Enter Delete Text and Click on Delete
    Then Verify delete popup should display

  @Custom_Dashboard @DASH-046
  Scenario: Verify Custom Widget feature Funtionality
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget
    Then Verify Added widget is displayed

 @Custom_Dashboard @DASH-124
  Scenario: Verify Custom dashboard > Source Funtionality
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Add One Source tool
    And Click on Save button
    Then Verify dashboard created popup should display
    Then Verify Create dashboard is displayed with one Particular source
    And Click on Edit button
    Then User should navigate to custom dashboard page
    And Click on Next button
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Add Another Source tool
    And Click on Save button
    Then Verify dashboard created popup should display
    Then Verify Create dashboard is displayed with multiple source
    And Click on Edit button
    Then User should navigate to custom dashboard page
    And Click on Next button
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Delete one Source tool
    And Click on Save button
    Then Verify dashboard created popup should display
    Then Verify Create dashboard is displayed with one source

 @Custom_Dashboard @DASH-151
  Scenario: Verify Create dashboard with any widget > Three dot > Export as PDF
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Click on Save button
    Then Verify dashboard created popup should display
    And Click on Three dots
    And Click on Export as PDF button
    Then Verify Dashboard is ready for export popup shoudl display
    And Click on popup to download PDF
    Then Verify pdf is downloaded

 @Custom_Dashboard @DASH-153
  Scenario: Create dashboard > Add All widget with Custom dashboard
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Click on Custom widget
    And Verify Custom widget added popup should display
    And Add details for custom widget
    And Add other widgets with custom widgets
    And Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Click on Save button
    Then Verify dashboard created popup should display
    Then Verify data should be coming properly in all widget.

 @Custom_Dashboard @DASH-223
  Scenario: Global settings > Select custom dashboard as Set as Default
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Enable public toggle
    And Click on Save button
    Then Verify dashboard created popup should display
    When Verify user is on Global settings page
    And Click on default dashboard dropdown
    And Selects the Custom dashboard as default dashboard
    Then Success popup should displayed
    And Click logout button

 @DASH-223
  Scenario: Global settings > Select custom dashboard as Set as Default
    Then Verify Customize Dashboard should be created as same name which is added by user

 @Custom_Dashboard @DASH-224
  Scenario: Verify Product /subproduct filter  > Filter by Tag functionality
    Given Verify user is on Dashboard page
    And Verify User is on Custom Dashboad page
    And Add One widget and Click on next
    Then Verify User should able to jump on next page
    And Add dashboard name
    And Select product/subproduct dropdown
    And Click on Filter product by tag
    And Enter valid Key and value
    And Click on Apply
    Then Verify product should be Filter out according to added Key/tag or value

 @Security_Dashboard @DASH-229
  Scenario: check behaviour of  top subproducts
    Given Verify user is on Dashboard page
    And Verify Top products widget is displayed
    And Verify It should show most vulnerable subproduct
    Then Verify It should show risk score of subproduct with risk trend sign

 @Security_Dashboard  @DASH-230
  Scenario: Count verification wrt Findings Status of dashbaord vs Finding Page
    Given Verify user is on Dashboard page
    And Verify Finding status widget is displayed
    And Verify i icon and copy contetnt icon is displayed on top of widget
    And Verify count of Open status with findings page
    And Verify count of Confirm status with findings page
    And Verify count of Accept Risk status with findings page
    And Verify count of False+ve status with findings page
    And Verify count of Mitigated status with findings page
    And Verify count of Suppressed status with findings page
    Then Verify Total count of status with findings page

 @Security_Dashboard @DASH-231
  Scenario: Validation of redirection flow to finding page wrt Findings Status
    Given Verify user is on Dashboard page
    And Verify Finding status widget is displayed
    And click on any findings count
    Then Verify user should navigate to findings page

 @Security_Dashboard @DASH-233
  Scenario: Validation of redirection flow to finding page wrt New Findings
    Given Verify user is on Dashboard page
    And Verify New Findings widget is displayed
    And Click on one finding in new Findings
    Then Verify user should navigate to findings page

@Security_Dashboard  @DASH-235
  Scenario: To check behaviour of findings over time widget
    Given Verify user is on Dashboard page
    And Verify Findings over time widget is displayed
    And Verify time period dropdown is displayed
    And Verify Line and Area option is displayed
    And Verify Log scale toggle is displayed
    And Click on Filter
    Then Verify Severity scantype and tool option should displayed
    Then Verify Count of findings is displayed with graphical form
    And Click on Viewmore option
    Then Verify can view the count of findings individually.

@Security_Dashboard  @DASH-238
  Scenario: Check behaviour of Security Dashboard page after login
    Given Verify user is on Dashboard page
    Then Verify User should land on the preferred Dashboard page.

 @Security_Dashboard @DASH-239
  Scenario: Check behaviour of Security Dashboard page once the page is loaded
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Verify Overall Risk score widget is displayed
    And Verify Enterprise Product Matrix is displayed
    And Verify Top products widget is displayed
    And Verify Finding status widget is displayed
    And Verify New Findings widget is displayed
    And Verify Findings by product widget is displayed
    And Verify Findings over time widget is displayed
    And Verify Findings Due date widget is displayed
    And Verify Resolution SLA widget is displayed
    And Verify SLA Breaches by Product widget is displayed
    Then Verify SLA Breaches by Team widget is displayed

 @Security_Dashboard @DASH-240
  Scenario: Check behaviour of Security Dashboard page when user clicks in different tabs like Production and Staging
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Click on Statging
    Then Verify Statging is working
    And Click on Production
    Then Verify production is working

 @Security_Dashboard @DASH-249
  Scenario: Check behaviour when user Navigates to Top Product Widget
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Verify Top products widget is displayed
    Then Verify The widget should display the top 5 products

@Security_Dashboard  @DASH-255
  Scenario: Check behaviour when user navigates to New Findings widget
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Verify New Findings widget is displayed
    And Verify displayed different severities for last "24" hours
    And Verify displayed different severity for last "7" days
    Then Verify displayed different severities for last "month" days

 @Security_Dashboard @DASH-258
  Scenario: Check behaviour when user navigates to Findings By Product widget
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Verify Findings by product widget is displayed
    Then Verify The top "5" products with most number of critical and high findings should be displayed

@Security_Dashboard  @DASH-284
  Scenario: Check behaviour when user Navigates to Findings Due Date widget
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Verify Findings Due date Widget is displayed
    And Verify that Overdue count is displayed
    And Verify that Due in 1D count is displayed
    And Verify that Due in 7D count is displayed
    And Verify that Due in 14D count is displayed
    And Verify that Due in 30D count is displayed

@SSDLC_Dashboard  @DASH-305
  Scenario: Check behaviour SSDLC Dashboard functionality
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select SSDLC Healthcheck dashboard
    Then Verify Apply filter by date should display
    And Verify SSDLC Dashboard should display Products
    And Verify SSDLC Dashboard should display Sub Products
    And Verify Integrated sources/tool dispalyed with Source/tool type
    Then Verify SSDLC Dashboard should display Findings and status

@SSDLC_Dashboard  @DASH-306
  Scenario: Check behaviour SSDLC Dashboard > icon
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select SSDLC Healthcheck dashboard
    And Verify Tools/Souce configured for the products & Subproducts should display
    And Verify Each tool should display tool type
    And Verify Each tool should display Findings
    And Verify Each tool should display Last Scan
    And Verify Each tool should display Status
    Then Total findings which is the sum of critical, high, medium and low should display properly

 @SSDLC_Dashboard @DASH-307
  Scenario: Check All the tool type and total number of findings and overall status
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select SSDLC Healthcheck dashboard
    And Select product
    And verify It should display all the tools which are there in collapsible field
    Then Verify it should show all the tool type and  total number of findings and overall status

@SSDLC_Dashboard  @DASH-308
  Scenario: Check Count of findings with findings page
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select SSDLC Healthcheck dashboard
    And Select product
    And Click on Total findings option
    And Verify It navigate to findings page
    Then Verify count of findings should match with finding page findings

@SSDLC_Dashboard  @DASH-309
  Scenario: Check Count of All different Severity of Findings with findings page
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select SSDLC Healthcheck dashboard
    And Select product
    And Click Critical findings option
    And Verify It navigate to findings page
    Then Verify count of Critical findings should match
    And Click on High findings option
    And Verify It navigate to findings page
    Then Verify count of High findings should match
    And Click on medium findings option
    And Verify It navigate to findings page
    Then Verify count of medium findings should match
    And Click on Low findings option
    And Verify It navigate to findings page
    Then Verify count of Low findings should match

@Developer_Dashboard  @DASH-330
  Scenario: My Findings Widget functionality
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select Devolper dashboard
    And Verify My findings widget is displayed
    And Click on Severity colour
    Then Verify It will be redirected to findings page with specified filter applied

 @Developer_Dashboard @DASH-331
  Scenario: My SLA Notification Widget functionality
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select Devolper dashboard
    And Verify My SLA Notification Widget is displayed
    And Click on Total Number under the Column (Overdue, Today and In Next 7 Days)
    Then Verify It will be redirected to findings page with specified filter applied

 @Developer_Dashboard @DASH-332
  Scenario: My Findings by Product widget functionality
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select Devolper dashboard
    And Verify My Findings by product widget is displayed
    And Click on product Graph
    Then Verify It will be redirected to findings page with specified filter applied

 @Developer_Dashboard @DASH-333
  Scenario: My Findings by Source widget functionality
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select Devolper dashboard
    And Verify My Findings by sorce widget is displayed
    And Click on source Graph
    Then Verify It will be redirected to findings page with specified filter applied

 @Developer_Dashboard @DASH-334
  Scenario: My Findings by Severity/Status widget functionality
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select Devolper dashboard
    And Verify My Findings by Severity/Status widget is displayed
    And Click on Total number under Open and Confirm columns
    Then Verify It will be redirected to findings page with specified filter applied

 @Developer_Dashboard @DASH-335
  Scenario: My Open Tickets widget functionality
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select Devolper dashboard
    And Verify My open tickets widget is displayed
    And Click on Total number under severity name column
    Then Verify It will redirect to Tickets page with specfic filter applied

 @Developer_Dashboard @DASH-337
  Scenario: Global filter application on developer dashboard functionality
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select Devolper dashboard
    And Apply global filter
    Then Verify Records should be displayed based on Global filter applied

@Developer_Dashboard  @DASH-338
  Scenario: Check Date filter in developer dashboard is working
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select Devolper dashboard
    And Click on developer dashboard date filter
    And Apply filter
    Then Verify Records should be displayed based on Date filter applied

@Developer_Dashboard  @DASH-339
  Scenario: Check Production staging tab data validation
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    And Select Devolper dashboard
    And Check for Staging Environment tab
    And Check for Production Environment tab
    Then Verify Records should be divided based on the Environment

@Developer_Dashboard  @DASH-340
  Scenario: Global settings > Select Developer dashboard as Set as Default
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    When Verify user is on Global settings page
    And Click on default dashboard dropdown
    And Select Developer dashboard as deafult
    Then Success popup should displayed
    And Click logout button

  @DASH-340
  Scenario: Verify Developer dashboard is displayed
    Then Verify developer Dashboard should be displayed
    When Verify user is on Global settings page
    And Click on default dashboard dropdown
    Then Select Security dashboard as deafult
    Then Success popup should displayed

 @ALL_BU_Dashboard @DASH-372
  Scenario: All BU dashboard enable/disable from Global setting page.
    Given Verify user is on Dashboard page
    And Verify User should land on the preferred Dashboard page.
    When Verify user is on Global settings page
    And Disable the dashboard
    And Verify in Dashboard drop down the disabled dashboard should not displayed
    And Verify user is on Global settings page
    And Enable the same dashboard
    And Verify in Dashboard drop down the dashboard should display

 @ALL_BU_Dashboard @DASH-373
  Scenario: All BU > Export as CSV link text button
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    And Click on export as CSV
    Then Verify file should downloaded
    Then File downloaded popup should display

 @ALL_BU_Dashboard @DASH-374
  Scenario: All BU dashboard with different environemnt.
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    And Click on All BU staging Environment
    And CLick on All BU production Environment
    Then Verify As per selected Environment we can see data

@ALL_BU_Dashboard  @DASH-375
  Scenario: All BU dashboard with different filters.
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    And Select Severity from Severity dropdown
    And Click on Apply button
    Then Verify should display data as per selected filter or options.

 @ALL_BU_Dashboard @DASH-376
  Scenario: Tool tip to all of the trend indicators
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    Then Verify should display tool tip infront of risk score

@ALL_BU_Dashboard  @DASH-377
  Scenario: All BU dashboard Save Search feature
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    And Select Severity from Severity dropdown
    And Click on Apply button
    And Click on Save as
    And Enter name and click on save
    Then Verify Added popup should dispaly
    Then Verify Should dispaly and work added save search filter properly.

 @ALL_BU_Dashboard @DASH-378
  Scenario: All BU dashboard Reset Filter
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    And Select Severity from Severity dropdown
    And Click on Apply button
    And Click on Reset filter button
    Then Verify The applied filter data should be reset

@ALL_BU_Dashboard  @DASH-379
  Scenario: ALL BU> Findings Over Time widget functionality
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    And click on Finding over time & status Drop-dwon arrow
    Then Verify User can see Finding over time and Finding status Widget.
    And Click on any BU Drop-down arrow
    Then Verify User can aslo see Finding over time and Finding status Widget.

 @ALL_BU_Dashboard @DASH-382
  Scenario: All Bu Dashboard > Only BU Global filter is applicable
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    And Click on GLobal filter
    Then Verify The user is only allowed to change BUs from the global filte
    Then Verify Subproducts and tool category are disabled

 @ALL_BU_Dashboard @DASH-385
  Scenario: All BU Additional column functionality
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    And Mouse hover over Additional column
    And Verify Tooltip should be display
    And Click on Additional Column
    Then Verify option should be work Properly.

 @ALL_BU_Dashboard @DASH-386
  Scenario: All_Bu_Dashboard >Filters functionality
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    And Select Severity from Severity dropdown
    And Click on Apply button
    And Click on Reset filter button
    Then Verify The applied filter data should be reset


 @ALL_BU_Dashboard @DASH-389
  Scenario: All_Bu_Dashboard > Click on any BU
    Given Verify user is on Dashboard page
    And Selects All BU dashboard
    And Click on any BU
    Then Verify User should land on the preferred Dashboard page.

@SSDLC_Dashboard  @DASH-394
  Scenario: To check behaviour of navigation to ssdlc dashboard
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    Then Verify should show ssdlc for selected product and All subproduct

 @SSDLC_Dashboard @DASH-395
  Scenario: To check behaviour Product SSDLC Dashboard>> Devops process
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    Then Verify 7 phases are displayed
    And Verify each phase should contain respective scan type
    And Verify each finding should be displayed on each phase based on its scan type
    And Mouse hover over N/A findings
    Then Verify it should show no tools configured tooltip

 @SSDLC_Dashboard @DASH-396
  Scenario: To check behaviour Product SSDLC Dashboard>>Devops process > Plan
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And CLick on SSDLC findings
    Then Verify user should navigate to findings page
    And Verify the findings date should reflect in tool tip
    And Verify if no tool is configured it should show No tools configured

@SSDLC_Dashboard  @DASH-401
  Scenario: To check behaviour Product SSDLC Dashboard>>Devops process > Code
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And CLick on SSDLC findings
    Then Verify user should navigate to findings page
    And Verify findings shown in the dashboard should be same with the finding page
    Then Verify it should apply appropriate filter in findings page

@SSDLC_Dashboard  @DASH-408
  Scenario: To check behaviour of Findings by source/scan type
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Verify Findings by Sorce/scan type widget is displayed
    Then Verify It should show findings by its source type or scan type

@SSDLC_Dashboard  @DASH-414
  Scenario: To check behaviour of Product SSDLC Dashboard  >Appsec tool status
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Verify Appsec tool status widget is displayed
    Then Verify it should show source, source type, scan status, tool status, last run

@SSDLC_Dashboard  @DASH-415
  Scenario: To check behaviour of Infrastructure tool status > Product SSDLC Dashboard
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Verify Infrastructure tool status widget is displayed
    Then Verify Infrascture tool should show source, source type, scan status, tool status, last run

@SSDLC_Dashboard  @DASH-416
  Scenario: To check behaviour of ci/cd and notification status  > Product SSDLC Dashboard
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Verify CI/CD and notification status widget is displayed
    Then Verify CI/CD tool should show source, scan status, tool status, last run

 @SSDLC_Dashboard @DASH-434
  Scenario: Go to SSDLC dashboard > Hover on the Total findings
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product Demo Application
    And Mouse hover over total findings in Build
    Then Verify Tooltip should show the total findings count and configured tool

 @SSDLC_Dashboard @DASH-435
  Scenario: Go to SSDLC dashboard > Hover on the Bar
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Mouse Hover over bar in scan trend
    Then Verify If the bar is green it should show the configured security tool name.

 @SSDLC_Dashboard @DASH-436
  Scenario: Go to SSDLC dashboard > Hover on the Bar
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Mouse Hover over bar in scan trend
    Then Verify It should show the count of pass scan

 @SSDLC_Dashboard @DASH-437
  Scenario: Go to SSDLC dashboard > Click on the date filter
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Click on date filter in scan trend widget
    Then Verify Default date filter should be selected for 7 days

 @SSDLC_Dashboard @DASH-438
  Scenario: Go to SSDLC dashboard > Click on the date filter
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Click on date filter
    And Change the date options
    Then Verify It should change the date accordingly
    Then Verify data should reflect on the scan trend graph.

 @SSDLC_Dashboard @DASH-440
  Scenario: Go to SSDLC dashboard > Finding by source / Scan type
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product Demo Application
    And Mouse Hover over bar in findings by source widget
    Then Verify It should show the exact count if we compare with the findings

@SSDLC_Dashboard  @DASH-443
  Scenario: Try to turn off/on the toggle button for log scale
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product Demo Application
    And Turn on log scale toggle
    Then Verify it should expand the bar of source type data

 @SSDLC_Dashboard @DASH-444
  Scenario: Go to SSDLC dashboard > Click on the filter
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product Demo Application
    And Click on sourcetype filter
    Then verify It should only accept max 5 items

@SSDLC_Dashboard  @DASH-445
  Scenario: Product SSDLC Dashboard  >Appsec tool status
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    Then Verify sorting in Appsec widget is working

@SSDLC_Dashboard  @DASH_446
  Scenario: Product SSDLC Dashboard  >Appsec tool status
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Move to Appsec tool status widget
    Then Verify By clicking filter a dropdown should display

@SSDLC_Dashboard  @DASH_447
  Scenario: Product SSDLC Dashboard  >Appsec tool status
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Move to Appsec tool status widget
    Then Verify tools should displayed with other configuration

@SSDLC_Dashboard  @DASH_448
  Scenario: Product SSDLC Dashboard  >Appsec tool status
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Move to Appsec tool status widget
    And Click on Tool in source
    Then Verify It should redirect into the security tool page.

 @SSDLC_Dashboard @DASH_449
  Scenario: Product SSDLC Dashboard  >Appsec tool status
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Move to Appsec tool status widget
    Then Verify last run should show the date and the time.

 @SSDLC_Dashboard @DASH_452
  Scenario: Go to SSDLC dashboard > Check appsec tool status
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on SSDLC product
    And Move to Appsec tool status widget
    Then Verify Only appsec tools should be visible in appsec tool status

@SSDLC_Dashboard  @DASH_453
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on Juiceshop product
    And Move to Infrastructure tool status widget
    Then Verify By click on sort a sorting is working

 @SSDLC_Dashboard @DASH_454
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on Juiceshop product
    And Move to Infrastructure tool status widget
    Then Verify Click on filter a drop down should be visible.

 @SSDLC_Dashboard @DASH_455
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on Juiceshop product
    And Move to Infrastructure tool status widget
    Then Verify All the tools should be listed which are configured

 @SSDLC_Dashboard @DASH_456
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on Juiceshop product
    And Move to Infrastructure tool status widget
    Then Verify It should show the date and the time when security tool is used

@SSDLC_Dashboard  @DASH_459
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on Juiceshop product
    And Move to Infrastructure tool status widget
    And CLick on Infrastructure security tool
    Then Verify It should redirect into the security tool page.

 @SSDLC_Dashboard @DASH_460
  Scenario: ci/cd and notification status  > Product SSDLC Dashboard
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on DemoApplication product
    And Move to CI/CD Notification widget
    Then Click on sorting and verify sorting is working

@SSDLC_Dashboard  @DASH_461
  Scenario: ci/cd and notification status  > Tool Status
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on DemoApplication product
    And Move to CI/CD Notification widget
    Then Verify Tool status sorting work in ascending , descending and cancel sorting

 @SSDLC_Dashboard @DASH_462
  Scenario: ci/cd and notification status  > Last Run
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on DemoApplication product
    And Move to CI/CD Notification widget
    Then Verify Last Run should show the date and the time..

@SSDLC_Dashboard  @DASH_463
  Scenario: ci/cd and notification status  > Check Tool status
    Given Verify user is on Dashboard page
    And Selects SSDLC dashboard
    Then Verify user is on SSDLC dashboard page
    And Click on DemoApplication product
    And Move to CI/CD Notification widget
    Then Verify Only active tools should be visible in the CI/CD status listing

  @CTO_Dashboard
  Scenario: Check behaviour when user navigates to CTO dashboard
    Given Verify user is on Dashboard page
    And Selects CTO Dashboard
    Then Verify User is on CTO Dashboard page
    And Verify Emerging Threats widget is displayed
    And Verify Top Five Open Tickets widget is displayed
    And Verify Vulnerability Trend widget is displayed
    And Verify Average Time To Remediate widget is displayed
    And Verify Top Teams widget is displayed
    And Verify OWASP Training Requirement By Team widget is displayed
    And Verify Findings By Team Bar widget is displayed
    And Verify Release Gate Failures By Product widget is displayed
    Then Verify Closed Ticket Statistics widget is displayed

 @CTO_Dashboard @DASH-466
  Scenario: Check behaviour when user navigates to Top Five Open Tickets widget
    Given Verify user is on Dashboard page
    And Selects CTO Dashboard
    Then Verify User is on CTO Dashboard page
    And Verify Top Five Open Tickets widget is displayed
    And Verify Should display Top 5 tickets with details info
    Then Verify Ticket ID, Severity, Title and Ticket Age column should be visible

 @CTO_Dashboard @DASH-469
  Scenario: Check behaviour when user navigates to Vulnerability Trend widget
    Given Verify user is on Dashboard page
    And Selects CTO Dashboard
    Then Verify User is on CTO Dashboard page
    And Navigate to Vulnerability trend widget
    And Verify A graph should be plotted with Mitigated vs Non Mitigated findings
    Then Verify Counts should match with the count on findings page and security dashboard

 @CTO_Dashboard @DASH-474
  Scenario: Check behaviour when user navigates to Findings By Team (Bar) widget
    Given Verify user is on Dashboard page
    And Selects CTO Dashboard
    Then Verify User is on CTO Dashboard page
    And Navigate to  Findings By Team widget
    And This widget should display the most critical Team by Critical/High findings

 @CTO_Dashboard @DASH-480
  Scenario: Check behaviour when user clicks on Production / Staging tab
    Given Verify user is on Dashboard page
    And Selects CTO Dashboard
    Then Verify User is on CTO Dashboard page
    And Click on Staging tab
    Then Verify All the data with respect to the Staging envrionment should be visible.
    And Click on Production tab
    Then Verify All the data with respect to the Production envrionment should be visible.

 @TeamSummery_Dashboard @DASH-494
  Scenario: Navigate to Global Setting Page_Select Dashboard option
    Given Verify user is on Dashboard page
    And Verify user is on Global settings page
    And Verify user is on Dashboard
    And Verify User is able to enable/disable dashboards
    Then Verify After Enable user can see dashboard on Home page dashboard dropdown

 @TeamSummery_Dashboard @DASH-495
  Scenario: Click on Production and Staging Option from top side
    Given Verify user is on Dashboard page
    And Selects Teams Summery Dashboard
    Then Verify User is on Teams Summery Dashboard page
    And Click on Staging tab
    Then Verify All the data with respect to the Staging envrionment should be visible.
    And Click on Production tab
    Then Verify All the data with respect to the Production envrionment should be visible.

 @TeamSummery_Dashboard @DASH-496
  Scenario: All Sortings and Reset filter feature on Teams Summary dashboard.
    Given Verify user is on Dashboard page
    And Selects Teams Summery Dashboard
    Then Verify User is on Teams Summery Dashboard page
    And Click on all Sortings should work properly
    And Click on Reset Filter
    Then Verify Reset filter should work properly

 @TeamSummery_Dashboard @DASH-498
  Scenario: Tool tip to all of the trend indicators
    Given Verify user is on Dashboard page
    And Selects Teams Summery Dashboard
    Then Verify User is on Teams Summery Dashboard page
    Then Verify Should display tool tip infront of risk score

 @TeamSummery_Dashboard @DASH-499
  Scenario: Findings coloums_Teams Summary dashboard
    Given Verify user is on Dashboard page
    And Selects Teams Summery Dashboard
    Then Verify User is on Teams Summery Dashboard page
    And Verify Critical high and total findings displayed
    Then Verify after click on it it should redirect to findings page with proper data.

 @TeamSummery_Dashboard @DASH-500
  Scenario: Click on arrow button to expand Teams Information
    Given Verify user is on Dashboard page
    And Selects Teams Summery Dashboard
    Then Verify User is on Teams Summery Dashboard page
    And CLick on Expand button
    Then Verify Should display Burn Up By Findings/Team Graph,Existing Findings

 @TeamSummery_Dashboard @DASH-501
  Scenario: Expand button of Product
    Given Verify user is on Dashboard page
    And Selects Teams Summery Dashboard
    Then Verify User is on Teams Summery Dashboard page
    And CLick on Expand button
    And Click on product arrow
    Then Verify Should display all Products & Subproducts configured by team.

@TeamSummery_Dashboard  @DASH-502
  Scenario: Product Name[Link Text button]
    Given Verify user is on Dashboard page
    And Selects Teams Summery Dashboard
    Then Verify User is on Teams Summery Dashboard page
    And CLick on Expand button
    And Click on product arrow
    And Click on Product name
    Then Verify Should redirect and open Product dashboard page.

@TeamSummery_Dashboard  @DASH-503
  Scenario: Sub Product Name[Link Text button]
    Given Verify user is on Dashboard page
    And Selects Teams Summery Dashboard
    Then Verify User is on Teams Summery Dashboard page
    And CLick on Expand button
    And Click on product arrow
    And Click on sub Product name
    Then Verify Should redirect and open Product dashboard page.

 @CISO_Dashboard @DASH-509
  Scenario: Navigate to Date filter feature at top right corner
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Verify CISO Dashboard date filter is displayed
    And Apply different date filter
    Then Verify the findings should be displayed accordingly
    And Click on Date clear
    Then Verify the filter should be reset and All data should be displayed.

 @CISO_Dashboard @DASH-510
  Scenario: CISO Dashboard > Risk Score
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    Then Verify Risk Score Field should be showing hightest Risk score.

 @CISO_Dashboard @DASH-514
  Scenario: Product summary >Click on any  product
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And CLick on CISO Product
    Then Verify It will be land on main dashboard with product and subproduct Filter.

 @CISO_Dashboard @DASH-526
  Scenario: Product summary >Click on any  product
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to Risk Score Trend Icon
    Then Verify CISO Should display tool tip infront of risk score

 @CISO_Dashboard @DASH-527
  Scenario: CISO Dashbaord > Apply Global filter
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Click on Global Filter
    Then Verify Global filter Should be apply on CISO Dashbaord

@CISO_Dashboard  @DASH-528
  Scenario: Global setting > Set as CISO Dashboard
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Verify user is on Global settings page
    And Click on default dashboard dropdown
    And Selects the CISO dashboard as default dashboard
    Then Success popup should displayed
    And Click logout button

  @DASH-528
  Scenario: Global setting > Set as CISO Dashboard
    Then Verify User is on CISO Dashboard page
    When Verify user is on Global settings page
    And Click on default dashboard dropdown
    Then Select Security dashboard as deafult
    Then Success popup should displayed

 @CISO_Dashboard @DASH-529
  Scenario: Global setting > Set as CISO Dashboard
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Click on Staging tab
    Then Verify All the data with respect to the Staging envrionment should be visible.
    And Click on Production tab
    Then Verify All the data with respect to the Production envrionment should be visible.

 @CISO_Dashboard @DASH-530
  Scenario: Product summary >Click on any Findings (Total)
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And CLick on CISO Total Findings
    Then Verify user should navigate to findings page
    Then Verify status should be only false +,open,Accept Risk,Confirm.

 @CISO_Dashboard @DASH-531
  Scenario: Product summary >Click on any Findings (Critical)
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And CLick on CISO Critical Findings
    Then Verify user should navigate to findings page
    Then Verify status should be only false +,open,Accept Risk,Confirm.

 @CISO_Dashboard @DASH-532
  Scenario: Product summary >Click on any Findings (High)
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And CLick on CISO High Findings
    Then Verify user should navigate to findings page
    Then Verify status should be only false +,open,Accept Risk,Confirm.

 @CISO_Dashboard @DASH-533
  Scenario: Product Summary> Action  > Click on box.
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And CLick on Box
    Then Verify proper tool tip should displayed
    Then Verify It will be land on main dashboard with product and subproduct Filter.

 @CISO_Dashboard @DASH-534
  Scenario: Product Summary> Type
    Given Verify user is on Dashboard page
    And Navigate Product page
    And Click on new product
    And Enter product name and Type
    And Add new Tag and value
    And Click on product next button
    And Add Teams option
    And Click on Submit
    Then Verify product Created success popup should display
    And Navigate Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    Then Verify Type is matching with created product

 @CISO_Dashboard @DASH-535
  Scenario: Product Summary >Tags
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    Then Verify Tags is Matching with created product

 @CISO_Dashboard @DASH-536
  Scenario: Product Summary >Security Owner
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    Then Verify Security owner is Matching with created product

 @CISO_Dashboard @DASH-537
  Scenario: Product Summary>Teams
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    Then Verify Teams is Matching with created product

@CISO_Dashboard  @DASH-538
  Scenario: Product Summary>Status
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    Then Verify Status is Matching with created product

@CISO_Dashboard  @DASH-539
  Scenario: Product Summary>Most Prevelant Vulnerabilities > Log scale
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to Most Prevelant Vulneribilities widget
    Then Verify Log scale toggle should work properly.

@CISO_Dashboard  @DASH-540
  Scenario: Product Summary>Most Prevelant Vulnerabilities> Description
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to Most Prevelant Vulneribilities widget
    Then Verify It should be Display CVE number and description

 @CISO_Dashboard @DASH-545
  Scenario: Product Summary>Most Critical Vulnerabilities>Show more
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to Most Prevelant Vulneribilities widget
    And Click on Show more
    Then verify It should be land on Insight page.

 @CISO_Dashboard @DASH-546
  Scenario: Product Summary>Most Prevelant Weaknesses>when hovering any Description
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to Most Prevelent Weakness widget
    Then Verify It should show whole Description
    And Mouse Hover over Description
    Then Verify Respective CWE Id is displayed

 @CISO_Dashboard @DASH-547
  Scenario: Product Summary>Most Prevelant Weaknesses> Click on any Findings(Critical)
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to Most Prevelent Weakness widget
    And Click on Crictical CWE findings
    Then Verify user should navigate to findings page
    Then Verify Critical filter is applied
    Then Verrify Count shouble be match with finding page

 @CISO_Dashboard @DASH-548
  Scenario: Product Summary>Most Prevelant Weaknesses>Click on any Findings(High)
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to Most Prevelent Weakness widget
    And Click on High CWE findings
    Then Verify user should navigate to findings page
    Then Verify High filter is applied
    Then Verrify Count should be match with finding page

@CISO_Dashboard  @DASH-549
  Scenario: Product Summary>Most Prevelant Weaknesses>Findings(Total)
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to Most Prevelent Weakness widget
    And Click on Total CWE findings
    Then Verify user should navigate to findings page
    Then Verify Total filter is applied
    Then Verrify Total Count should be match with finding page

 @CISO_Dashboard @DASH-550
  Scenario: Product Summary>Most Prevelant Weaknesses>show more
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to Most Prevelent Weakness widget
    And CLick on Show More Link
    Then verify It should be land on Insight page.

 @CISO_Dashboard @DASH-551
  Scenario: SLA Breaches by Product>Log Scale
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to SLA Breaches by Product widget
    Then Verify SLA Log scale toggle should work properly.

 @CISO_Dashboard @DASH-552
  Scenario: SLA Breaches by Product>Click on critical finding line
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to SLA Breaches by Product widget
    And Click on critical finding line
    Then Verify should land on finding page and Critical count should be match

 @CISO_Dashboard @DASH-553
  Scenario: SLA Breaches by Product>Click on high finding line
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to SLA Breaches by Product widget
    And Click on critical finding line
    Then Verify should land on finding page and High count should be match

 @CISO_Dashboard @DASH-554
  Scenario: SLA Breaches by Product widget
    Given Verify user is on Dashboard page
    And Selects CISO Dashboard
    Then Verify User is on CISO Dashboard page
    And Move to SLA Breaches by Product widget
    Then Verify Tool Tip should be there Near the SLA Breaches by Product.
