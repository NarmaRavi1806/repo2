Feature: Search for bus feature 
				 this feature is used to search for buses between two destinations
				 
@Execute	
Scenario: User is trying to search for buses in 'Redbus.com'

Given User is on the search page of 'Redbus.com'
When user types the from , to and onward date field 
Then the list of buses available on that date should be listed