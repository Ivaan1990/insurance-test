package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageSteps {

    @Step("Выбираем пункт меню 'Автомобиль'")
    public void selectMiddleItem(){
        new MainPage().getCarInsurance();
    }

}