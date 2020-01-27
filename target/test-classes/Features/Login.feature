Feature: Login to Axate





# POPSMO47
Scenario: Successful Login to Axate through popbitch wallet
Given I am a user of axate and I am on the login page 
When I enter a valid email and a valid password on the login page 
And I click on continue on login page
Then I am successfully logged in to axate on popbitch with a logged in wallet


# POPSMO48
Scenario: Successful Login to Axate through registration Page
Given I am a user of axate and I am on the Reg page by clicking on register from pop FUN
When I click on login here on the reg page 
And I enter a valid email and a valid password on the login page
And I click on continue on login page
Then I am successfully logged in to axate on popbitch with a logged in wallet

# POPSMO47
Scenario: Successful Login to Axate through popbitch wallet
Given I am a user of axate and I am on the login page
When I click on forgot password link on the login page 
And I click on the login link on the forgot password page
When I enter a valid email and a valid password on the login page 
And I click on continue on login page
Then I am successfully logged in to the accoutn page
