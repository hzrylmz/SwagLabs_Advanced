package stepDefinitions;

import utilities.ConfigReader;
import utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.After;

public class Hooks {

    @Before
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("urlSauce"));
    }


    @After
    public void tearDown(Scenario scenario) {
        /*final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(screenshot,"image/png","screenshots");
        }*/
        Driver.closeDriver();
    }
}
