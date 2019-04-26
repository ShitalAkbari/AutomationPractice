package Com.StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Reg_StepDefination {
    WebDriver driver;

    @Given("^I go to open URL as \"([^\"]*)\"$")
    public void iGoToOpenURLAs(String URL) throws Throwable {
        System.out.println(URL);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();

    }

    @Given("^I click Register button on Home page$")
    public void iClickRegisterButtonOnHomePage() {
        driver.findElement(By.linkText("Register")).click();

    }

    @Given("^I enter valid Firstname as \"([^\"]*)\"$")
    public void iEnterValidFirstnameAs(String firstname) throws Throwable {
        driver.findElement(By.name("first_name")).sendKeys(firstname);
    }


    @Given("^I enter valid lastname as \"([^\"]*)\"$")
    public void iEnterValidLastnameAs(String lastname) {
        driver.findElement(By.name("last_name")).sendKeys(lastname);


    }

    @Given("^I enter valid email as \"([^\"]*)\"$")
    public void iEnterValidEmailAs(String email) {
        driver.findElement(By.name("email")).sendKeys(email);
    }

    @Given("^I enter new password as \"([^\"]*)\"$")
    public void iEnterNewPasswordAs(String newpassword)  {
        driver.findElement(By.name("pass1")).sendKeys(newpassword);
    }


    @Given("^I enter confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String confirmpassword) {
        driver.findElement(By.name("pass2")).sendKeys(confirmpassword);
    }

    @When("^I click Register button$")
    public void iClickRegisterButton() {
        driver.findElement(By.name("btn-submit")).click();
    }


    @Then("^I should see message \"([^\"]*)\"$")
    public void iShouldSeeMessage(String expected_result)  {
        String actual_result;
        actual_result= driver.findElement(By.xpath("//*[@id=\'post-4519\']/div/div[1]/p")).getText();
        assertEquals(expected_result,actual_result);

    }


}



