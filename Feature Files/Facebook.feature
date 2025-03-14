Feature: FaceBook Login UseCase

	Scenario: FaceBook Login with Correct Username and password
		Given when we are in facebook login page
		When I enter Username as "harish1992.it@gmail.com" and password as "Practice"
		Then data should be populated
		When i click on login button
		Then Login should be successfull
		
	Scenario: FaceBook Login with wrong Username and password
		Given when we are in facebook login page
		When I enter Username as "harish1992.it@gmail.com" and password as "Practice123"
		Then data should be populated
		When i click on login button
		Then it should display the error message as "Wrong credentials"		