package Com.StepDefinations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DriverClass {
    public static WebDriver driver;

    public DriverClass() throws FileNotFoundException {
    }

    public void openBrowser() throws IOException {


    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    driver.get("http://www.automationpractice.com");
        String env = System.getProperty("env");
        String path = System.getProperty("user.dir");
        String file = null;

        if(env.equalsIgnoreCase("qa"))

        {
            file = path + "src/test/java/com/StepDefinations/Propertfiles/envonment_qa.properties";
        }
        else if(env.equalsIgnoreCase("uat")){
            file = path + "src/test/java/com/StepDefinations/Propertfiles/envonment_uat.properties";
        }
        else if(env.equalsIgnoreCase("prod")){
            file = path + "src/test/java/com/StepDefinations/Propertfiles/envonment_prod.properties";
        }
        Properties properties= new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("url"));
        driver.get(properties.getProperty("url"));


    }


//    public void closeBrowser(){
//        driver.quit();
//
//}

}
