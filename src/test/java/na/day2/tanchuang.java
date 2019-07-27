package na.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tanchuang {
    WebDriver driver;

    @BeforeMethod
    public void befor(){
        System.setProperty("webdriver.chrome.driver", "D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void aftercase() throws InterruptedException {
        Thread.sleep(3333);
        driver.quit();
    }

    @Test
    // 操作弹窗和获取弹窗文本
    public void alertCase() throws InterruptedException {
        driver.get("D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        driver.findElement(By.className("alert")).click();
        Thread.sleep(3333);
        // 切换到弹窗界面
        Alert a = driver.switchTo().alert();
        Thread.sleep(3333);
        //获取弹框的文本
        String text = a.getText();
        // accept()是确定的意思.
        a.accept();
        Assert.assertEquals(text,"请点击确定");
    }

    @Test
    public void Confirm() throws InterruptedException {

        driver.get("D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        driver.findElement(By.className("confirm")).click();
        Thread.sleep(3333);
        Alert a = driver.switchTo().alert();
        // dismiss() 否的意思
        a.dismiss();
        Thread.sleep(3333);
        a.accept();
    }

    @Test
    public void sendkeyCase() throws InterruptedException {
        System.setProperty("webdriver.firfox.driver","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        driver.findElement(By.className("prompt")).click();
        Thread.sleep(3333);
        Alert a = driver.switchTo().alert();
        // 定位到需要输入文本的弹窗
        a.sendKeys("Prompt");
        Thread.sleep(3333);
        a.accept();
        Thread.sleep(3333);
        a.accept();
        driver.quit();
    }
}































































