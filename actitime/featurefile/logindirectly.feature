Feature: Login actitime
Scenario: Login directly
Given user is present in login page with url "http://localhost/login.do"
When he enters username "admin" and password "manager"
Then Click on login button
