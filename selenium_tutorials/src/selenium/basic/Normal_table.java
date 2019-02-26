package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_table {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver for browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1000)");
		
		//String txt = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
		//System.out.println(txt);
		
		String txt = driver.findElement(By.xpath("//table[@width=\"277\"]/tbody/tr[3]/td[2]/font")).getText();
		System.out.println(txt);
		
		
	}

}
