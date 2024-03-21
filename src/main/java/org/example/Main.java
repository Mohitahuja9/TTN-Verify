package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println("Title of the page is: "+title);
        WebElement firstname= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstname.click();
        firstname.sendKeys("Mohit");
     //   Thread.sleep(2000);
        //firstname.clear();
        WebElement lastname= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastname.click();
        lastname.sendKeys("Ahuja");
      //  Thread.sleep(2000);
      //  lastname.clear();
      //  firstname.clear();
        WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        address.click();
        address.sendKeys("Faridabad");

        WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
        email.click();
        email.sendKeys("mohit@gmail.com");

        WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
        phone.click();
        phone.sendKeys("9898989898");

        WebElement female=driver.findElement(By.xpath("//input[@value='FeMale']"));
        female.click();

        WebElement male=driver.findElement(By.xpath("//input[@value='Male']"));
        male.click();
        boolean s= male.isSelected();
        System.out.println("Respective gender is selected: "+s);

        WebElement hobbiecricket=driver.findElement(By.xpath("//input[@id='checkbox1']"));
        hobbiecricket.click();

        WebElement hobbiemovies=driver.findElement(By.xpath("//input[@id='checkbox2']"));
        hobbiemovies.click();

        WebElement hobbiehockey=driver.findElement(By.xpath("//input[@id='checkbox3']"));
        hobbiehockey.click();

        WebElement languagesDropdown = driver.findElement(By.id("msdd"));
        languagesDropdown.click();

        WebElement englishLanguage = driver.findElement(By.xpath("//a[contains(text(),'English')]"));
        englishLanguage.click();

        Select skillsDropdown = new Select(driver.findElement(By.id("Skills")));
        skillsDropdown.selectByVisibleText("Java");

        Select selectCountry = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        selectCountry.selectByVisibleText("India");

        Select yearDropdown = new Select(driver.findElement(By.id("yearbox")));
        yearDropdown.selectByVisibleText("2002");

        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
        monthDropdown.selectByVisibleText("October");

        Select dayDropdown = new Select(driver.findElement(By.id("daybox")));
        dayDropdown.selectByVisibleText("28");

        WebElement pass=driver.findElement(By.id("firstpassword"));
        pass.click();
        pass.sendKeys("9354$Mohit");

        WebElement pass2=driver.findElement(By.id("secondpassword"));
        pass2.click();
        pass2.sendKeys("9354$Mohit");

        WebElement header=driver.findElement(By.xpath("//h1"));
        String head=header.getText();
        System.out.println("Header is Automation Demo Site: "+head.equals("Automation Demo Site"));
        WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
        submit.click();
        Thread.sleep(2000);
        driver.quit();
    }
}