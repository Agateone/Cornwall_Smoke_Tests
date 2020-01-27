Feature: First use notice displayed on a premium article



Scenario: First use notice displayed on a premium article when a user is in a logged out state
Given I am a user of Axate and in a logged out state 
When I navigate to a premium article on popbitch
Then the first use notice is displayed



