#Feature: Findings not working
#
  #(never option is not there)NA
  #@FI-059
  #Scenario: Change to Accept Risk
    #Given Click on Finding tab
    #Given filter open findings
    #When click on Finding Id
    #And select Accept Risk in dropdown
    #And change to Never in Reopen option
    #And Enter details in Accept risk and click on Submit
    #Then Accept Risk1 Status should be changed and it should be recorded in the history tab.
#
  #(never option is not there)NA
  #@FI-034
  #Scenario: Bucket Accept Risk never flow
    #Given Open Finding page
    #When select finding
    #When click on Selected and click on Accept Risk
    #And change to Never in Reopen option
    #And Enter Note click on submit
    #Then Accept Risk Status should be changed and it should be recorded in the history tab.
#
  #@FI-212(not_ble_todo)
  #Scenario: Attach file in detailed info manual finding
    #Given Click on Finding tab
    #When click on addfinding and enter basic info
    #And attach file in detailed info
    #And click on Submit
    #And check finding age
    #And check summary
    #And click on finding id for attachment
    #And check files is displayed in details tab
#
  #@FI-213(assertion)
  #Scenario: Attach file to manual finding
    #Given Click on Finding tab
    #When click on addfinding and enter basic info
    #And Enter all details in detailed info
    #And upload file in attach file info
    #And click on Submit
    #And check finding age
    #And check summary
    #And click on finding id for attachment
    #And check file is displayed in attachment tab
    #
    #@FI-142(not posible to assertion)
  #Scenario: Bucket Accept Risk reopen flow
    #Given Click on Finding tab
    #When Select finding
    #And click on Selected
   #And click on Accept Risk
    #And Enter date in reopen and enter Note
    #And click on submit1
    #Then bucket flow Accept Risk Status should be changed and it should be recorded in the history tab.
    #
     #@FI-195
  #Scenario: Bucket propose multiple Accept
    #Given Open Finding page
    #When click on fining under review 
    #And  select all findings
    #And click on Accept Selected and enter note
    #Then All proposal should be accepted and recorded in hoistory tab
    #
 #@FI-196
  #Scenario: Bucket propose multiple Reject
    #Given Open Finding page
    #When click on fining under review 
    #And  click on finding id in fur
    #And click on Reject and enter note
    #Then proposal should be rejected and recorded in hoistory tab
    #
   #@FI-161(notwork)
#Scenario: Change Due date 
    #Given Open Finding page
    #When Click on Finding Id
    #And click on due date edit icon and enter date comment and click on save 
    #Then Due date should be changed and it should be recorded in history tab