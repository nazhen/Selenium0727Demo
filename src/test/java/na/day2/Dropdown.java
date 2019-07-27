package na.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdown {
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

    @Test
    // 下拉框处理  通过索引\value\文本 三种方法定位
    // 判断下拉框  select 标签开头的才是下拉框
    public void DropdownCase() throws InterruptedException {
        driver.get("file:D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        WebElement select1 = driver.findElement(By.xpath("//*[@id=\"moreSelect\"]"));
        // 实例化select这个类
        Select select = new Select(select1);
        // 通过索引选择下拉框
        select.selectByIndex(2);
        Thread.sleep(2999);
        // 通过value的值选择下拉框
        select.selectByValue("huawei");
        Thread.sleep(3999);
        // 通过文本值选择下拉框
        select.selectByVisibleText("iphone");
        Thread.sleep(3999);
        // 获取所有下拉框内容.没讲清楚
//        List<WebElement> l1 = select.getAllSelectedOptions();
//        System.out.println(l1);
    }


}
