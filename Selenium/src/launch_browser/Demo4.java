package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4
{

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[name='email']")).sendKeys("selenium");
	 

	}

}
