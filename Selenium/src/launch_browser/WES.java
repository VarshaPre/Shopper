package launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WES 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver  driver=new FirefoxDriver();
	Thread.sleep(2000);
    driver.get("file:///C:/Users/varsh/OneDrive/Desktop/webElements.html");
    Thread.sleep(2000);
    List<WebElement> ip=driver.findElements(By.xpath("//input"));
    for(WebElement v:ip)
    {
    	v.sendKeys("varsha");
    	
    }
    for (WebElement z:ip) 
    {
    	z.clear();
    	Thread.sleep(2000);
    }
    
    
	}

}
