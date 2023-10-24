package pages;

import utilities.ConfigReader;
import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {



    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//div[text() = 'Swag Labs']" )
    public WebElement swagBaslik;

    @FindBy(xpath ="//input[@id = 'user-name']")
    public WebElement userName;

    @FindBy(xpath ="//input[@id = 'password']")
    public WebElement password;

    @FindBy(xpath ="//input[@id = 'login-button']")
    public WebElement loginButton;

    @FindBy(xpath ="//span[@class='title']")
    public WebElement anasayfaBaslik;

    @FindBy(xpath = "//h3[.='Epic sadface: Username is required']" )
    public WebElement bosUsername;
    @FindBy(xpath = "//h3[.='Epic sadface: Password is required']" )
    public WebElement bosPassword;

    @FindBy(xpath = "//h3[.='Epic sadface: Username and password do not match any user in this service']" )
    public WebElement matchHataMesajı;

    @FindBy(xpath ="//h3[.='Epic sadface: Sorry, this user has been locked out.']" )
    public WebElement lockedOutMesajı;

    public void loginOlma(){
        userName.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        password.sendKeys(ConfigReader.getProperty("sifre"));
        loginButton.click();
    }





}
