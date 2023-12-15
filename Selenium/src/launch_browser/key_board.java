package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class key_board 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele= driver.findElement(By.name("login"));
		ele.sendKeys(Keys.ENTER);

	}

}
