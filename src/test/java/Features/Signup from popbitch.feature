Feature: Signup from popbitch

# POPSMO43
Scenario: Successful signup from popbitch FUN staging
Given I am a user of Axate and I am on the registration page through popbitch staging
When I enter all the required details on step1 and clicks on continue
And top up with a valid card in steptwo with £1 and clicks on continue
Then I get a funded axate wallet with £1 in it
And navigated to the same article


# POPSMO42
Scenario: Successful signup from popbitch Wallet staging
Given I am a user of Axate and I am on the registration page through popbitch staging
When I enter all the required details on step1 and clicks on continue
And top up with a valid card in steptwo with £1 and clicks on continue
Then I get a funded axate wallet with £1 in it
And navigated to popbitch.com





