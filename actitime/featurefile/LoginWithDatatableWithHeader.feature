Feature: login with actitime application
Scenario: login with data table with header
Given user is present in actitime application
When user will enter url, username and password
|url| username| password|
|http://localhost/login.do|admin|manager| 
|http://www.flipkart.com|admin1|manager1|
Then login page will be displayed
