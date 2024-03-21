import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

    WebDriver driver=new ChromeDriver();

    void drive(){
        driver.get("http://www.tothenew.com/");
        driver.manage().window().maximize();
    }
    void de(){
        Actions a=new Actions(driver);
        WebElement c=driver.findElement(By.xpath("(//*[@id=\"h-Services\"])[2]"));
        a.moveToElement(c).perform();


        WebElement digitalengineering=driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul/li[1]/a)[2]"));
        digitalengineering.click();
        WebElement dEText= driver.findElement(By.xpath("//*[@id=\"single-image-banner\"]/div[2]/div/h1"));
        String text1 = dEText.getText();

    }

}
