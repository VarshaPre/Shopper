package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class key_board_axn 
{

	public static void main(String[] args) 
	{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/varsh/OneDrive/Desktop/swap.html");
		WebElement ele= driver.findElement(By.xpath("//input[@value='selenium']"));
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.DELETE);


	}

}
