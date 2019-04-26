package Com.StepDefinations;

import cucumber.api.java.Before;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Hooks {
    DriverClass driverC = new DriverClass();

    @Before
    public void browser() throws IOException {
        driverC.openBrowser();
    }

//    @After
//    public void close(){
//        driverC.closeBrowser();
//
//    }
}
