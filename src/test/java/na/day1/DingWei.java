package na.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DingWei {
    WebDriver webDriver;

    @BeforeMethod
    public void oepnChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\chromedriver.exe");
        // 实例化后启动浏览器
        webDriver = new ChromeDriver();
    }
    @AfterMethod
    public void closeChrome(){
        webDriver.quit();
    }
    @Test
    public void testCase1(){
        webDriver.get("https://www.baidu.com/");
        WebElement d = webDriver.findElement(By.id("kw"));
        d.sendKeys("hhhhhhh");
    }

//    @Test
//    public void testCase2(){
//        webDriver.get("http://www.baidu.com");
//        webDriver.findElement(By.className("bg s_btn_wr"));
//    }

    @Test
    // 通过a标签里的文本定位
    public void testLinkText(){
        // Link文本  a标签中的才可以用
        webDriver.get("https://www.baidu.com");
        webDriver.findElement(By.linkText("新闻"));
    }
    @Test
    // 通过a标签中的部分文本定位
    public void testpartialLintkText(){
        webDriver.get("http://www.baidu.com");
        webDriver.findElement(By.partialLinkText("学"));

    }

    @Test
    public void byTagName(){
        // tagname 标签名查找元素
        webDriver.get("http://www.baidu.com");
        List<WebElement> li = webDriver.findElements(By.tagName("input"));
        System.out.println(li.size());
        // 向第5个Input标签输入hhh
        li.get(5).sendKeys("hhh");
    }

    @Test
    public void xpathGroup(){
        webDriver.get("http://www.baidu.com");
        List<WebElement> list = webDriver.findElements(By.xpath("//*[@id=\"u1\"]/a"));
        // getText() 获取文本
        for (int i=0;i<list.size();i++){
            String tt = list.get(i).getText();
            System.out.println(tt);

        }

    }
}
