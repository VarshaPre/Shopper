package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swap 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/varsh/OneDrive/Desktop/swap.html");
		WebElement ele1= driver.findElement(By.xpath("//input[@value='selenium']"));
		WebElement ele2= driver.findElement(By.xpath("//input[@value='api']"));
		WebElement ele3= driver.findElement(By.xpath("//input[@id='a3']"));
		
		ele1.sendKeys(Keys.CONTROL+"ax");
		ele3.sendKeys(Keys.CONTROL+"v");
		
	
		ele2.sendKeys(Keys.CONTROL+"ax");
        ele1.sendKeys(Keys.CONTROL+"v");
	    
	    ele3.sendKeys(Keys.CONTROL+"ax");
	    ele2.sendKeys(Keys.CONTROL+"v");
	}

}
