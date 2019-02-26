package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_events {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver for browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver
                .findElement(By
                .xpath("//a[text()='Home']/../../.."));
		
		String bgColour = td_Home.getCssValue("background-color");
		System.out.println("Before hover : " + bgColour);
		
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_Home).build();
		
		bgColour = td_Home.getCssValue("background-color");
		System.out.println("Before hover 2 : " + bgColour);
		
		mouseOverHome.perform();
		bgColour = td_Home.getCssValue("background-color");
		System.out.println("After hover : " + bgColour);
		
		//driver.close();
		
		
		
		
	}
	

}
