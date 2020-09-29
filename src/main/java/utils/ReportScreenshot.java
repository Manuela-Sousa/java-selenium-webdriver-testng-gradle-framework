package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;

public class ReportScreenshot {

    public File takeScreenshotWindowAsFile() {

        WebDriver driver = DriverManager.getWebDriver();

        driver.get("https://exercism.io/");

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("screenshot.png");
        source.renameTo(destination);

        Assert.assertTrue(destination.exists(), "screenshot file does not exist");
        Assert.assertTrue(destination.length() > 0, "screenshot file size is zero");

        return destination;

    }
}
