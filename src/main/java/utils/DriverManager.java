package utils;


import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    public static WebDriver getWebDriver() {
        return DRIVER.get();
    }

    public static void setWebDriver(WebDriver driver) {
        DRIVER.set(driver);
    }

    public static void closeDriver() {
        if (DRIVER.get() != null) {
            DRIVER.get().quit();
            DRIVER.remove();
        }
    }
}
