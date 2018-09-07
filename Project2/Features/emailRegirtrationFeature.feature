Feature: Email Registration Feature
				 This feature helps user to register a new email Id
				 
Scenario: user is trying to create a new mail id

Given user is on the Email registrtion page
When user enters all valid details
Then a new mail Id should be created