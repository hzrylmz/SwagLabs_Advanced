package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ReusableMethods;

public class HomePageSteps extends TestBase {


    @Then("Kullanıcı Login Olur")
    public void kullanıcıLoginOlur() {
        loginPage.loginOlma();
    }

    @And("Hamburger menünün geldiği görülür.")
    public void hamburgerMenununGeldigiGorulur() {
        ReusableMethods.waitForVisibility(homePage.hamburgerMenu_btn, 10);

    }

    @When("Hamburger menü butonuna tıklandığında")
    public void hamburgerMenuButonunaTıklandıgında() {
        homePage.hamburgerMenu_btn.click();
    }

    @Then("Eleman sayısı alınır.")
    public void elemanSayısıAlınır() {
        int buttonSayisi = ReusableMethods.ilgiliListeninSayisiniDondur(homePage.hamburgerMenu_list);
        int expectedBtnSayisi = 4;
        Assert.assertEquals(expectedBtnSayisi, buttonSayisi);

    }


}
