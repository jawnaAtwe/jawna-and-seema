Feature: login
Background:
When admain fill "seema" and "123s"

Scenario: Admin can log in with valid credentials
Given admain want to login to the application
When admain fill strings
And admain click login button and it is valid
Then admain should be loged in and open next page

 
Scenario: Admin has the wrong password
Given admain want to login to the application
When admain fill strings
And admain click login button and it is invalid
Then admain should not be loged in and show a message invalid password 
