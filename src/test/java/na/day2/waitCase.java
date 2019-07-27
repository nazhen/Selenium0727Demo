package na.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class waitCase {
    WebDriver driver;
    @BeforeMethod
    public void startChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
//        // 隐式等待
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void closedChrome(){
        driver.quit();
    }

    @Test
    // 全局等待
    public void waitCase(){
        driver.get("D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[13]/td[2]/div[1]/input")).click();
        // 实例化显示等待
        WebDriverWait wait = new WebDriverWait(driver,10);
        // 指定等待的元素
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/table/tbody/tr[13]/td[2]/div[2]/div")));
        String text = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[13]/td[2]/div[2]/div")).getText();
        Assert.assertEquals(text,"wait for display");


    }
}
