package base;

import pages.HomePage;
import pages.LoginPage;
import org.openqa.selenium.interactions.Actions;

import static utilities.Driver.getDriver;

public  abstract class TestBase {
    public  LoginPage loginPage = new LoginPage();
    public  Actions actions = new Actions(getDriver());

    public HomePage homePage = new HomePage();

}
