package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radiobutton {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        WebElement departure=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
        departure.click();
        WebElement selectfrom=driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[11]/a"));
        selectfrom.click();
        WebElement arrival=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
        arrival.click();
        WebElement selectto=driver.findElement(By.xpath("(//*[@id=\"dropdownGroup1\"]/div/ul[3]/li[8]/a)[2]"));
        selectto.click();
        WebElement date=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[5]/a"));
        date.click();
        WebElement search=driver.findElement(By.xpath("(//*[@id=\"ctl00_mainContent_btn_FindFlights\"])[1]"));
        search.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
