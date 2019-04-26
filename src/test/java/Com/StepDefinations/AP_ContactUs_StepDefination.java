package Com.StepDefinations;

import Com.StepDefinations.Pages.AP_ContactUs_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class AP_ContactUs_StepDefination extends DriverClass {
    public AP_ContactUs_Page c_page = PageFactory.initElements(driver,AP_ContactUs_Page.class);



    @Given("^I click on contact us button$")
    public void ClickOnContactUsButton() {
       c_page.ClickonContactUsButton();
    }

    @Given("^I selects \"([^\"]*)\" from subject heading$")
    public void iSelectsFromSubjectHeading(String Subject_heading) {
       c_page.SelectFromSubjectHeading();
    }
    @Given("^I enter Email address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String email) {
       c_page.EnterEmailAddress(email);
    }
    @Given("^I enter Order reference as \"([^\"]*)\"$")
    public void iEnterOrderReferenceAs(String OrderRef) {
        c_page.EnterOrderReference(OrderRef);
    }

    @Given("^I attach file$")
    public void iAttachFile() {
        c_page.AttachFile();
    }
    @Given("^I enter message as \"([^\"]*)\"$")
    public void iEnterMessageAs(String message) {
        c_page.EnterMessage(message);
    }
    @When("^I click \"([^\"]*)\" button$")
    public void iClickButton(String send) {
        c_page.ClickButton();
    }
    @Then("^I should see \"([^\"]*)\" message$")
    public void iShouldSeeMessage(String expected_message){
       c_page.SeeMessage(expected_message);
    }


//    @Given("^I click sign in$")
//    public void iClickSignIn() {
//        driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=my-account")).click();
//    }
//
//
//    @Given("^I enter email address \"([^\"]*)\" in CREATE AN ACCOUNT box$")
//    public void iEnterEmailAddressInCREATEANACCOUNTBox(String email1) {
//        driver.findElement(By.id("email_create")).sendKeys(email1);
//    }
}