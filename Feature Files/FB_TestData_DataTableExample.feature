@rameshsoft1
Feature: FB login use case
	Scenario: FB Testcase with correct UN and pwd
	Given User is in home page
	When we enter login credentials
	|	username							|			pwd				|
	|	rameshsoft.selenium		|			practice	|
	Then login page should be opened