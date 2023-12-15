package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/varsh/OneDrive/Desktop/v3.html");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("google")).click();
	

	}

}
