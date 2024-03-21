package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
    public static void main (String[]args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement a= driver.findElement(By.id("alertbtn"));
        a.click();
        Alert alert = driver.switchTo().alert();
        String alertText= alert.getText();
        System.out.println("Alert Text: "+ alertText);
        Thread.sleep(2000);
        alert.dismiss();
        WebElement confirm= driver.findElement(By.id("confirmbtn"));
        confirm.click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
