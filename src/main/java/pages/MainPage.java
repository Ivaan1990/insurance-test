package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "//*/ol/li/a[contains(text(), 'Страхование')]")
    public WebElement openInsuranceBar;

    public MainPage(){
        PageFactory.initElements(Init.getDriver(),this);
    }
}