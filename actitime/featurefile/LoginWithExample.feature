@LoginExample
Feature: actitime login
Scenario Outline: login with exaples 
Given when user is present in acttitime with url "<url>" 
When user enters username "<username>" and password "<password>"
Then  user clicks on login, home page will be displayed
Examples:
|url| username| password|
|http://localhost/login.do|admin|manager| 
|http://www.flipkart.com|admin1|manager1|