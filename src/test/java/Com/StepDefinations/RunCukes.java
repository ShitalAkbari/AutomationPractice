package Com.StepDefinations;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources", tags = "@AP_SignIn")
//Example - tags = "@regression", tags = "SignIn"
public class RunCukes {

}
