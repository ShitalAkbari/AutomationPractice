@AP_SignIn
Feature:
  Scenario: AP_SignIn

    Given I click sign in on home page
    Given I enter email address "Test04042019@gmail.com" in CREATE AN ACCOUNT box
    When I click on Create an account
    Then I should see YOUR PERSONAL INFORMATION page
    Given I select "Mr." as Title
    Given I enter first_name "Testfirstname"
    Given I enter last_name "Testlastname"
    Given I enter password "Password1"
    Given I select Date of Birth date as "1"
    Given I select Date of Birth months as "March "
    Given I select Date of Birth year as "1985"
    Given I click "Sign up for our newsletter!"
    Given I click on message "Receive special offers from our partners!"
#    Given I enter firstname in your address as "Testfirstname"
#    Given I enter lastname in your address as "Testlastname"
    Given I enter Company name in your address as "S&Co"
    Given I enter address in your address as "51"
    Given I enter city in your address as "Anchorage"
    Given I select state in your address as "Alaska"
    Given I enter Zip/Postal code as "99501"
#    Given I select country as "United States"
    Given I enter Additional Information as "Thank you"
    Given I enter Mobile phone no as "1234567891"
    Given I enter an address alias for future reference as "My Address"
    When I click Register button on my account-account creation page
    Then I should see my account page






