Feature: Login fucntionality module of automation practise web page 
	Contains E2E functionality such as login, add a product to card, place order,  and signout
Scenario: Verify the user login the application with valid credentials 
	Given User launch the browser and navigate to application 
	When User click on Signin button 
	And User enter the valid username 
	And User enter the valid password 
	And User click the signin button 
	Then User validate the username displayed in the header 
	And User close the browser 

Scenario: Verify the user login the application with valid credentials 
	Given User launch the browser and navigate to application 
	When User click on Signin button 
	And User enter the valid username "TestUser3" 
	And User enter the valid password "TestPassword1" 
	And User click the signin button 
	Then User validate the username displayed in the header 
	And User close the browser 

Scenario Outline: Verify the user login the application with valid credentials 
	Given User launch the browser and navigate to application 
	When User click on Signin button 
	And User enter the valid username "<UserName>" 
	And User enter the valid password "<Password>" 
	And User click the signin button 
	Then User validate the username displayed in the header 
	And User close the browser 
	
	Examples: 
		|UserName	|Password|
		|User1		|Pass1	|
		|User2		|Pass2	|
		|User3		|Pass3	|
