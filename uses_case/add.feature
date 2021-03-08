Feature: add Book

Scenario: Add a book when the admin is logged in
Given the admin must have logged in
When the admin fill ISBN "0140449116" , title "Java" , author "Northon Ben" and signature "Ben1990"
And the admin click on add book button
Then the book added to the library
And  Show a message The book was added successfully


Scenario: Add a book when the admin is not logged in
Given the admin did not logged in
When the admin click on add book button
Then the book will not add to the library
And Show a message please Login




