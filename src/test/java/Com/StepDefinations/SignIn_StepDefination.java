package Com.StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

import static junit.framework.TestCase.assertEquals;

public class SignIn_StepDefination extends DriverClass {


//    WebDriver driver;

    @Given("^I go to url as \"([^\"]*)\"$")
    public void iGoToUrlAs(String URL) {
        System.out.println(URL);
//open a Chrome browser
        //open a URL
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();

        driver.get(URL);
        //    driver.manage().window().fullscreen();
        driver.manage().window().maximize();
    }

    @Given("^I click login button on Home page$")
    public void iClickLoginButtonOnHomePage() {
        driver.findElement(By.linkText("Login")).click();
    }

    @Given("^I enter user name as \"([^\"]*)\"$")
    public void iEnterUserNameAs(String username) {
        driver.findElement(By.name("log")).sendKeys(username);
    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        driver.findElement(By.name("pwd")).sendKeys(password);

    }

    @When("^I click login button on login page$")
    public void iClickLoginButtonOnLoginPage() {
        driver.findElement(By.name("submit")).click();

    }


    @Then("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String expected_errorMessage) {
        String actual_errorMessage;
        actual_errorMessage = driver.findElement(By.xpath("//*[@id=\'post-4521\']/div/div[1]/p")).getText();
        assertEquals(actual_errorMessage, expected_errorMessage);

    }

}






