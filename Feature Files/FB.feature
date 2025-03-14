Feature: FB login use case
	Scenario: FB Testcase with correct UN and Pwd
		Given User is in home page
		When i enter UN "harish1992.it@gmail.com" and PWD "password"
		And when i click on login button
		Then login page should be opened