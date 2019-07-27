package na.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionTest {
    WebDriver webDriver;

    @BeforeMethod
    public void firstCase() {
        System.setProperty("webdriver.chrome.driver", "D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @AfterMethod
    public void closedchrome() {
        webDriver.quit();
    }

    @Test
    public void actionClick() {
        webDriver.get("https://www.baidu.com");
        WebElement newslink = webDriver.findElement(By.name("tj_trnews"));
        newslink.click();
        // 获取当前url
        String url = webDriver.getCurrentUrl();
        Assert.assertEquals(url, "http://news.baidu.com/", "地址不一样啊");
    }

    @Test
    public void clickBaiDuYiXia() throws InterruptedException {
        webDriver.get("http://www.baidu.com");
        WebElement se = webDriver.findElement(By.id("kw"));
        se.sendKeys("selenium");
        WebElement su = webDriver.findElement(By.id("su"));
        su.click();
        Thread.sleep(1000);
        //获取网页的title
        String title = webDriver.getTitle();
        // 断言
        Assert.assertEquals(title, "selenium_百度搜索");
    }

    @Test
    public void cleartext() throws InterruptedException {
        webDriver.get("http://www.baidu.com");
        WebElement send = webDriver.findElement(By.id("kw"));
        send.sendKeys("哈哈哈哈");
        Thread.sleep(3000);
        // 清除文本框内容
        send.clear();
    }

//    @Test
//    public void assertSendtext() throws InterruptedException {
//        webDriver.get("http://www.baidu.com");
//        WebElement send = webDriver.findElement(By.id("kw"));
//        send.sendKeys("哈哈哈哈");
//        Thread.sleep(2222);
//        send.clear();
//        Thread.sleep(2222);
//        send.sendKeys("11111");
//        Thread.sleep(2222);
//        // getText()只能获取到标签中的值，并且是a标签的。所以这个case错了
//        String text1 =send.getText();
//        Assert.assertEquals(text1,"11111");
//    }

    @Test
    public void getTagName(){
        webDriver.get("http://www.baidu.com");
        WebElement tag = webDriver.findElement(By.id("kw"));
        // 获取标签名
        String tagn = tag.getTagName();
        Assert.assertEquals(tagn,"input");
    }

    @Test
    public void getAtest(){
        webDriver.get("http://www.baidu.com");
        // 获取某个属性的名字  比如 name value的名字是啥
        String valuenmae = webDriver.findElement(By.id("su")).getAttribute("value");
        Assert.assertEquals(valuenmae,"百度一下");
    }

    @Test
    public void isDisplayedCase(){
        // 判断某个页面元素是否展示，就是某个元素能不能看得到
        webDriver.get("http://www.baidu.com");
        Boolean dis = webDriver.findElement(By.id("su")).isDisplayed();
        // 如果展示了就为true,用例通过,断言成功
        Assert.assertTrue(dis);
    }

    @Test
    public void isSelectedCase(){
        // 判断单选或复选框是否被选中
        webDriver.get("D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        WebElement b = webDriver.findElement(By.xpath("//*[@id=\"radio\"]/input[1]"));
        b.click();
        Boolean xuan= b.isSelected();
        Assert.assertTrue(xuan);
    }

    @Test
    // 判断元素是否被激活
    public void isEnabledCase(){
        webDriver.get("D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\selenium_html\\index.html");
        Boolean boolean1 = webDriver.findElement(By.name("buttonhtml")).isEnabled();
        Assert.assertFalse(boolean1);
    }

//    @Test
//    // 截图
//    public void shotCase(){
//        webDriver.get("http://www.baidu.com");
//        File file = ((RemoteWebDriver)webDriver).getScreenshotAs(OutputType.FILE);
//        try {
//            //利用FileUtils工具类的copy()方法保存getScreenshotAs()返回的文件对象。
//            //看到网上有使用File.copyFile()方法，我这里测试的结果需要使用copy()方法
//            File.copy(scrFile, new File("d:\\screenfile.png"));
//        } catch (IOException e) {
//            // 异常处理
//            e.printStackTrace();
//    }


}
