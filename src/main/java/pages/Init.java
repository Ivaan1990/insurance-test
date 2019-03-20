package pages;

import org.openqa.selenium.WebDriver;

public class Init {
    private static WebDriver drv;

    public static WebDriver getDriver() {
        return drv;
    }

    public static void setDriver(WebDriver drv) {
        Init.drv = drv;
    }
}