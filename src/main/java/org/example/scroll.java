package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class scroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tothenew.com/");
        driver.manage().window().maximize();
//        Actions a=new Actions(driver);
//        a.scrollByAmount(0,5900);
//        Thread.sleep(5000);
//        a.scrollByAmount(0,-5900);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,5900)");
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-5900)");
        Thread.sleep(5000);
        driver.quit();
    }
}
