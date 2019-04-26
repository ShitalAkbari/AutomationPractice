@regression
Feature: Registration


  Scenario: Open URL & Register
    Given I go to open URL as "https:\\www.d3dsecurity.co.uk"
    Given I click Register button on Home page
    Given I enter valid Firstname as "Testfirstname"
    Given I enter valid lastname as "Testlastname"
    Given I enter valid email as "tasteortest@gmail.com"
    Given I enter new password as "Password098"
    Given I enter confirm password as "Password098"
    When I click Register button
    Then I should see message "Username is not valid"