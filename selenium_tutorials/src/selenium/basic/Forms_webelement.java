package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forms_webelement {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver for browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String baseUrl = "http://demo.guru99.com/test/login.html";
		driver.get(baseUrl);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abcd@gmail.com");
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("abcdefghijkl");
		System.out.println("Text fields set");
		//driver.findElement(By.id("SubmitLogin")).click();
		password.submit();
		//System.out.println("Login done by clicking on Submit button");
		
		
	
	}

}
