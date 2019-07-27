package na.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenChrome {
    // 写在testcase外面,就是公用的 不用每次都写
    WebDriver webDriver;

    // Method 每个@Test执行之前都会执行的方法
    @BeforeMethod
    public void open(){
        System.setProperty("webdriver.chrome.driver","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\chromedriver.exe");
        // 实例化后启动浏览器
        webDriver = new ChromeDriver();
    }

    @Test
    public void openChrome() throws InterruptedException {
        // 指定chromedriver路径
        Thread.sleep(1000);
        webDriver.get("http://www.baidu.com");
        Thread.sleep(1000);
        webDriver.findElement(By.id("kw")).sendKeys("selenium");
        Thread.sleep(1333);
        webDriver.findElement(By.id("su")).click();
        Thread.sleep(1999);
        // 浏览器后退
        webDriver.navigate().back();
        // 模拟浏览器前进
        webDriver.navigate().forward();
        //close方法 在任务管理器中 不会关闭chromedriver的进程,quit可以
//        webDriver.close();
        webDriver.quit();

    }

    @Test
    public void testCase1()throws InterruptedException{

        webDriver.get("http://www.baidu.com");
        Thread.sleep(3333);
        // 刷新浏览器
        webDriver.navigate().refresh();
        Thread.sleep(2222);
        webDriver.quit();
    }

    @Test
    public void testCase2() throws InterruptedException {

        webDriver.get("http://www.baidu.com");
        // 制定浏览器大小
        // 实例化一个新的类 Dimension
        Dimension dimension = new Dimension(499,499);
        webDriver.manage().window().setSize(dimension);
        Thread.sleep(2222);
        // 最大化浏览器
        webDriver.manage().window().maximize();
        Thread.sleep(2222);
        webDriver.quit();
    }

    @Test
    public void testCase3() throws InterruptedException {

        webDriver.get("https://www.baidu.com");
        // 获取url地址
        String url = webDriver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url,"https://www.baidu.com/");
        Thread.sleep(2222);
        webDriver.quit();
    }
    //
    @AfterMethod
    public void clossedBrowser(){
        webDriver.quit();
    }
}
