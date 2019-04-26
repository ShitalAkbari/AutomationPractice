@SignIn
Feature:  SignIn
#  @regression
  Scenario: Open URL
    Given I go to url as "https://www.d3dsecurity.co.uk"
    Given I click login button on Home page
    Given I enter user name as "tasteortest@gmail.com"
    Given I enter password as "Password123"
    When I click login button on login page
    Then I should see error message "Wrong credentials"
#    Then I should see My Account button
#    Then I should see Logout button
#    Then I should not see login button