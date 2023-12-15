package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Key_axn 
{
	public static void main(String[] args) 
	{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
}
