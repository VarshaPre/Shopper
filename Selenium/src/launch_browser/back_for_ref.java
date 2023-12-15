package launch_browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class back_for_ref
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		Dimension d=new Dimension(200, 300);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p= new Point(200, 300);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		

	}

}
