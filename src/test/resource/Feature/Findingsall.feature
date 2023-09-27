Feature: Findings page

  @login
  Scenario: Login to application
    Given open the browser f
    When log in to Armorcode application f

  @FI-001
  Scenario: Check Finding page basic loading.
    Given Click on Finding tab
    Then Finding page should be loaded properly
    And Open, Accept Risk and Confirm status filter should be applied bydefault
    And Descending Sorting should be applied on Severity column bydefault.

  @FI-007
  Scenario: Add Manual Finding
    Given Click on Finding tab
    When Click on Add finding and fill Details
    And click on Submit fe
    Then Sucess message should be displayed
    And Finding will be added

  @FI-068
  Scenario: Add  comment
    Given Click on Finding tab
    When Enter text in comment
    And mention person
    And click on comment
    Then comment should be added

  @FI-120
  Scenario: saved search for user
    Given Click on Finding tab
    When click on saved search
    And click on schedule and enable schedule
    And select user
    And click on save in saved search
    Then message should be displayed
    And clear schedule

  @FI-189
  Scenario: saved search for Teams
    Given Click on Finding tab
    When click on saved search
    And click on schedule and enable schedule
    And select Teams name
    And click on save in saved search
    Then message should be displayed
    And clear schedule team

  @FI-207
  Scenario: Select all
    Given Click on Finding tab
    Given filter high severity1
    When click on click here
    Then create ticket and mitigated and propose mitigated should be disabled

  @FI-203
  Scenario: Add template in manual finding
    Given Click on Finding tab
    When click on addfinding and enter basic info
    And click on template
    And click on add template
    And Enter all template details
    And click on save
    Then template should be added
    And data should be added as per the template

  @FI-204
  Scenario: Edit template in manual finding
    Given Click on Finding tab
    When click on addfinding and enter basic info
    And click on template
    And click on edit icon
    And edit details in template
    And click on save
    Then template should be edited
    And Edited details should be added as per the template

  @FI-103
  Scenario: save specific filter
    Given Click on Finding tab
    When Aplly product subproduct owner filter
    And click on save As and enter details and save
    Then specific filters should be saved and it should be displayed in saved search

  @FI-246
  Scenario: Swith to aql filter
    Given Click on Finding tab
    And filter high severity1
    And Get counts in basic filter
    When click on Switch to AQL
    Then check same count is displayed in aql filter

  @FI-060
  Scenario: Change to confirm
    Given Open Finding page
    Given filter falsepositive findings
    When Click on Finding Id
    When click on Confirm
    And Enter confirm note in popup click on submit
    And click on ok in sucess alert
    Then status should be changed to Confirm and it should be recorded in History tab

  Scenario: Change to reopen
    Given Open Finding page
    Given filter falsepositive findings
    When Click on Finding Id
    When click on reopen
    And Enter reopen note in popup click on submit

  @FI-061
  Scenario: Change to False +ve normal flow
    Given Open Finding page
    Given filter open findings
    When Click on Finding Id
    When select False +ve in dropdown
    And Enter Note in False +ve1 and click on Submit
    Then False +ve1 Status should be changed and it should be recorded in the history tab.

  @FI-066
  Scenario: Change Severity
    Given Open Finding page
    Given filter high severity
    When Click on Finding Id
    When Change severity
    And Enter note in popup click on submit
    Then Severity should be changed it should be recorded in History tab
    And If user click same Severity dropdown should be close.

  @FI-078
  Scenario: Change category
    Given Open Finding page
    And unfilter attack in allfilter
    When Click on Finding Id
    When click on Attack category
    And Enter note in category and click on save
    Then category should be changed to attack and it should be recorded in History tab

  @FI-093
  Scenario: Change owner
    Given Open Finding page
    Given filter na_owner
    When Click on Finding Id
    When click on pencil icon
    And select new owner
    And Enter note and click on save
    Then owner name should be changed and should be recorded in history tab

  @FI-099
  Scenario: Accept risk three times
    Given Open Finding page
    And clear filter
    Given filter open findings
    When Click on Finding Id
    And change status to acceptrisk three times
    When click on Confirm
    And Enter confirm note in popup click on submit
    And click on ok in sucess alert
    And change status to acceptrisk three times
    When select False +ve in dropdown
    And Enter Note in False +ve1 and click on Submit
    And change status to acceptrisk three times
    When click on Confirm
    And Enter confirm note in popup click on submit
    And click on ok in sucess alert
    Then Acceptrisk button should be disabled

  @FI-100
  Scenario: mitigated for custon finding
    Given Open Finding page
    And Click on Add finding and fill Details for custom finding
    And filter custom findings
    And filter mitigated findings1
    When Click on Finding Id
    And change status to mitigated and enter note
    And click on submit N
    Then mitigated status should be changed and should be displayed in history tab

  @FI-214
  Scenario: Change Summary
    Given Open Finding page
    And filter custom findings
    When Click on Finding Id
    And click on edit beside summary
    And Enter Summary and note
    Then Summary should be changed and it should be recorded in hoistory tab

  @FI-199
  Scenario: Add tags
    Given Open Finding page
    When Click on Finding Id
    When click on tags
    And click on add new button
    And Enter key and value and click on tick mark
    Then tag should be displayed
    And Displayed in history tab

  @FI-200
  Scenario: Edit tags
    Given Open Finding page
    When Click on Finding Id
    When click on tags
    And click on pencil icon in tags
    And change key and value and click on tick mark
    Then changes should be displayed
    And changes displayed in history tab

  @FI-035
  Scenario: Bucket False +ve
    Given Open Finding page
    And unfilter falsepositive findings
    When Select finding
    And click on Selected and click on False +ve
    And Enter Note in falsepositive click on submit
    Then Bucket False +ve Status should be changed and it should be recorded in the history tab.

  @FI-083
  Scenario: Change Category Bucket flow
    Given Open Finding page
    And unfilter attack in allfilter
    When Select finding
    And click on Selected
    And click on Change category and enter comment and category
    And click on submit1
    Then Bucketflow Category should be changed and should be recorded in history tab

  @FI-084
  Scenario: Change Severity Bucket flow
    Given Open Finding page
    Given filter medium severity
    When Select finding
    And click on Selected
    And click on Change severity and enter comment and severity
    And click on submit1
    Then Bucketflow severity should be changed and should be recorded in history tab

  @FI-094
  Scenario: Confirm Bucket flow
    Given Open Finding page
    Given filter falsepositive findings
    When Select finding
    And click on Selected
    And click on confirm and enter note
    And click on submit1
    Then Bucketflow confirm should be changed and should be recorded in history tab

  @FI-162
  Scenario: Change Due_date Bucket flow
    Given Open Finding page
    When Select finding
    And click on Selected
    And click on Change Due date and Select date and enter comment
    And click on submit1
    Then Bucketflow Change Due date should be changed and should be recorded in history tab

  @FI-163
  Scenario: Change owner Bucket flow
    Given Open Finding page
    Given filter na_owner
    When Select finding
    When click on selected and click on change owner
    And select owner and enter comment
    And click on submit1
    Then owner name should be changed in bucket flow and should be recorded in history tab

  @FI-208
  Scenario: mitigated Bucket flow
    Given Open Finding page
    Given filter mitigated findings
    When Select finding
    And click on Selected
    And click on mitigated and enter note
    And click on submit1
    Then Bucketflow mitigated should be changed and should be recorded in history tab

  @FI-096
  Scenario: Edit Basic Information Bucket flow
    Given Open Finding page
    Given select mitigated findings
    Given filter product
    When Select finding
    And click on Selected
    And click on Edit basic information and select product subproduct environment and enter note
    And click on submit1
    Then Bucketflow Edit basic information should be changed and should be recorded in history tab

  @FI-177
  Scenario: Bucket propose False +ve
    Given Open Finding page
    And unfilter falsepositive findings
    When Select finding
    And click on Selected
    And click on propose falsepositive
    And Enter comment in  propse falsepositive
    And click on submit
    Then Bucket propse False +ve finding should be there in finding_under review page
    And propse False +ve should be recorded in the history tab.

  @FI-178
  Scenario: Bucket propose Accept Risk
    Given Open Finding page
    And filter falsepositive findings
    When Select finding
    And click on Selected
    And click on propose Accept Risk
    And Enter Note in  propse Accept Risk
    And click on submit
    Then Bucket propse Accept Risk finding should be there in finding_under review page
    And propse Accept Risk should be recorded in the history tab.

  @FI-179
  Scenario: Bucket propose owner
    Given Open Finding page
    And filter na_owner
    When Select finding
    And click on Selected
    And click on propose owner
    And Enter owner name and comment in propse owner
    And click on submit
    Then Bucket propse owner finding should be there in finding_under review page
    And propse owner should be recorded in the history tab.

  @FI-180
  Scenario: Bucket propose Duedate
    Given Open Finding page
    When Select finding
    And click on Selected
    And click on propose Duedate
    And Enter Duedate and comment in propse Duedate
    And click on submit
    Then Bucket propse Duedate finding should be there in finding_under review page
    And propse Duedate should be recorded in the history tab.

  @FI-181
  Scenario: Bucket propose Severity
    Given Open Finding page
    And filter medium severity
    When Select finding
    And click on Selected
    And click on propose Severity
    And Enter Severity and comment in propse Severity
    And click on submit
    Then Bucket propse Severity finding should be there in finding_under review page
    And propse Severity should be recorded in the history tab.

  @FI-182
  Scenario: Bucket propose Category
    Given Open Finding page
    And unfilter attack in allfilter
    When Select finding
    And click on Selected
    And click on propose Category
    And Enter Category and comment in propse Category
    And click on submit
    Then Bucket propse Category finding should be there in finding_under review page
    And propse Category should be recorded in the history tab.

  @FI-192
  Scenario: Bucket propose Accept
    Given Open Finding page
    When click on fining under review
    And click on finding id in fur
    And click on Accept and enter note
    Then proposal should be accepted and recorded in hoistory tab

  @FI-193
  Scenario: Bucket propose Reject
    Given Open Finding page
    When click on fining under review
    And click on finding id in fur
    And click on Reject and enter note
    Then proposal should be rejected and recorded in hoistory tab

  @FI-228
  Scenario: Bucket propose Mitigated
    Given Open Finding page
    And filter custom findings
    And filter mitigated findings1
    When Select finding
    And click on Selected
    And click on propose Mitigated
    And Enter Note in propse Mitigated
    And click on submit
    Then Bucket propse Mitigated finding should be there in finding_under review page
    And propse Mitigated should be recorded in the history tab.

  @FI-244
  Scenario: Bucket propose Basic Information
    Given Open Finding page
    And filter mitigated findings
    When Select finding
    And click on Selected
    And click on propose Basic Information
    And Enter product subproduct environment and Note in propse Basic Information
    And click on submit
    Then Bucket propse Basic Information finding should be there in finding_under review page
    And propse Basic Information should be recorded in the history tab.

  @FI-229
  Scenario: Propse mitigated normal flow
    Given Open Finding page
    And filter custom findings
    And filter mitigated findings1
    When Click on Finding Id
    And click on threedots
    And click on Propose mitigated Enter note
    And click on submit nf
    Then Propse mitigated finding should be there in finding_under review page
    And Normal flow Propse mitigated should be recorded in the history tab.
