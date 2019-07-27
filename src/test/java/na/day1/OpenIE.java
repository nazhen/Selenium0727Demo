package na.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OpenIE {
// 下载地址   http://selenium-release.storage.googleapis.com/index.html
    @Test
    public void openIE(){
        System.setProperty("webdriver.ie.driver","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\IEDriverServer.exe");
        WebDriver webDriver = new InternetExplorerDriver();
    }
}
