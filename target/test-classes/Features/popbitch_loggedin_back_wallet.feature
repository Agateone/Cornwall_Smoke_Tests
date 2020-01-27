Feature: Back of the loged in wallet has a free period date




#If no premium article is read on popbitch,updates on date on the back of the wallet is 7days from current datetime
#If a premium article is read on popbitch,updates on date on the back of the wallet is 7days from datetime of the 1st article read on popbitch
#If free period is acheived on popbitch,updates on date on the back of the wallet is 7days from datetime of the 1st article read on popbitch




#I read an article on popbitch, I acheive freeperiod on popbitch


#NOTE: updated datetime will be printed here 
Scenario: If no premium article is read on popbitch,updates on date on the back of the wallet is 7days from current datetime
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I open the wallet 
And I flip the wallet 
Then the updates on date on the back of the wallet is 7days from current datetime


Scenario: If a premium article is read on popbitch,updates on date on the back of the wallet is 7days from datetime of the 1st article read on popbitch
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I read an article on popbitch
And I display the datetime of the article read 
And I open the wallet
And I flip the wallet 
Then the updates on date on the back of the wallet is 7days from datetime noted when I read the first article


Scenario: If free period is acheived on popbitch,updates on date on the back of the wallet is 7days from datetime of the 1st article read on popbitch
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I acheive freeperiod on popbitch
And I display the datetime of the first article read 
And I open the wallet
And I flip the wallet 
Then the updates on date on the back of the wallet is 7days from datetime noted when I read the first article