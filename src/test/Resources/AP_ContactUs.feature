@ContactUs
Feature:

 Scenario: ContactUs
  Given I click on contact us button
  Given I selects "Customer service" from subject heading
  Given I enter Email address as "tasteortest@gmail.com"
  Given I enter Order reference as "Order"
  Given I attach file
  Given I enter message as "Thank you"
  When I click "Send" button
  Then I should see "Your message has been successfully sent to our team." message