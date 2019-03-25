package steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Когда;
import pages.MainPage;

public class SimpleSteps {

    @Когда("шаг без параметров")
    public void startTest(){
        System.out.println("Test start");
    }

    @Когда("выполняется шаг входа на страницу страхования авто")
    public void inToInsuranceCarPage(){
        System.out.println("Заходим на страницу автострахования");
        //throw  new PendingException();
    }

    @Когда("выполняется выбор нужной страховки")
    public void choiseInsuranceTypeCar(){
        System.out.println("Выбираем страховку");
        //throw  new PendingException();
    }

}