Feature: Search for product feature


@Execute1
Scenario: user is trying to search for different products in Flipkart.com

Given user is on the main page of Flipkart.com
When user searches for a product
Then the page should be updated with that particular product details