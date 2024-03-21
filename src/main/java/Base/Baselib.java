package Base;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Baselib {
    public static WebDriver Excel() throws IOException{
        WebDriver driver=BrowserFactory.getDriver("chrome");
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        FileInputStream file = new FileInputStream(new File("C:/Users/Mohit Ahuja/Downloads/Untitled spreadsheet (2).xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            WebElement element = null;
            String field = row.getCell(0).getStringCellValue();
            String value = row.getCell(1).getStringCellValue();

            switch (field) {
                case "FirstName":
                    element = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
                    break;
                case "LastName":
                    element = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
                    break;
                case "Address":
                    element = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
                    break;
                case "Email":
                    element = driver.findElement(By.xpath("//input[@type='email']"));
                    break;
                case "Phone":
                    element = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
                    break;
                case "Gender":
                    element = driver.findElement(By.xpath("//input[@value='Male']"));
                    break;
                case "Languages":
                    WebElement languagesDropdown = driver.findElement(By.id("msdd"));
                    languagesDropdown.click();
                    if (value.equals("English")){
                        WebElement englishLanguage = driver.findElement(By.xpath("//a[contains(text(),'English')]"));
                        englishLanguage.click();
                    }
                    break;
                case "Hobbies":
                    element = driver.findElement(By.xpath("//input[@id='checkbox1']"));
                    element.click();
                    break;
                case "Skills":
                    element = driver.findElement(By.id("Skills"));
                    new Select(element).selectByVisibleText(value);
                    break;
                case "Select Country":
                    element = driver.findElement(By.xpath("//select[@id='country']"));
                    new Select(element).selectByVisibleText(value);
                    break;
                case "Year":
                    element = driver.findElement(By.id("yearbox"));
                    new Select(element).selectByVisibleText(value);
                    break;
                case "Month":
                    Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
                    monthDropdown.selectByValue(value);
                    break;
                case "Day":
                    Select dayDropdown = new Select(driver.findElement(By.id("daybox")));
                    dayDropdown.selectByVisibleText(value);
                    break;
                case "Password":
                    WebElement passwordField = driver.findElement(By.id("firstpassword"));
                    passwordField.sendKeys(value);
                    break;
                case "ConfirmPassword":
                    WebElement confirmPasswordField = driver.findElement(By.id("secondpassword"));
                    confirmPasswordField.sendKeys(value);
                    break;
            }
            if (element != null) {
                element.sendKeys(value);
            }
        }
        return driver;
    }
}
