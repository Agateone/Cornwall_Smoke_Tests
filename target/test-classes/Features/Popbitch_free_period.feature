Feature: free period is acheived on readign 2articles on Popbitch


# Freeperiod is acheived on popbicth from finish notice
# Freeperiod is acheived on popbicth from authorise charge notice
# Freeperiod is acheived on popbicth from newpub notice
# Freeperiod on popbitch is not affected by freeperiod on reaction
# Freeperiod is set to 7days excatly from the time 1st article was read on popbitch
# All premium articles are free to the user with in the free period








#acheive freeperiod on popbitch, acheive freeperiod on reaction




#NOTE: recent account that acheived the freepoint willbe printed here 
Scenario: freepoint is acheived on reading 2articles on popbitch from the finish notice
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And print the email on the console
And opt Just charge me on the finish notice and click ok
And 25p is detucted from the wallet
And I note the datetime I read the first article on popbitch
And 25p is detucted from the free point
And I navigate to 2nd premium article on popbitch
Then 25p is deducted from the wallet
And free period is acheived with free on the free point
And wallet tab displays free 
And wallet opens 




Scenario: freepoint is acheived on reading 2articles on popbitch from the authorise charge notice
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Ask me everytime on the finish notice and click ok
And click ok on the authorise charge notice
And 25p is detucted from the wallet
And I note the datetime I read the first article on popbitch
And 25p is detucted from the free point
And I navigate to 2nd premium article on popbitch
And click ok on the authorise charge notice
Then 25p is deducted from the wallet
And free period is acheived with free on the free point
And wallet tab displays free 
And wallet opens 


Scenario: freepoint is acheived on reading 2articles on popbitch from the Newpublication notice
Given I am a user of Axate and on the FUN of reaction 
When I register successfully on reaction from FUN
And opt Ask me everytime on the finish notice and click ok
And click ok on the authorise charge notice
And I navigate to a premium article on popbitch
And I opt ask me everytime on the newpublication  notice and click ok
And click ok on the authorise charge notice
And I note the datetime I read the first article on popbitch
And I navigate to 2nd premium article on popbitch
And click ok on the authorise charge notice
Then 25p is deducted from the wallet
And free period is acheived with free on the free point
And wallet tab displays free 
And wallet opens 


Scenario: free point on popbitch is not effected by free point on reaction
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And acheive freeperiod on popbitch
And I acheive freeperiod on reaction
Then the free period on popbitch is 7days from the date time the first article was read on popbitch
And the free period on reaction is 7days from the date time the first article was read on reaction





Scenario: Freeperiod is set to 7days excatly from the time 1st article was read
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And acheive freeperiod on popbitch
Then free period is set to 7days from the datetime the first article was read



Scenario: All premium articles are free to the user with in the free period
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I acheive free period on popbitch
And I navigate to 3rd premium article on popbitch
Then 0p is deducted from the wallet
And wallet free period is same as the freeperiod before
And free is displayed on the green tab


Scenario: acheiving free point on other publication and navigating to popbitch displays 50p as free point in the circle
Given I am a user of Axate and on the FUN of reaction 
When I register successfully on reaction from FUN
And acheive free period on reaction
And note the wallet balanc eon reaction
And I navigate to a premium article on popbitch
And open the wallet
Then free point in the circle is 50p
And wallet balance is same as reaction
