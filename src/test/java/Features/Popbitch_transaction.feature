Feature: Reading an article on popbitch detucts  25p off of the wlalet balance and free point



# POPSMO52
Scenario: Wallet balance, free point is detucted by 25p on reading a premium article on popbitch from finish notice
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt just charge me on the finish notice and click ok
Then wallet balanc eis detucted by 25p
And free point is detucted by 25p
And 25p is displayed on the green tab
And full article is displayed to the user 


# POPSMO52
Scenario: Wallet balance, free point is detucted by 25p on reading a premium article on popbitch from authorise charge notice
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Ask me everytime on the finish notice and click ok
And click ok on the authorise charge notice
Then wallet balance is detucted by 25p
And free point is detucted by 25p
And 25p is displayed on the green tab
And full article is displayed to the user 


# POPSMO52
Scenario: Wallet balance, free point is detucted by 25p on reading a premium article on popbitch from Newpublication notice notice
Given I am a user of Axate and on the FUN of reaction 
When I register successfully on reaction from FUN
And opt Ask me everytime on the finish notice and click ok
And click ok on the authorise charge notice
And navigate to a premium article on popbitch
And opt Ask me everytime on the newpublication notice and click ok
Then wallet balance is detucted by 25p
And free point is detucted by 25p
And 25p is displayed on the green tab
And full article is displayed to the user 



# POPSMO52
Scenario: Non premium articles are free for axate user
Given I am a user of Axate and on the home page on popbitch 
When I register successfully on popbitch from wallet
And opt Ask me everytime on the finish notice and click ok
And I navigate to a non-premium article on popbitch
Then wallet balance is detucted by 0p
And free point is detucted by 0p
And free is displayed on the green tab
And full article is displayed to the user



# POPSMO52
Scenario: Premium article is charged only once on popbitch
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt just charge me on the finish notice and click ok
And wallet balance is detucted by 25p
And free point is detucted by 25p
And 25p is displayed on the green tab
And full article is displayed to the user 
And I navigate to the same premium article as above
Then wallet balance is detucted by 0p
And free point is detucted by 0p
And free is displayed on the green tab
And full article is displayed to the user









