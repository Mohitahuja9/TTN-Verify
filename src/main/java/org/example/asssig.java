package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asssig {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        WebElement firstname= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstname.click();
        firstname.sendKeys("Mohit");
        WebElement lastname= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastname.click();
        lastname.sendKeys("Ahuja");
        WebElement email=driver.findElement(By.xpath("//input[@type='tel']"));
        email.click();
        email.sendKeys("mhtahu@gmail.com");
        Thread.sleep(2000);
        driver.close();
    }
}
