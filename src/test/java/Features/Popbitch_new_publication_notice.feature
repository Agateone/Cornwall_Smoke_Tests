Feature: Popbitch Newpublication displayed after navigating to popbitch from other publication



# POPSMO53
Scenario: registering through any other publication and navigating to a premium article on popbitch displays a newpublication notice
Given I am a user of Axate and on the FUN of reaction 
When I register successfully on reaction from FUN
And opt just charge me on the finish notice and click ok
And navigate to a premium article on popbitch
Then a new publication notice is displayed on popbitch

# POPSMO53
Scenario: registering through any other publication and navigating to a free article on popbitch doesnt display the new publication notice
Given I am a user of Axate and on the FUN of reaction 
When I register successfully on reaction from FUN
And opt just charge me on the finish notice and click ok
And navigate to a free article on popbitch
Then the user is not charged for the article
And The newpublication notice is not displayed




# POPSMO53
Scenario: Authorise charge notice displayed on opting Ask me everytime on newpublication notice
Given I am a user of Axate and on the FUN of reaction 
When I register successfully on reaction from FUN
And click ok on the finish notice
And navigate to a premium article on popbitch
And opt Ask me everytime on the new publication 
Then The authorise charge notice is displayed




# POPSMO52
Scenario: Wallet balance detucted by 25p on opting just charge me on the newpublication notice
Given I am a user of Axate and on the FUN of reaction 
When I register successfully on reaction from FUN
And click ok on the finish notice
And navigate to a premium article on popbitch
And opt just charge me on the new publication 
Then 25p is deducted from the wallet balance 


# POPSMO52
Scenario: Free point detucted by 25p on opting just charge me on the New publication notice 
Given I am a user of Axate and on the FUN of reaction 
When I register successfully on reaction from FUN
And click ok on the finish notice
And navigate to a premium article on popbitch
And opt just charge me on the new publication 
Then 25p is deducted from the free point 


 # POPSMO52
Scenario: full article displayed on opting just charge me on the New publication notice 
Given I am a user of Axate and on the FUN of reaction 
When I register successfully on reaction from FUN
And click ok on the finish notice
And navigate to a premium article on popbitch
And opt just charge me on the new publication 
Then full article is displayed


 # POPSMO52
Scenario: 25p is displayed on the green tab on opting just charge me on the New publication notice 
Given I am a user of Axate and on the FUN of reaction 
When I register successfully on reaction from FUN
And click ok on the finish notice
And navigate to a premium article on popbitch
And opt just charge me on the new publication 
Then 25p is displayed on the green tab






