import org.junit.After;import org.junit.Before;import org.junit.Test;import org.openqa.selenium.WebDriver;import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.firefox.FirefoxDriver;import pages.CarInsurancePage;import pages.Init;import pages.MainPage;import java.util.Properties;import java.util.concurrent.TimeUnit;/** * @author Ivan Yushin * @see CarInsurancePage * */public class InsuranceBaseTest {    public static Properties properties = TestProperties.getInstance().getProperties();    public static String url;    public WebDriver drv;    @Before    public void insuranceTest(){        switch (properties.getProperty("browser")){            case "chrome":                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));                Init.setDriver(new ChromeDriver());                break;            case "firefox":                System.setProperty("webdriver.gecko.driver", properties.getProperty("drv/geckodriver.exe"));                Init.setDriver(new FirefoxDriver());                break;        }        url = properties.getProperty("app.url");        Init.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);        Init.getDriver().manage().window().maximize();        Init.getDriver().get(url);    }    @Test    public void insurance(){        MainPage mainPage = new MainPage(); // главная страница rgs        mainPage.printAllCategoriesOfInsurance();        mainPage.getCarInsurance();        CarInsurancePage pageCarInsurance = new CarInsurancePage();        pageCarInsurance.choiseCarInsuranceType("осаго");        //pageCarInsurance.choiseCarInsuranceType("каско");        //pageCarInsurance.choiseCarInsuranceType("зеленая карта");        //pageCarInsurance.choiseCarInsuranceType("Антикризисное каско");    }    @Test    public void tour(){        MainPage mainPage = new MainPage();        mainPage.getTourInsurance();    }    @After    public void close(){        Init.delay(2000);        Init.getDriver().quit();    }}