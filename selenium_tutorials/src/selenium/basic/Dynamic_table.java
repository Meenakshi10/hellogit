package selenium.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_table {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver for browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> col = driver.findElements(By.xpath("//div[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No. of columns are " + col.size());
		//*[@id="leftcontainer"]/table/thead/tr/th[1]
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id = \"leftcontainer\"]/table/tbody/tr"));
		System.out.println("No. of rows are " + rows.size());
		
	}

}
