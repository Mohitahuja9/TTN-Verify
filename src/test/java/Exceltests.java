import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Base.Baselib;
import org.testng.annotations.Test;

import java.io.IOException;

public class Exceltests {
    WebDriver driver ;
    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("Report.html");
    @BeforeClass
    void start() throws IOException {
        this.driver = Baselib.Excel();
    }
    @Test
    void firstname(){
        ExtentTest test=extent.createTest("Name label Test");
        WebElement firstname=driver.findElement(By.xpath("//label[text()='Full Name* ']"));
        Assert.assertEquals(firstname.getText(),"Full Name*");
        test.log(Status.PASS,"Passed");
        test.pass("Test 1 Passed");
    }
    @Test
    void email(){
        ExtentTest test=extent.createTest("Email label Test");
        WebElement firstname=driver.findElement(By.xpath("//label[text()='Email address*']"));
        Assert.assertEquals(firstname.getText(),"Email address*");
        test.log(Status.PASS,"Passed");
        test.pass("Test 2 Passed");
    }
    @AfterClass
    void end() throws InterruptedException{
        extent.flush();
        driver.quit();
    }
}
