package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivPopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='30'])[2]")).click();
	}

}
