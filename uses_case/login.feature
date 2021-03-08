Feature: login
Scenario: Admin can log in with valid credentials
Given admain want to login to the application
When admain fill "seema" and "123s"
And admain click login button and it is valid
Then admain should be loged in and open next page

 
Scenario: Admin has the wrong password
Given admain want to login to the application
When admain fill "seema" and "444q"
And admain click login button and it is invalid
Then admain should not be loged in 
And Show a message invalid password
And clear password

