import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Init;
import pages.MainPage;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * @author Ivan Yushin
 *
 */
public class InsuranceBaseTest {
    public static Properties properties = TestProperties.getInstance().getProperties();
    public static String url;

    @Before
    public void insuranceTest(){
        switch (properties.getProperty("browser")){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
                Init.setDriver(new ChromeDriver());
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", properties.getProperty("drv/geckodriver.exe"));
                Init.setDriver(new FirefoxDriver());
        }

        url = properties.getProperty("app.url");
        Init.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Init.getDriver().manage().window().maximize();
        Init.getDriver().get(url);
    }

    @Test
    public void insuranceBarTest(){
        MainPage mainPage = new MainPage();
        mainPage.openInsuranceBar.click();
    }

    @After
    public void close(){
        Init.getDriver().quit();
    }
}