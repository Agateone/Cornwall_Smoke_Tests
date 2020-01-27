Feature: finish notice displayed on successfull signup




# POPSMO52
Scenario: Finish notice displayed on successful signup from FUN
Given I am a user of Axate and I am on the registration page through popbitch staging
When I enter all the required details on step1 and clicks on continue
And top up with a valid card in steptwo with £1 and clicks on continue
Then I get a funded axate wallet with £1 in it
And navigated to the same article
And finish notice is displayed as a popup



# POPSMO53
Scenario: Finish notice displayed on successful signup from wallet
Given I am a user of Axate 
When I register successfully on popbitch from wallet
And navigate to a premium article
Then a finish notice is displayed as a popup

