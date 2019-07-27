package na.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenFirefox {
    // 48版本之前 火狐可以直接这么启动 48之后就要装driver
    @Test
    public void openFF(){
        // 实例化浏览器,启动
        // 默认安装就可以直接启动了
        WebDriver webDriver = new FirefoxDriver();

    }

    @Test
    public void oepnff2(){
        // 非默认安装时,通过下列代码找到火狐浏览器
        System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        //然后在实例化火狐浏览器
        WebDriver webDriver = new FirefoxDriver();
    }
}
