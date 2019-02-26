package selenium.basic;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver for browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/V4/");
		takesnapshot(driver,"C://Test//test.png");
	}
	
	public static void takesnapshot(WebDriver driver, String fileWithPath) throws Exception
	{
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(fileWithPath);
		FileUtils.copyFile(srcFile, destFile);
		
		
	}

}
