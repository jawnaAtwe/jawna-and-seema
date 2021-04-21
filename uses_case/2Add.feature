Feature: add book


Scenario Outline: Add a book when the admin is logged in
Given the admin must have loged in
When the admin fill ISBN "<isbn>" , title "<title>" , author "<author>" and signature "<signature>" 
And the admin click on add book button 
Then the book added to the library 
And Show a message The book was added successfully

Examples:
|isbn|title|author|signature|
|0198526636|Math|jawna|Atwe2000|
|0112112425|c++|Boh Mikel|Mikel1990|
|1861972717|Software|Jon Ben|Ben1800|
|0140449116|The Door of the world|Seema Nassar|Nassar2020|
|1861972717|Java|Seema Moh|Moh1799|





Scenario: Add a book when the admin is not logged in
Given the admin did not loged in
When the admin click on add book button
Then the book will not add to the library and Show a message please Login
