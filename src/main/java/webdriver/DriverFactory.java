package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver createInstance(String browser) {

        WebDriver driver = null;

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
