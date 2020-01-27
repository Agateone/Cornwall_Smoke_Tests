Feature: Authorise charge notice ON OFF switch functionality 




# POPSMO52
Scenario: Wallet balance detucted by 25p on opting Ask me everytime on the Authorise charge notice 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt ask me everytime on the authorise charge notice and click ok
Then 25p is detucted from the wallet 


# POPSMO52
Scenario: Free point detucted by 25p on opting Ask me everytime on the authorise charge notice 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt ask me everytime on the authorise charge notice and click ok
Then 25p is detucted from the free point


 # POPSMO52
Scenario: Free point detucted by 25p on opting Ak me everytime on the authorise charge notice 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt ask me everytime on the authorise charge notice and click ok
Then full article is displayed  

# POPSMO52
Scenario: 25p is displayed on the green tab on opting Ak me everytime on the authorise charge notice 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt ask me everytime on the authorise charge notice and click ok
Then 25p is displayed on the green tab 




# POPSMO52
Scenario: Authorise charge noticeis shown on the next article on popbitch when opted Ask me everytime on the current article's authorise charge notice
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt ask me everytime on the authorise charge notice and click ok
And Navigate to another premium article 
Then Authorise charge notice is displayed 
And the auto charge switch is set to default










# POPSMO52
Scenario: Wallet balance detucted by 25p on opting just charge me on the Authorise charge notice and click ok
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Just charge me everytime on the authorise charge notice and click ok
Then 25p is detucted from the wallet 


# POPSMO52
Scenario: Free point detucted by 25p on opting just charge me on the authorise charge notice and click ok
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Just charge me everytime on the authorise charge notice and click ok
Then 25p is detucted from the free point


 # POPSMO52
Scenario: Full article is displayed on opting just charge me on the authorise charge notice and click ok
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Just charge me everytime on the authorise charge notice and click ok
Then full article is displayed  


# POPSMO52
Scenario: 25p is displayed on the green tab on opting just charge me on the authorise charge notice 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt ask me everytime on the authorise charge notice and click ok
Then 25p is displayed on the green tab 


# POPSMO52
Scenario: Axate autocharges the user for next article on popbitch when opted Just charge me on the current article's authorise charge notice
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Just charge me on the authorise charge notice and click ok
And Navigate to another premium article 
Then 25p is detucted from the wallet 
And full article is shown
And 25p is detucted from the free point
And free period is acheived





