package na.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowSelectDemo {
    WebDriver driver;
    @BeforeMethod
    public void startChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void closedChrome(){
        driver.quit();
    }
    // 在原窗口点击按钮,出现新窗户后,操作新窗口
    @Test
    public void WinCase() throws InterruptedException {
        driver.get("D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        driver.findElement(By.linkText("Open new window")).click();
        Thread.sleep(3203);
        // 获取当前窗口的句柄
        String handle1 = driver.getWindowHandle();
//        Set<String> handle2 = driver.getWindowHandles();
        // 通过for和if判断窗口句柄等于当前,不等于则切换到新的
        for (String handles:driver.getWindowHandles()){
            if (handles.equals(handle1)){
                continue;
            }else {
                driver.switchTo().window(handles);
            }
        }
        //driver.switchTo().window()
        driver.findElement(By.linkText("baidu")).click();
        Thread.sleep(2213);

    }

}
