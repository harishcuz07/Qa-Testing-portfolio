@wholeFile
Feature: facebook login
@aravind
Scenario: login into facebook application
Given User launching the facebook application
When User enters "selva" and "raj" in login page
Then User click login button in login page
And User validate homepage

@jancy
Scenario: login into facebook application
Given User launching the facebook application
When User enters username and password in login page
|gopal|gopal@123|     
|jancy|jancy@123|    
Then User click login button in login page
And User validate homepage

@bharathan  @q
Scenario: login into google application
Given User launching the google application
When User enters valid data 
Then User click search button 
And User validate content

@gopall @q
Scenario Outline: login into facebook applications
Given User launching the facebook application
When selva enter "<userid>" and "<passcode>" in login page
Then User click login button in login page
And User validate homepage

Examples:
|userid|passcode|
|gopal|gopal@123|
|jancy|jancy@123|

@harish

Scenario: login into google application
Given User launching the google application
When User enters valid data 
Then User click search button 
And User validate content


