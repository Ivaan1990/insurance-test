package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Ivan Yushin
 */

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Init.getDriver(),this);
    }

    public WebElement findXpath(String xPath){
        return Init.getDriver().findElement(By.xpath(xPath));
    }

    public void scrollPage(String xPath){
        ((JavascriptExecutor)Init.getDriver()).executeScript(
                "arguments[0].scrollIntoView();",
                Init.getDriver().findElement(By.xpath(xPath))
        );
    }

    public void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(Init.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        //wait.until(elem -> element.isDisplayed());
    }
}