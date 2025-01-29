@WholeTestcases
Feature: FlipkartFlightModule

@Testcase1   @smoke @balaji
  Scenario: Booking flight ticket 
    Given User lauching the flipkart application
    When User navigating to flight tab in flipkart application
    Then User enters location in search box in flight tab page in an application 
    Then User clicks on search button i flight tab page in an application 
    Then User validating departure location error message
    Then User quit the flipkart application
    
   @topoffer  @smoke @noushiq
  Scenario: Booking grocery
    Given User lauching the flipkart application
    When User navigating to grocery tab in flipkart application
    Then User enters dal in search box grocery tab page in an application
    Then User clicks on search buttton in grocery tab page in an application
    Then User validating whether dal product displayed or not
   
   
  @sandy  @smoke @noushiq
  Scenario: Booking m0bile
    Given User lauching the flipkart application
    When User navigating to mobile tab in flipkart application
    Then User search apple  in mobile tab page in an application
    Then User validating apple mobile in next tab
    Then User quit the flipkart application
    
 @mohan   @smoke
 Scenario: Booking shoes
 Given user launching the amazon application
 When user navigating to fashion tab in amazon application
 Then user search blueshoes tab page in an application
 Then user validating blueshoes in next tab
 Then user quit the amazon application
 
 @mohan
 Scenario: User Create a customer location
 Given user initializing base url of the application
 When user creates customer datas into map address
 Then user validating the response whether created or not
 
 @Sundar
 Scenario: User Create a customer location
 Given user initializing base url of the xxx application
 When user creates customer datas into map xxx address
 Then user validating the response whether xxx created or not
 
    @Bruce
 Scenario: User Create a customer location
 Given user initializing base url of the xxx application
 When user creates customer datas into map xxx address
 Then user validating the response whether xxx created or not
  