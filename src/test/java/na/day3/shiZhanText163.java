package na.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class shiZhanText163 {
    WebDriver driver;
    @BeforeMethod
    public void startChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://mail.163.com/");
    }
//    @AfterMethod
//    public void colseChrome(){
//        driver.quit();
//    }

    @Test
    public void reGisCase() throws InterruptedException, AWTException {
        driver.findElement(By.id("lbNormal")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        String id = iframe.getAttribute("id");
        if(id != null) {
            driver.switchTo().frame(id);
        }
        Thread.sleep(2020);
        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("nazhenss");
        Thread.sleep(3135);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("rayallen123");
        Thread.sleep(3321);
        WebElement submit = driver.findElement(By.id("dologin"));
        submit.click();
        driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/ul/li[2]")).click();
        Thread.sleep(2020);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/section/header/div[1]/div[1]/div/div[2]/div/input")).sendKeys("1073564044@qq.com");
        Thread.sleep(1050);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/section/header/div[2]/div[1]/div/div/input")).sendKeys("中软是傻逼");
        Thread.sleep(2141);
        WebElement frame1 = driver.findElement(By.className("APP-editor-iframe"));
        driver.switchTo().frame(frame1);
        Thread.sleep(2311);
        driver.findElement(By.xpath("html/body")).sendKeys("真的是傻逼呀");
        Thread.sleep(1113);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath(".//*[@id='dvContainer']/div/header/div/div/div/span")).click();
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
//        Thread.sleep(324);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);















//        driver.findElement(By.linkText("注册新帐号")).click();
//        Thread.sleep(2313);
//        String handle1 = driver.getWindowHandle();
//        for (String handles : driver.getWindowHandles()){
//            if (handles.equals(handle1)){
//                continue;
//            }else {
//                driver.switchTo().window(handles);
//            }
//        }
//        driver.findElement(By.id("nameIpt")).sendKeys("nadada1");
//        Thread.sleep(4233);
//        driver.findElement(By.id("mainPwdIpt")).sendKeys("nazhen123123");
//        Thread.sleep(3344);
//        driver.findElement(By.id("mainCfmPwdIpt")).sendKeys("nazhen123123");
//        Thread.sleep(4213);
//        driver.findElement(By.id("mainMobileIpt")).sendKeys("13901234567");
//        Thread.sleep(3467);
//        driver.findElement(By.id("vcodeIpt")).sendKeys("Ad32g");
//        Thread.sleep(7742);
//        driver.findElement(By.id("mainAcceptIpt")).click();
//        Thread.sleep(3578);
//        driver.findElement(By.id("mainRegA")).click();
    }
}
