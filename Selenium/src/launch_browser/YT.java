package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YT 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kgf trailer");
	    driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("div[id='dismissible']")).click();
	    Thread.sleep(5000);
	   // driver.close();
	    
	}

}
