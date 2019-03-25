package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

/**
 * @author Ivan Yushin
 * Страница https://www.rgs.ru/products/private_person/auto/index.wbp
 * @see #choiseInsuranceType(String) параметр, тип страхования осаго/каско/зеленая карта/антикризисное каско
 * @see #printTypesOfCarInsurance() все виды страхования авто в консоль
 */
public class CarInsurancePage extends BasePage {
    public static final String XPATH_INSURANCE_TYPE = "//h3[text()='%s']";

    @FindBy(xpath = "//*[@class='content-document']//h3")
    private List<WebElement> typesInsurance;

    @FindBy(xpath = "//*[@class='content-document-header']")
    public WebElement title;

    public CarInsurancePage(){
        super();
        //waitForElement(typesInsurance.get(0));
    }

    public void calculationСarInsurance(String type){

    }

    public void choiseCarInsuranceType(String insuranceType){
        this.scrollPage("//h3[text()='ОСАГО']");
        for(WebElement element : typesInsurance){
            if (element.getText().equalsIgnoreCase(insuranceType)){
                insuranceType = element.getText();
            }
        }
        String insurance = String.format(XPATH_INSURANCE_TYPE, insuranceType);
        findXpath(insurance).click();
    }

    public void printTypesOfCarInsurance(){
        System.out.println("Виды страхования:");
        typesInsurance.stream().forEach(System.out::println);
    }
}