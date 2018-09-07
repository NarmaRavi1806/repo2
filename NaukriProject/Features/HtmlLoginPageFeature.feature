Feature: Login Feature
				 user able to login to their account by giving username and password
	
@Tag			 
Scenario: user trying to login to his account using invalid username and password

Given user in on the login page
When user type invalid username and password
Then 'Invalid username and password' message sholud be displayed

@Tag
Scenario: user trying to login to his account using valid username and password

Given user in on the login page
When user type valid username and password
Then useraccount page should be displayed