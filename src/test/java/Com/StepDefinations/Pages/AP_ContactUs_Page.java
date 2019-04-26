package Com.StepDefinations.Pages;

import Com.StepDefinations.DriverClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.FileNotFoundException;


public class AP_ContactUs_Page extends DriverClass {



    public void ClickonContactUsButton (){
        driver.findElement(By.id("contact-link")).click();

    }
    public void SelectFromSubjectHeading (){
        new Select(driver.findElement(By.id("id_contact"))).selectByValue("2");
    }
    public void EnterEmailAddress(String email){
        driver.findElement(By.id("email")).sendKeys(email);
    }
    public void EnterOrderReference(String OrderRef){
        driver.findElement(By.name("id_order")).sendKeys(OrderRef);

    }
    public void AttachFile(){
        String path = System.getProperty("user.dir");
        driver.findElement(By.name("fileUpload")).sendKeys(path + "/src/test/java/Com/TestData/sample.txt");

    }
    public void EnterMessage(String message){
        driver.findElement(By.name("message")).sendKeys(message);
    }
    public void ClickButton(){
        driver.findElement(By.name("submitMessage")).click();
    }
    public void SeeMessage(String expected_message){
        String actual_message = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
        Assert.assertEquals(expected_message, actual_message);

    }

}
