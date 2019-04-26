package Com.StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.FileNotFoundException;

public class AP_SignIn_StepDefination extends DriverClass {


    @Given("^I click sign in on home page$")
    public void iClickSignInOnHomePage() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @Given("^I enter email address \"([^\"]*)\" in CREATE AN ACCOUNT box$")
    public void iEnterEmailAddressInCREATEANACCOUNTBox(String email) {
        driver.findElement(By.id("email_create")).sendKeys(email);
    }

    @When("^I click on Create an account$")
    public void iClickOnCreateAnAccount() {
        driver.findElement(By.name("SubmitCreate")).click();

    }

    @Then("^I should see YOUR PERSONAL INFORMATION page$")
    public void iShouldSeeYOURPERSONALINFORMATIONPage() {
        String Actual_URL = driver.getCurrentUrl();

    }
    @Given("^I select \"([^\"]*)\" as Title$")
    public void iSelectAsTitle(String title) throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.name("id_gender")).click();
    }

    @Given("^I enter first_name \"([^\"]*)\"$")
    public void iEnterFistname(String firstname) {
        driver.findElement(By.id("customer_firstname")).sendKeys(firstname);
    }

    @Given("^I enter last_name \"([^\"]*)\"$")
    public void iEnterLast_name(String lastname) {
        driver.findElement(By.id("customer_lastname")).sendKeys(lastname);
    }

//    @Given("^I enter email \"([^\"]*)\" in YOUR PERSONAL INFORMATION$")
//    public void iEnterEmailInYOURPERSONALINFORMATION(String email) {
//        driver.findElement(By.id("email")).sendKeys(email);
//    }


    @Given("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        driver.findElement(By.name("passwd")).sendKeys(password);
    }

    @Given("^I select Date of Birth date as \"([^\"]*)\"$")
    public void iSelectDateOfBirthDateAs(String date) {
        new Select(driver.findElement(By.id("days"))).selectByValue(date);
    }

    @Given("^I select Date of Birth months as \"([^\"]*)\"$")
    public void iSelectDateOfBirthMonthsAs(String months) {
        new Select(driver.findElement(By.id("months"))).selectByVisibleText(months);    }

    @Given("^I select Date of Birth year as \"([^\"]*)\"$")
    public void iSelectDateOfBirthYearAs(String year) {
        new Select(driver.findElement(By.id("years"))).selectByValue(year);
    }

    @Given("^I click \"([^\"]*)\"$")
    public void iClick(String click1) {
        driver.findElement(By.name("newsletter")).click();
    }

    @Given("^I click on message \"([^\"]*)\"$")
    public void iClickOnMessage(String click2) {
        driver.findElement(By.name("optin")).click();
    }

    @Given("^I enter firstname in your address as \"([^\"]*)\"$")
    public void iEnterFirstnameInYourAddressAs(String firstname) {
        driver.findElement(By.id("firstname")).sendKeys(firstname);
    }

    @Given("^I enter lastname in your address as \"([^\"]*)\"$")
    public void iEnterLastnameInYourAddressAs(String lastname){
        driver.findElement(By.id("lastname")).sendKeys(lastname);

    }

    @Given("^I enter Company name in your address as \"([^\"]*)\"$")
    public void iEnterCompanyNameInYourAddressAs(String companyname) {
        driver.findElement(By.id("company")).sendKeys(companyname);
    }

    @Given("^I enter address in your address as \"([^\"]*)\"$")
    public void iEnterAddressInYourAddressAs(String address) {
        driver.findElement(By.id("address1")).sendKeys(address);
    }


    @Given("^I enter city in your address as \"([^\"]*)\"$")
    public void iEnterCityInYourAddressAs(String city) {
        driver.findElement(By.id("city")).sendKeys(city);
    }

    @Given("^I select state in your address as \"([^\"]*)\"$")
    public void iSelectStateInYourAddressAs(String state) {
        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText(state);
    }

    @Given("^I enter Zip/Postal code as \"([^\"]*)\"$")
    public void iEnterZipPostalCodeAs(String Zipcode) {
        driver.findElement(By.id("postcode")).sendKeys(Zipcode);
    }

//    @Given("^I select country as \"([^\"]*)\"$")
//    public void iSelectCountryAs(String country) {
//        driver.findElement(By.id("id_country")).click();
//    }

    @Given("^I enter Additional Information as \"([^\"]*)\"$")
    public void iEnterAdditionalInformationAs(String additionalinfo) {
        driver.findElement(By.id("other")).sendKeys(additionalinfo);
    }

    @Given("^I enter Mobile phone no as \"([^\"]*)\"$")
    public void iEnterMobilePhoneNoAs(String mobileno) {
        driver.findElement(By.id("phone_mobile")).sendKeys(mobileno);
    }


    @When("^I click Register button on my account-account creation page$")
    public void iClickRegisterButtonOnMyAccountAccountCreationPage() {
         driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
    }

    @Then("^I should see my account page$")
    public void iShouldSeeMyAccountPage() {
        String Actual_URL = driver.getCurrentUrl();
    }

    @Given("^I enter an address alias for future reference as \"([^\"]*)\"$")
    public void iEnterAnAddressAliasForFutureReferenceAs(String alias) {
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys(alias);
    }

}
