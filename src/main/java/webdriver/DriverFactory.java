package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private DriverFactory() {
    }

    /**
     * Create WebDriver Instance
     */
    public static WebDriver createInstance(String browser) {

        WebDriver driver = null;
        // code for creating Chrome, Firefox or any other driver object
        switch (browser) {

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default:
            case "chrome":
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }
}
