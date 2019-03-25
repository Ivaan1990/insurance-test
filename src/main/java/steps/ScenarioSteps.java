package steps;

import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.CarInsurancePage;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    InsuranceCarSteps insuranceCarSteps = new InsuranceCarSteps();

    @Когда("Выбран пункт меню Автомобиль")
    public void getCarInsurance(){
        mainPageSteps.selectMiddleItem();
    }

    @Тогда("Заголовок страницы равен \"Страхование автомобиля\"")
    public void checkTheTitleCarInsurance(String title){
        insuranceCarSteps.checkPageTitle(title);
    }
}