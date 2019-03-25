package steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CarInsurancePage;

public class InsuranceCarSteps {

    @Step("заголовок страницы равен")
    public void checkPageTitle(String title){
        WebElement element = new CarInsurancePage().title;
        Assert.assertEquals("Заголовок не соответстует ожидаемому", title, element.getText());
    }

}