package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageSteps {

    @Step("�������� ����� ���� '����������'")
    public void selectMiddleItem(){
        new MainPage().getCarInsurance();
    }

}