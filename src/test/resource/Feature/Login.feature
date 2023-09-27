Feature: Login Screen

Scenario: Navigate to login page.
Given open the ChromeBrowser
When enter the url 
Then login page should be displayed

Scenario: Microsoft Login
Given click on Sign in using Microsoft
When Enter valid credential in microsoft
And Do App veification
Then user should landed on dashboard

Scenario: logout
Given click on profile dropdown 
And click on logout
Then User should landed on Login page 

#Scenario: Gmail login
#Given click on Sign in using Google
#When Enter valid credential 
#Then user should landed on dashboard