Feature: Popbitch Transaction


#automated
#POPSMO17
Scenario: Wallet balance, free point is detucted by 25p on reading a premium article on popbitch from finish notice
Given I am a user of Axate and I am on the registration page through popbitch FUN "browser"
When I register successfully on popbitch with one pound
And opt just charge me on the finish notice and click ok
Then wallet balance is detucted by twentyfivep
And free point is detucted by twentyfivep
And twentyfivep is displayed on the green tab
And full article is displayed to the user 