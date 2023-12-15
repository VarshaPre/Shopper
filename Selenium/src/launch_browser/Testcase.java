package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase 
{

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	  driver.manage().window().maximize();
	  WebElement ele1=driver.findElement(By.xpath("//textarea[@type='search']"));
	  ele1.sendKeys("qspiders courses");
	  ele1.sendKeys(Keys.ENTER);
	  
	  
	}

}
