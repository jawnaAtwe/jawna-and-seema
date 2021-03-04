Feature: login
Scenario Outline: Admin can log in with valid credentials
Given admain want to login to the application
When admain fill <username> and <password> 
And admain click login button and it is valid
Then admain should be loged in and open next page
 
 Examples:
 |username|password|
 |"seema"|"123s"|
 |"jawna"|"123j"|
 
Scenario Outline: Admin has the wrong password
Given admain want to login page to the application
When admain fill <username> and <password>
And admain click login button and it is invalid
Then admain should not be loged in 
And Show a message invalid password
And clear password

Examples:
 |username|password|
 |"seema"|"123s"|
