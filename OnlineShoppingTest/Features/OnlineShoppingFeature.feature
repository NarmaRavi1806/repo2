Feature: Online shopping feature
				 Using this feature user can add product, get product details
				 
Scenario: user is trying to add products to the database with invalid details

Given user is provided with database to add product

When user provide same productCode for different products
Then 'Give porper ProductCode' message should be displayed

When product name is empty
Then 'Product name should not be null' message should be displayed

When Description is empty
Then 'Description should not be null' message should be displayed


Scenario: user is trying to add products to the database with valid details

Given user is provided with database to add product

When user gives valid details of the product
Then the product should be added to the database


Scenario: user is trying to get all product details from the database

Given user is provided with database 

When user tries to get all product details from the database
Then the product details should be displayed in the page


Scenario: user is trying to get a single product detail from the database by providing valid ProductCode

Given user is provided with database 

When user gives a productCode of single product
Then that product details should be displayed on the page


Scenario: user is trying to get a single product detail from the database by providing invalid ProductCode

Given user is provided with database 

When user gives a invalid productCode of single product
Then 'productCode is null or Given productCode is not available' message should be displayed on the page

When user gives null productCode
Then 'Product of given productCode cannot be found' message should be displayed on the page

