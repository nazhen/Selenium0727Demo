package na.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomjsTest {
    @Test
    public void phantomjsCase() throws InterruptedException {
        // 设置phantomejs的路径
        System.setProperty("phantomjs.binary.path","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\phantomjs.exe");
        // 实例化 就和new chromedriver()一样
        WebDriver driver = new PhantomJSDriver();

        driver.get("http://www.baidu.com");
        driver.findElement(By.id("kw")).sendKeys("phantome");
        Thread.sleep(4444);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();

    }
}
