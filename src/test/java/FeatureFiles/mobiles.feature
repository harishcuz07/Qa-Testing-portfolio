#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Registration 
Background: 
Given user on the homepage  
And user follows "Sign in"  
@regression  
Scenario: Create a New User 
When user fills "registration email textbox" with "chitrali.sharma27@gmail.com"  
And user clicks "create an account button"  
And user enters the following details 
| First Name | Chitrali| 
| Last Name | Sharma| 
| Password | Inquiry@1234 | 
| Date | 17| | Month | 02| | Year | 1992 |  
And user clicks "register button"

Scenario: User does not follow form validations
When user enters wrong characters
Then error message displayed with invalid password
And user returns back on registration page


Feature: Login
Background: 
Given user on the login page  
And user follows "Log in"  

@regression @smoke
Scenario: Verification of Login Function  
Given user on the Login Page
And user enters "email address" with "chitrali.sharma27@gmail.com" 
And user enters "password" with "Inquiry@1234"  
And user click "log in" button
Then user should see "My Account" 
Scenario: Unsuccessful login
Given user on the Login Page
And user enters "email address" with "chitrali.sharma27@gmail.com" 
And user enters "password" with "qsder@1234"  
And user clicks "login" button
Then error message displayed with wrong password
And user returns back on login page