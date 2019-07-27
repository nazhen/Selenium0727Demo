package na.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class huohu {
    @Test
    public void sendkeyCase() throws InterruptedException {
//        System.setProperty("")
        System.setProperty("webdriver.gecko.driver","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("file:d:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
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
