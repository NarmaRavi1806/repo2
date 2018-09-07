Feature: Test online Shop services

Scenario: user wants to test services of online shop

When user give call to '/sayHello' service
Then user should receive service status as 'OK' and response message 'Hello World from RESTFullWebServices'