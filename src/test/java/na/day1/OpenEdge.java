package na.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OpenEdge {
    @Test
    public void openEdge(){
        //18362.1.0 察看edge浏览器版本
        //https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/   下载地址
//        System.setProperty("webdrver.edge.driver","D:\\Dibtx\\IdeaProjects\\SeleniumStu1978\\drivers\\msedgedriver.exe\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();


    }
}
