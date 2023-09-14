Feature: product page functionality

  Scenario: Check Product page navigation behavior
    When naviget to armorcode application
    And click on product option
    Then product page should be displayed

  @PD-002
  Scenario: Check functionality for Product Creation
    When click on new product buutton
    And pop should be displayed
    When enter the user name select type, enter description, select status, enter version number, select tier, select class, enter tags in key-value.
    And click on next
    And select SLA
    And click on next
    And User can define Risk Assessment Questionaaire
    And click on next
    And In the Owners Section, User can select team
    Then Click on Submit

  @PD-011
  Scenario: Check product detail page
    When product detailed page should be displayed
    When verify product name should be displayed in top
    And verify links buttons
    Then verify all product details should be displayed

  @PD-026
  Scenario: Check behaviour of add subproduct from Product Page.
    When click new product button
    And enter all the details
    When enter all the details in sla page
    And click on below next button
    And enter details click on next button in risk assessment page
    And select teams and click on next button in owner page
    And clcik on next button in ssldc page
    Then enter the detaild click on sumbit button

  @PD-032
  Scenario: Check Subproduct deletion operation
    When click on desired product
    And check the subproduct information
    And click on delete option

  @PD-037
  Scenario: Check behavior of Dependency given on Product Detail Page
    When click on new dependency
    And new dependecy page should be displayed
    When select product
    And select subproduct
    And select risk score
    Then click on save button

  @PD-039
  Scenario: check behaviour of add product using CSV
    When click on three dots on new products
    And import and update csv option should be displayed
    When click on import option
    And import page should be displayed
    And click on dowload option
    Then dowload successfuly

  @PD-040
  Scenario: check behaviour of update product using CSV
    When click on threee dots beside of new products option
    And update and import option should be displayed
    When click on update option
    And update page should be displayed
    Then cilck on download option

  @PD-041
  Scenario: Check behavior of Global filter on product page
    When click on global filter
    And select bu option
    When select none option in global filter
    And none subprodut shou be displayed
    And click onn team option
    And team subproducts should be displayed
    And click on tier option
    Then tier sub produsts shold be displayed
