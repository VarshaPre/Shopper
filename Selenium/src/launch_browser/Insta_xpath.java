package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta_xpath 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("varsha_kachatti");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("varsha");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	

	}

}
