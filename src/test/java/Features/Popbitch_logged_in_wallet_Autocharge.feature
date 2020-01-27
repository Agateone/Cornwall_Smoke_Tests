Feature: Autocharge button ON OFF switch functionality on Logged in wallet




#Authorise charge notice displayed for next premium article on opting Ask me everytime on Wallet
#user autocharged on next premium article when opted Just charge me on the back of the wallet




# POPSMO52
Scenario: Authorise charge notice displayed for next premium article on opting Ask me everytime on Wallet
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Just charge me on finish notice and click ok
And 25p is deducted from the wallet
And open the flipped wallet
And opt Ask me everytime on the autocharge button on the wallet  
And navigate to 2nd premium article on popbitch
Then authorise charge notice is displayed





# POPSMO52
Scenario: user autocharged on next premium article when opted Just charge me on the back of the wallet
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Ask me everytime on finish notice and click ok
And click ok on the authorise charge notice
And my wallet is charged with 25p
And open the flipped wallet
And opt Just charge me on the autocharge button on the wallet 
And navigate to 2nd premium article on popbitch
Then 25p is deducted from the wallet
And authorise charge notice is not displayed
And full article is displayed
And free period is acheived with free on the free point
And wallet tab displays free 
And wallet opens 



