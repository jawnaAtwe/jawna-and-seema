Feature: Search book

Background: set of books in the library
Given these books was added by admin in the library
|isbn|title|author|signature|
|1234567890|Math|jawna|Atwe2000|
|0987654321|Arabic|seema|nassar2001|
|4569872589|arathmatic|amjad|ali2002|
|4565558890|arath|Raneen|badran1990|


Scenario: Searching for a substring of the title
Given the admin is not logged in 
When they search for the substring of title "Ma"
Then they find the book has a signature T "Atwe2000"

Scenario: Searching for a substring of the author
Given the admin is not logged in 
When they search for the substring of author "ja"
Then they find the book has a signature A "Atwe2000"

Scenario: Searching for a substring of the ISBN
Given the admin is not logged in 
When they search for the substring of isbn "0987"
Then they find the book has a signature I "nassar2001"


Scenario: Searching also works when the user/administrator is logged in
Given the admin is  logged in 
When they search for the substring "Ma"
Then they find the book has a signature "Atwe2000"


Scenario: No books match the criteria (substring)
When they search for the substring "Mas"
Then show a Message there is not any thing with this substring


Scenario: Find more than one book
 When they search for the substring "arath"
Then they find the book has a signature "ali2002" and "badran1990"

