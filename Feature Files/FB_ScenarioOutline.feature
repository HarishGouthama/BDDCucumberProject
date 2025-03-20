Feature: FB Login UseCase
	Scenario Outline: FB Login test case with different sets of UN and PWD combination
	Given we are in FB Home page
	When i enter UN<username> and password<pwd>
	And when i click on login button
	Then it should open page
	
	Examples:
    | username           | pwd      |
    | rameshsoft         | practice |
    | rameshsoftpvt      | hello    |
    | rameshsoftrealtime | job      |
	