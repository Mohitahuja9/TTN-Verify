import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testing {
    WebDriver driver = new ChromeDriver();
    @BeforeClass
    void driver(){
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }
    @Test (priority = 1)
    void home(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }
    @Test (priority = 2)
    void searchForItem() {
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

        search.sendKeys("samsung s24");
        search.submit();
        String expectedTitle = "Amazon.in : samsung s24";
        String actualTitle = driver.getTitle();
        WebElement product = driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]"));
        product.click();
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Page title found");
    }
    @Test (priority = 3)
    public void addToCartTest() throws InterruptedException {
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.equals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300);");
        driver.findElement(By.xpath("(//input[@id=\"add-to-cart-button\"])[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[text()=\"Added to Cart\"])[2]")));
        Assert.assertEquals(element.getText(), "Added to Cart");
    }
    @AfterClass
    void End() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}