package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        Actions a=new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");
        WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement drop=driver.findElement(By.xpath("(//*[@id=\"droppable\"])[1]"));
        a.dragAndDrop(drag,drop).build().perform();
        a.contextClick().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
