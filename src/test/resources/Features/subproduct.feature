Feature: subproduct page functionality

  @SP-001
  Scenario: Check SubProduct page navigation behavior
    Given login to arorcode application
    And click on subproduct option
    And check searchbar and  new product button should be displayed
    When check filter by option shoulde be displayed
    And Production and Staging Tabs should be displayed
    And Import from CSV Update CSV should be displaying
    And Icon for Configure Tool Severity
    And Icon for Subproduct SSDLC Dashboard
    And Icon for Subproduct Security Dashboard
    And Edit Subproduct
    Then Move to another Product option

  #@SP-003
  #Scenario: Check functionality for SubProduct Creation
    #When Click on New SubProduct button
    #And the pop up should be displayed
    #And enter parent product, name, clone subproduct, description,  select type, status, version number and tags
    #When click on next button in basic information page
    #And click on drop down
    #And select any on SLA name
    #And click on next button
    #When risk page should be displayed click on next button
    #And In the Owners Section User can select team
    #And click on next button in owner page
    #And sslcd page select teams and click on next button
    #And advanced page fill up the details
    #And click save button
    #Then subproduct should be added on left panal
    
  #Scenario: verifying edit options
    #When click on desired or exit product
    #And click on edit option
    #And edit page should be displayed
    #And click on owenr option
    #When click on add team
    #And select any one team
    #Then team added sucessfully

   Scenario: check navigation to finding page
    When click on desiredd subproduct
    And verify total  high medium low should be displayed in finding sumary
    And click on total number of finding
    And its navigate no finding summary
    When click on critial option
    And verify in severity critical defects only should be displayed
    And click on high option
    And verify in severity high defects only should be displayed
    And click on lown option in findinf summary
    Then verify the severity low defect only should be displayed
#
  #Scenario: Check behaviour of clone subproduct
    #When click on add new subproduct
    #And add parent product
    #And click on colne subproduct
    #When add clone sub product
    #And click on saveandskip button
    #Then check the add product should not be displayed
#
  #Scenario: check behaviour of move subproduct
    #When click on rightmside move to another another product option
    #And move product page should be displayed
    #And click on product dropdown and select any one product
    #And click on save button on moveto product
    #Then moveto product popup should be displayed
#
  #Scenario: Check deletion of subproduct
    #When click on desired products
    #And go to subproduct deletion option
    #Then click on the delete option
#
  #Scenario: check behaviour of import subproduct via CSV
    #When click on three dots on beside of new subproduct
    #And import and unpatae popup should be displayed
    #And click on import csv
    #And import csv pop page should be displayed
    #And click on dowload options
    #Then click on cancel button
#
  #Scenario: check behaviour of update subproduct via CSV
    #When click on three dotsss
    #And update pop up should be displayed
    #And click on update csv option
    #And update csv page should be displayed
    #And update page click on download option
    #Then finaly cilck on cancel button
    #When 
