package na.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

@Test
public class actionsDemo {
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

    
    // 右键的操作
    public void rightClickCase() throws InterruptedException{
        driver.get("http://www.baidu.com");
        WebElement buttenBaidu = driver.findElement(By.id("su"));
        // 实例化Actions对象
        Actions actions = new Actions(driver);
        // contextClick(buttenBaidu) 指定要右键的位置  调用这个方法 必须加perform()
        actions.contextClick(buttenBaidu).perform();
        Thread.sleep(3333);

    }
    
    public void doubleClickCase(){
    	driver.get("http://www.baidu.com");
        WebElement click = driver.findElement(By.id("su"));
        Actions actions = new Actions(driver);
        actions.doubleClick(click);
    }
    
    
    // 鼠标移动到某个元素上
    public void monveMouse() throws InterruptedException{
        driver.get("D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        WebElement element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[12]/td[2]/div/input"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
//        Thread.sleep(3333);
//        String element2=driver.findElement(By.xpath(".//*[text()='Hello World!']")).getText();
//        Assert.assertEquals(element2, "Hello World!");
    }
    
    
    // 元素拖动到某个坐标
    public void moveToCase() throws InterruptedException{
        driver.get("file:C:\\Users\\Dibtx\\workspace\\eclipseSelenium\\selenium_html\\dragAndDrop.html");
        WebElement element = driver.findElement(By.id("drag"));
        Actions actions = new Actions(driver);
        Thread.sleep(3333);
        actions.dragAndDropBy(element, 400,499).perform();
        Thread.sleep(3333);
    }
    
    
    // 讲某个元素拖动到另一个元素中
    public void moveToSomeWare() throws InterruptedException{
        driver.get("file:C:\\Users\\Dibtx\\workspace\\eclipseSelenium\\selenium_html\\dragAndDrop.html");
        WebElement element = driver.findElement(By.id("drag"));
        Actions actions = new Actions(driver);
        WebElement element2 = driver.findElement(By.xpath("/html/body/h1"));
        // 按住element元素移动到element2 然后放开element 
        actions.clickAndHold(element)
        		.moveToElement(element2)
        		.release(element)
        		.perform();
        Thread.sleep(3333);
        
    }
    
    @Test
    // 下拉框的多选
    public void moreSelectCase() throws InterruptedException{
        driver.get("D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        WebElement element = driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
        List<WebElement> list = driver.findElements(By.xpath("/html/body/div/table/tbody/tr[14]/td[2]/select/option"));
        // 实例化Actions
        Actions actions = new Actions(driver);
        // 按住Shift
        actions.keyDown(Keys.SHIFT)
                // 点击第一个选项
                .click(list.get(0))
                // 点击第三个选项
                .click(list.get(2))
                // 放开shift
                .keyUp(Keys.SHIFT)
                // 执行操作
                .perform();;
        Thread.sleep(5555);
    }

    @Test
    // robot类 操作键盘
    public void savenHtml() throws AWTException, InterruptedException {
        driver.get("http://www.baidu.com");
        // 实例化一个robot类
        Robot robot = new Robot();
        // 按住ctrl键
        robot.keyPress(KeyEvent.VK_CONTROL);
        // 按住s键
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(3333);
        robot.keyPress(KeyEvent.VK_ENTER);
        // 释放键盘
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    @Test
    // 上传功能
    public void uploadCase() throws InterruptedException {
        driver.get("D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        driver.findElement(By.id("load")).sendKeys("C:/Users/Dibtx/Desktop/download.jpg");
        ;
        Thread.sleep(3333);
    }





}

















