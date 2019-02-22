@E2E 
Feature: Login fucntionality module of automation practise web page 
	Contains E2E functionality such as login, add a product to card, place order,  and signout

Background: Launch the browser
	Given User launch the browser and navigate to application 

@Sce1 @demo
Scenario: Verify the user login the application with valid credentials 
	When User click on Signin button 
	And User enter the valid credentials
	|UserName |Password |
	|TestUser1|Password1|
	|TestUser1|Password2|
	
	
	And User click the signin button 
	Then User validate the username displayed in the header 
	And User close the browser 

@Sce2 @dem
Scenario: Verify the user login the application with valid credentials 
	When User click on Signin button 
	And User enter the valid username "TestUser3" 
	And User enter the valid password "TestPassword1" 
	And User click the signin button 
	Then User validate the username displayed in the header 
	And User close the browser 

@Sce3
Scenario Outline: Verify the user login the application with valid credentials 
	When User click on Signin button 
	And User enter the valid username "<UserName>" 
	And User enter the valid password "<Password>" 
	And User click the signin button 
	Then User validate the username "<UserName>" displayed in the header 
	And User close the browser 
	
	Examples: 
		|UserName	|Password|
		|User1		|Pass1	|
		|User2		|Pass2	|
		|User3		|Pass3	|
