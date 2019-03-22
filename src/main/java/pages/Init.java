package pages;

import org.openqa.selenium.WebDriver;

/**
 * @author Ivan Yushin
 *
 */
public class Init {
    private static WebDriver drv;

    public static WebDriver getDriver() {
        return drv;
    }

    public static void setDriver(WebDriver drv) {
        Init.drv = drv;
    }

    public static void delay(long mills){
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}