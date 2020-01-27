Feature: Successfull top up from wallet




# POPSMO1
Scenario: Successfull top up from wallet with card
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I open the wallet 
And click on top up on the wallet
And select £3 on the top up page
And enter card details 
And click on continue
Then wallet is topped up with £3





# POPSMO1
Scenario: Successfull top up from wallet with paypal
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I open the wallet 
And click on top up on the wallet
And select £3 on the top up page
And enter paypal details 
And click on continue
Then wallet is topped up with £3




# POPSMO3
Scenario: Payment system loads on selecting the £3 on top up 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I open the wallet 
And click on top up on the wallet
And select £3 on the top up page
Then payment system displays payment options


# POPSMO4
Scenario:  Payment system loads on selecting the £5 on topup 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I open the wallet 
And click on top up on the wallet
And he clicks on £5 on topup
Then payment system displays payment options

# POPSMO5
Scenario: Payment system loads on selecting the £8 on topup 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I open the wallet 
And click on top up on the wallet
And he clicks on £8 on topup
Then payment system displays payment options

# POPSMO3
Scenario: paypal system loads on selecting the £3 on topup 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I open the wallet 
And click on top up on the wallet
And he clicks on £3 on topup
Then paypal system displays payment options


# POPSMO4
Scenario:  paypal system loads on selecting the £5 on topup 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And I open the wallet 
And click on top up on the wallet
And he clicks on £5 on topup
Then paypal system displays payment options

# POPSMO5
Scenario: paypal system loads on selecting the £8 on regpage2 
Given User is on the registration page through popbitch staging  
When he enters all the required details on step1 and clicks on continue 
And he clicks on £8 on topup
Then paypal system displays payment options