Feature: Login from popbitch

# POPSMO43
Scenario: Successful Login from popbitch FUN staging
Given I am a user of Axate and I am on the Login page through popbitch staging
When I enter a valid email and a valid password on the login page
And I click on continue on login page
Then I am successfully logged in to axate
And I am navigated to the same article 


# POPSMO42
Scenario: Successful Login from popbitch Wallet staging
Given I am a user of Axate and I am on the Login page through popbitch staging
When I enter a valid email and a valid password on the login page
And I click on continue on login page
Then I am successfully logged in to axate 
And I am navigated to popbitch homepage



