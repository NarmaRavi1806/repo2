Feature: Naukri registration Feature

Scenario: User is trying to register in 'Naukri.com'
Given user is on the mainpage of 'Naukri.com'
When user provide the valid details for registration
Then a new profile for the user should be created in 'Naukri.com'