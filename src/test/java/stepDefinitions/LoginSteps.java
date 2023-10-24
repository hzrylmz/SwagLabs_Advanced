package stepDefinitions;

import utilities.ReusableMethods;
import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static utilities.Driver.getDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps extends TestBase {


    @Given("Kullanıcı giriş sayfsına gider.")
    public void kullanıcıGirisSayfsınaGider() {

    }

    @Then("Giriş Sayfasının geldiği dogrulanir.")
    public void girisSayfasınınGeldigiDogrulanir() {
        String actualTitle = getDriver().getTitle();
        String expectedTitle = "Swag Labs";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("Username alanına {string} girişi yapılır.")
    public void usernameAlanınaGirisiYapılır(String kullaniciAdi) {
        loginPage.userName.sendKeys(kullaniciAdi);
    }

    @And("Password alanına {string} girişi yapılır.")
    public void passwordAlanınaGirisiYapılır(String sifre) {
        loginPage.password.sendKeys(sifre);
    }
    @When("Login butonuna tıklandığında")
    public void loginButonunaTıklandıgında() {
        loginPage.loginButton.click();

    }
    @Then("Anasayfanın geldiği doğrulanır.")
    public void anasayfanınGeldigiDogrulanır() {
        ReusableMethods.waitForVisibility(loginPage.anasayfaBaslik, 10);
        String actualTitle = loginPage.anasayfaBaslik.getText();
        String expectedTitle = "Products";
        Assert.assertEquals(expectedTitle, actualTitle);


    }


    @Then("Hata mesajı alındığı görülür.")
    public void hataMesajıAlındıgıGorulur() {
        ReusableMethods.waitForVisibility(loginPage.bosUsername, 10);
        String actualText = loginPage.bosUsername.getText();
        String expectedText = "Epic sadface: Username is required";
        Assert.assertEquals(expectedText, actualText);

    }

    @Then("PHata mesajı alındığı görülür.")
    public void phataMesajıAlındıgıGorulur() {
        ReusableMethods.waitForVisibility(loginPage.bosPassword, 10);
        String actualText = loginPage.bosPassword.getText();
        String expectedText = "Epic sadface: Password is required";
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("Match hata mesajı alındığı görülür.")
    public void matchHataMesajıAlındıgıGorulur() {
        ReusableMethods.waitForVisibility(loginPage.matchHataMesajı, 10);
        String actualText = loginPage.matchHataMesajı.getText();
        String expectedText = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(expectedText, actualText);

    }



    @Then("Hata mesajı alınır.")
    public void hataMesajıAlınır() {
        ReusableMethods.waitForVisibility(loginPage.lockedOutMesajı, 10);
        String actualText = loginPage.lockedOutMesajı.getText();
        String expectedText = "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertEquals(expectedText, actualText);

    }
}
