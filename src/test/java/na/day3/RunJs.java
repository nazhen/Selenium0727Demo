package na.day3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunJs {
	WebDriver driver;

	@BeforeMethod
	public void startChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dibtx\\workspace\\eclipseSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void closedChrome() {
		driver.quit();
	}

	@Test
	// 在webdriver中执行js
	public void runJsCase() throws InterruptedException {
		driver.get("http://www.baidu.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById(\"kw\").setAttribute(\"value\",\"webdriver\")");
		Thread.sleep(4555);

	}
}
