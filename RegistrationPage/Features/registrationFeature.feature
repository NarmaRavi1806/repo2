Feature: registration feature
				 This feature helps user to register his personal and educational details
				 
Scenario: user is trying to register without entering credentials

Given  user opens the web page 'PersonalDetails.html' in the browser
Then the page should be displayed with title 'Personal Details'

When user clicks next without entering First Name
Then 'Please fill the First Name' alert message should be displayed

When user clicks next without entering Last Name
Then 'Please fill the Last Name' alert message should be displayed

When user clicks next without entering Email
Then 'Please fill the Email' alert message should be displayed

When user clicks next by entering invalid Email
Then 'Please enter valid Email Id' alert message should be displayed

When user clicks next without entering contact number
Then 'Please fill the Contact No.' alert message should be displayed

When user clicks next by entering invalid contact No.
Then 'Please enter valid Contact No.' alert message should be displayed

When user clicks next without entering address line 1
Then 'Please fill the address line 1' alert message should be displayed

When user clicks next without entering address line 2 after address line 1
Then 'Please fill the address line 2' alert message should be displayed for address line 2

When user clicks next without selecting city
Then 'Please select city' alert message should be displayed

When user clicks next without selecting state
Then 'Please select state' alert message should be displayed

When user clicks next 
Then 'Personal details are validated and accepted successfully' alert message should be displayed
And  the browser should navigte to 'Educational Details.html' page

When user clicks on registerMe without selecting Graduation
Then 'Please Select Graduation' alert message should be displayed

When user clicks on registerMe without entering percentage
Then 'Please fill Percentage detail' alert message should be displayed

When user clicks on registerMe without entering passingYear
Then 'Please fill Passing Year' alert message should be displayed

When user clicks on registerMe without entering projectName
Then 'Please fill Project Name' alert message should be displayed

When user clicks on registerMe without selecting TechnologiesUsed
Then 'Please Select Technologies Used' alert message should be displayed

When user selects other in Technologies used
And  clicks on registerMe without entering otherTechnologies
Then 'Please fill other Technologies Used' alert message should be displayed

When user clicks on registerMe
Then 'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!' alert message should be displayed 
