import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TTNVerify {
    WebDriver driver=new InternetExplorerDriver();
    @BeforeClass
    void drive(){
        driver.get("http://www.tothenew.com/");
        driver.manage().window().maximize();
    }
    @Test (priority = 1)
    void digitalEngineering(){
        Actions a=new Actions(driver);
        WebElement c=driver.findElement(By.xpath("(//*[@id=\"h-Services\"])[2]"));
        a.moveToElement(c).perform();

        WebElement ele=driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul/li[1]/a)[2]"));
        ele.click();
        WebElement text= driver.findElement(By.xpath("//*[@id=\"single-image-banner\"]/div[2]/div/h1"));
        String text1 = text.getText();
        Assert.assertEquals(text1,"Digital Engineering");
    }
    @Test (priority = 2)
    void devops(){
        Actions a=new Actions(driver);
        WebElement c=driver.findElement(By.xpath("(//*[@id=\"h-Services\"])[2]"));
        a.moveToElement(c).perform();

        WebElement ele=driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul/li[2]/a)[2]"));
        ele.click();
        WebElement text= driver.findElement(By.xpath("//*[@id=\"single-image-banner\"]/div[2]/div/h1"));
        String text1 = text.getText();
        Assert.assertEquals(text1,"Cloud & DevOps");
    }
    @Test (priority = 3)
    void ott(){
        Actions a=new Actions(driver);
        WebElement c=driver.findElement(By.xpath("(//*[@id=\"h-Services\"])[2]"));
        a.moveToElement(c).perform();

        WebElement ele=driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul/li[3]/a)[2]"));
        ele.click();
        WebElement text= driver.findElement(By.xpath("//*[@id=\"single-image-banner\"]/div[2]/div/h1"));
        String text1 = text.getText();
        Assert.assertEquals(text1,"OTT Solutions & Services");
    }
    @Test (priority = 4)
    void data(){
        Actions a=new Actions(driver);
        WebElement c=driver.findElement(By.xpath("(//*[@id=\"h-Services\"])[2]"));
        a.moveToElement(c).perform();

        WebElement ele=driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul/li[4]/a)[2]"));
        ele.click();
        WebElement text= driver.findElement(By.xpath("//*[@id=\"single-image-banner\"]/div[2]/div/h1"));
        String text1 = text.getText();
        Assert.assertEquals(text1,"Data & Analytics");
    }
    @Test (priority = 5)
    void cx(){
        Actions a=new Actions(driver);
        WebElement c=driver.findElement(By.xpath("(//*[@id=\"h-Services\"])[2]"));
        a.moveToElement(c).perform();

        WebElement ele=driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul/li[5]/a)[2]"));
        ele.click();
        WebElement text= driver.findElement(By.xpath("//*[@id=\"single-image-banner\"]/div[2]/div/h1"));
        String text1 = text.getText();
        Assert.assertEquals(text1,"CX & Content");
    }
    @Test (priority = 6)
    void digital(){
        Actions a=new Actions(driver);
        WebElement c=driver.findElement(By.xpath("(//*[@id=\"h-Services\"])[2]"));
        a.moveToElement(c).perform();

        WebElement ele=driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul/li[6]/a)[2]"));
        ele.click();
        WebElement text= driver.findElement(By.xpath("//*[@id=\"single-image-banner\"]/div[2]/div/h1"));
        String text1 = text.getText();
        Assert.assertEquals(text1,"Digital Marketing");
    }
}
