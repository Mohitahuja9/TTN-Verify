package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class travelCompanion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companion/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1500);");
        WebElement from= driver.findElement(By.xpath("//*[@id=\"form-field-travel_from\"]"));
        from.sendKeys("Mumbai");

        WebElement to= driver.findElement(By.xpath("//*[@id=\"form-field-travel_to\"]"));
        to.sendKeys("Delhi");

        WebElement dateToTravel= driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_date\"]"));
        dateToTravel.click();
        WebElement date= driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div[2]/div/span[33]"));
        date.click();

        WebElement airline=driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_airline\"]"));
        Select s=new Select(airline);
        s.selectByVisibleText("Air India");

        WebElement language=driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_language\"]"));
        (new Select(language)).selectByVisibleText("English");
        WebElement submit=driver.findElement(By.xpath("//*[@id=\"travel_comp_form\"]/div/div[12]/button"));
//        File ssfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File destfile = new File("Sc1");
////        FileUtils.copy(ssfile,destfile);
        submit.submit();
        Thread.sleep(7000);
        driver.quit();
    }
}
