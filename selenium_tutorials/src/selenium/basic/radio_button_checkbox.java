package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button_checkbox {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver for browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		radio1.click();
		System.out.println("Radio button option 1 is selected");
		
		radio2.click();
		System.out.println("Radio buttton option 2 is selected");
		
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		//option1.click();
		
		if(option1.isSelected())
			System.out.println("Checkbox 1 is toggled on");
		else
			System.out.println("Checkbox 1 is toggled off");
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		for(int i=0; i<2;i++)
		{
		chkFBPersist.click();
		System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());
		}
		
		
		
		driver.close();
		
	}

}
