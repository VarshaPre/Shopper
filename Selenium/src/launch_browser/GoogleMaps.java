package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMaps 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver", "./software/gecko.driver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/maps");
	driver.findElement(By.xpath("//div[@id='searchbox']")).click();
	driver.findElement(By.xpath(""));

	}

}
