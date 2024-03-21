package Base;

import jdk.jfr.Percentage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String b){
        switch (b){
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "IE":
                return new InternetExplorerDriver();
            default:
                break;
        }
        return null;
    }
}
