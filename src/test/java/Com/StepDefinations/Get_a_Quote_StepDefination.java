package Com.StepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertNotEquals;

public class Get_a_Quote_StepDefination {
    WebDriver driver;

    @Given("^I enter url as \"([^\"]*)\"$")
    public void iEnterUrlAs(String URL) {
        System.out.println(URL);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();

    }

    @When("^I click login button on home page$")
    public void iClickLoginButtonOnHomePage() {
        driver.findElement(By.linkText("Login")).click();
    }

    @Given("^I entered first name as \"([^\"]*)\"$")
    public void iEnteredFirstNameAs(String firstname) {
        driver.findElement(By.name("first-name")).sendKeys(firstname);


    }

    @And("^I entered last name as \"([^\"]*)\"$")
    public void iEnteredLastNameAs(String lastname) {
        driver.findElement(By.name("last-name")).sendKeys(lastname);
    }

    @And("^I entered valid email  as \"([^\"]*)\"$")
    public void iEnteredValidEmailAs(String email) {
        driver.findElement(By.name("your-email")).sendKeys(email);

    }
//        String timestamp = new SimpleDateFormat("YYYY.MM.DD.HH.MM.SS").format(new Date());
//        System.out.println(timestamp);
//        String emailid_i[] = emailid.split("@");
//        String emailid_2=emailid_i[0]+"timestamp" + "@" + emailid_i[1];
//        System.out.println(emailid_2);


    @And("^I entered phone number as \"([^\"]*)\"$")
       public void iEnteredPhoneNoAs(String phonenumber) {
        driver.findElement(By.name("tel-879")).sendKeys(phonenumber);

    }

    @And("^I entered subject as \"([^\"]*)\"$")
    public void iEnteredSubjectAs(String Subject) {
        driver.findElement(By.name("your-subject")).sendKeys(Subject);


    }

    @And("^I entered message as \"([^\"]*)\"$")
    public void iEnteredMessageAs(String Message){
        driver.findElement(By.name("your-message")).sendKeys(Message);

    }

    @When("^I click send message button$")
    public void iClickSendMessageButton() {
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f391-o1\"]/form/p[4]/input")).click();

    }


    @Then("^I should see a message \"([^\"]*)\"$")
    public void iShouldSeeAMessage(String expected_result) {
        String actual_result;
                actual_result= driver.findElement(By.xpath("/html/body")).getText();
        assertNotEquals(expected_result,actual_result);

    }


}
