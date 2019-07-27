package na.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframeCase {

    WebDriver webDriver;
    @BeforeMethod
    public void aft(){
        System.setProperty("webdriver.chrome.driver","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\chromedriver.exe");
        webDriver  = new ChromeDriver();
    }

    @Test
    // 进入到 iframe 的处理
    public void frmaeCase1() throws InterruptedException {
        webDriver.get("file:D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
//        // 切换进入到frame标签中
//        webDriver.switchTo().frame("aa");
        // 通过 id 或者 name 切换如iframe
        WebElement iframe = webDriver.findElement(By.tagName("iframe"));
        webDriver.switchTo().frame(iframe);
        webDriver.findElement(By.linkText("baidu")).click();

        Thread.sleep(3333);

    }

    @Test
    // 回到iframe标签外面,操作外面的元素
    public void backCase() throws InterruptedException {
        webDriver.get("file:D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        WebElement iframe = webDriver.findElement(By.tagName("iframe"));
        webDriver.switchTo().frame(iframe);
        webDriver.findElement(By.linkText("baidu")).click();
        Thread.sleep(3333);
        // 切换到默认的 iframe切换到外面了  defaultContent 默认内容
        webDriver.switchTo().defaultContent();
        webDriver.findElement(By.linkText("登陆界面")).click();
        Thread.sleep(3333);

    }

    @Test
    // iframe 多层嵌套
    public void moreIframe(){
        webDriver.get("file:D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        // 定位到第一个iframe
        WebElement iframe = webDriver.findElement(By.tagName("iframe"));
        // 定位到第二个iframe
        WebElement iframe2= webDriver.findElement(By.id("xxx"));
        // 焦点移动到第一个iframe
        webDriver.switchTo().frame(iframe);
        // 焦点移动到第二个iframe
        webDriver.switchTo().frame(iframe2);
        // 返回到第一个iframe
        webDriver.switchTo().defaultContent();
        //

    }

    @AfterMethod
    public void closeDcase() throws InterruptedException {
        Thread.sleep(3333);
        webDriver.quit();

    }


}
