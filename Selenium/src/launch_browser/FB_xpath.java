package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_xpath
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}