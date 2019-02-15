Feature: Login tests

Background:
  Given User is on store.demoqa.com
  When User clicks on my account link
  
  Scenario: Verify that user is able to login using valid username and password
    And User logs in using valid username and password
    Then User is taken to myaccount page

  Scenario: Verify that user is able to login using valid username and password
    And User logs in using valid username and password
    Then User is taken to myaccount page