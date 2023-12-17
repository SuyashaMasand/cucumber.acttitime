
Feature: login
Scenario: login into acttitime
Given user is present in login page
When user enters username and password
And click on login button
Then home page will be displayed
Examples:
|url| username|password|
|
