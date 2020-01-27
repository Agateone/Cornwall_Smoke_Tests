Feature: Popbitch wallet balance across publications


#POPSMO14
Scenario: Register on popbitch and navigate to other publications has the same wallet balance on all the publications
Given I am a user of Axate and I am on the registration page through popbitch FUN "browser"
When I register successfully on popbitch with one pound
And I check in wallet balance on popbitch
And I navigate to reaction 
And I check in wallet balance on reaction
And I navigate to cricketer 
And I check in wallet balance on cricketer
And I navigate to cornwall 
And I check in wallet balance on cornwall
And I navigate to maidenhead 
And I check in wallet balance on maidenhead
And I navigate to slough 
And I check in wallet balance on slough
And I navigate to windsor 
And I check in wallet balance on windsor
And I navigate to grantham 
And I check in wallet balance on grantham
And I navigate to stamford 
And I check in wallet balance on stamford
And I navigate to lynn 
And I check in wallet balance on lynn
And I navigate to newark 
And I check in wallet balance on newark
And I navigate to spalding 
And I check in wallet balance on spalding
And I navigate to finland 
And I check in wallet balance on finland
And I navigate to newbury 
And I check in wallet balance on newbury
And I navigate to scifi 
And I check in wallet balance on scifi
And I navigate to examiner 
And I check in wallet balance on examiner
Then the wallet balance is same across the publications

#POPSMO15
Scenario: Reading an article on popbitch and navigate to other publications has the same wallet balance on all the publications
Given I am a user of Axate and I am on the registration page through popbitch FUN "browser"
When I register successfully on popbitch from FUN with three pounds
And I read an article on popbitch
And I check in wallet balance on popbitch
And I navigate to reaction 
And I check in wallet balance on reaction
And I navigate to cricketer 
And I check in wallet balance on cricketer
And I navigate to cornwall 
And I check in wallet balance on cornwall
And I navigate to maidenhead 
And I check in wallet balance on maidenhead
And I navigate to slough 
And I check in wallet balance on slough
And I navigate to windsor 
And I check in wallet balance on windsor
And I navigate to grantham 
And I check in wallet balance on grantham
And I navigate to stamford 
And I check in wallet balance on stamford
And I navigate to lynn 
And I check in wallet balance on lynn
And I navigate to newark 
And I check in wallet balance on newark
And I navigate to spalding 
And I check in wallet balance on spalding
And I navigate to finland 
And I check in wallet balance on finland
And I navigate to newbury 
And I check in wallet balance on newbury
And I navigate to scifi 
And I check in wallet balance on scifi
And I navigate to examiner 
And I check in wallet balance on examiner
Then the wallet balance is same across the publications