#user story
Feature: Login functionality

#test case 1
Scenario: To check login with valid data

#precondition
Given user reached to login page

#steps
When user enters username and password
And click on login

#expected result
Then verify successful login message
And click logout