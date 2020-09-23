import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverManager;
import webdriver.DriverFactory;

import java.lang.reflect.Method;

public abstract class BaseTest {

    private static final String DEFAULT_BROWSER = System.getProperty("browser", "chrome");

    @BeforeMethod
    public void setUp(Method method) {


        if (DriverManager.getWebDriver() == null) {
            DriverManager.setWebDriver(DriverFactory.createInstance(DEFAULT_BROWSER));
            System.out.println("WebDriver Object : " + DriverManager.getWebDriver());
        }

    }

    @AfterMethod
    public void closeDriver() {
        DriverManager.closeDriver();
    }
}
