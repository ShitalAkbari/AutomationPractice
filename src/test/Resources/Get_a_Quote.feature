Feature: Get_a_Quote

  Scenario: Get a Quote - Entering all valid detail

#    Given I enter url as "https://www.d3dsecurity.co.uk"
#    When I click login button on home page
#    Then I should see the log in page with "Get a free Quote" panel on left side
#    Given I entered first name as "Testfirstname"
#    And I entered last name as "Testlastname"
#    And I entered valid email as "tasteortest@gmail.com"
#    And I entered phone no. as "12345678"
#    And I entered subject as "Quote"
#    And I entered message as "Yearly Quote"
#    And I entered captcha code as "Abcd"
#    When I click send message button
#    Then I should see a message on right side "Thank you, Thanks For Inquiry, We will Contact you Soon !!"


Scenario: Get a Quote - Enter All Valid Details except "First name"

Given I enter url as "https://www.d3dsecurity.co.uk"
When I click login button on home page
#Then I should see the log in page with "Get a free Quote" panel on left side
Given I entered first name as "Testfirstname"
And I entered last name as "Testlastname"
And I entered valid email  as "tasteortest@gmail.com"
And I entered phone number as "012345678"
And I entered subject as "Quote"
And I entered message as "Yearly Quote"
#And I entered captcha code as "Abcd"
When I click send message button
Then I should see a message "Validation errors occurred. Please confirm the fields and submit it again."
#
#Scenario: Get a Quote - Enter All Valid Details except "Last name"
#
#Given I enter url as "https://www.d3dsecurity.co.uk"
#When I click login button on home page
#Then I should see the log in page with "Get a free Quote" panel on left side
#Given I entered first name as "Testfirstname"
#And I entered last name as ""
#And I entered valid email as "tasteortest@gmail.com"
#And I entered phone no. as "12345678"
#And I entered subject as "Quote"
#And I entered message as "Yearly Quote"
#And I entered captcha code as "Abcd"
#When I click send message button
#Then I should see a message "last name is not valid"
#
#Scenario: Get a Quote - Enter All Valid Details except "Email"
#
#Given I enter url as "https://www.d3dsecurity.co.uk"
#When I click login button on home page
#Then I should see the log in page with "Get a free Quote" panel on left side
#Given I entered first name as "Testfirstname"
#And I entered last name as "Testlastname"
#And I entered valid email as ""
#And I entered phone no. as "12345678"
#And I entered subject as "Quote"
#And I entered message as "Yearly Quote"
#And I entered captcha code as "Abcd"
#When I click send message button
#Then I should see a message "Email is not valid"
#
#Scenario: Get a Quote - Enter All Valid Details except "Phone Number"
#
#Given I enter url as "https://www.d3dsecurity.co.uk"
#When I click login button on home page
#Then I should see the log in page with "Get a free Quote" panel on left side
#Given I entered first name as "Testfirstname"
#And I entered last name as "Testlastname"
#And I entered valid email as "Tasteortest@gmail.com"
#And I entered phone no. as ""
#And I entered subject as "Quote"
#And I entered message as "Yearly Quote"
#And I entered captcha code as "Abcd"
#When I click send message button
#Then I should see a message "Phone number is not valid"
#
#Scenario: Get a Quote - Enter All Valid Details except "Subject"
#
#Given I enter url as "https://www.d3dsecurity.co.uk"
#When I click login button on home page
#Then I should see the log in page with "Get a free Quote" panel on left side
#Given I entered first name as "Testfirstname"
#And I entered last name as "Testlastname"
#And I entered valid email as "Tasteortest@gmail.com"
#And I entered phone no. as "12345678"
#And I entered subject as ""
#And I entered message as "Yearly Quote"
#And I entered captcha code as "Abcd"
#When I click send message button
#Then I should see a message "Subject is not valid"
#
#Scenario: Get a Quote - Enter All Valid Details except "Captcha Code"
#
#Given I enter url as "https://www.d3dsecurity.co.uk"
#When I click login button on home page
#Then I should see the log in page with "Get a free Quote" panel on left side
#Given I entered first name as "Testfirstname"
#And I entered last name as "Testlastname"
#And I entered valid email as "Tasteortest@gmail.com"
#And I entered phone no. as "12345678"
#And I entered subject as "Quote"
#And I entered message as "Yearly Quote"
#And I entered captcha code as ""
#When I click send message button
#Then I should see a message "YOUR ENTERED CODE IS INCORRECT."
#
#Scenario: Get a Quote - Leave all field empty/don't enter any details"
#
#Given I enter url as "https://www.d3dsecurity.co.uk"
#When I click login button on home page
#Then I should see the log in page with "Get a free Quote" panel on left side
#Given I entered first name as "Testfirstname"
#And I entered last name as ""
#And I entered valid email as ""
#And I entered phone no. as ""
#And I entered subject as ""
#And I entered message as ""
#And I entered captcha code as ""
#When I click send message button
#Then I should see a message "PLEASE FILL IN THE REQUIRED FIELD." "YOUR ENTERED CODE IS INCORRECT." "Validation errors occurred. Please confirm the fields and submit it again."