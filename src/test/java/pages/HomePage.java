package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getDriver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']']")
    public WebElement hamburgerMenu_btn;

    @FindBy(xpath = "//nav[@class='bm-item-list']")
    public WebElement hamburgerMenu_list;











}
