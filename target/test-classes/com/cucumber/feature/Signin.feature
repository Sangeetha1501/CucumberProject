Feature: Login fucntionality module of automation practise web page 
	Contains E2E functionality such as login, add a product to card, place order,  and signout

Scenario: Verify the user login the application with valid credentials 
	When User click on Signin button 
	And User enter the valid username 
	And User enter the valid password 
	And User click the signin button 
	Then User validate the username displayed in the header 
	And User close the browser 