package selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Guru {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Driver for browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle))
			System.out.println("Test Passed!!");
		else 
			System.out.println("Test Failed!!");
		
		driver.close();
	}
	
}
