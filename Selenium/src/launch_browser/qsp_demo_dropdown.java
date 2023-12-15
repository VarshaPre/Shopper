package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qsp_demo_dropdown
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//option[text()='Female']")).click();
		driver.findElement(By.xpath("//option[@id='countryOpt6']")).click();
		driver.findElement(By.xpath("//option[@id='StateOpt16']")).click();
	}

}
