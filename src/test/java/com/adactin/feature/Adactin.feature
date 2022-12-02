Feature: Booking hotel room
@sanityTest
Scenario: Login page
Given user launch the URL
When user gives username
When user gives password
And user clicks login
@smokeTest
Scenario: search Hotel
Given user gives the location
When user gives the hotel name
And user gives the room type
And user gives the Room number
And user gives check in date
And user gives check out date
And user gives the adult per room
And user gives child per room
Then user clicks search
@RegressionTest
Scenario: Select Hotel
Given user selects the hotel
And user clicks continue button
@IntegerationTest
Scenario: Book Hotel
Given user gives firstname
And user gives lastname
And user gives Address
And user gives card type
And user gives card no
And user gives expiry date 
And user gives  expiry year
And user gives ccv number
Then user gives book now
@logoutTest
Scenario: logout Hotel
Given user gives logout
