package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Series_of_events {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver for browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/");
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUsername).click().keyDown(Keys.SHIFT).sendKeys(txtUsername, "Hello").keyUp(Keys.SHIFT).doubleClick(txtUsername).contextClick().build();
		seriesOfActions.perform();
	}
	
		
		
	}


