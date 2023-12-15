package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElesss 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/varsh/OneDrive/Desktop/all_in_one.html");
	WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
    boolean b= ele.isDisplayed();
    if(b)
    {
    	System.out.println("aythe");
    }
    Thread.sleep(2000);
    
    WebElement ele1 = driver.findElement(By.xpath("//textarea[@type='textarea']"));
    boolean b1= ele.isEnabled();
    if(b1)
    {
    	System.out.println("ide");
    }
    Thread.sleep(2000);
    
    WebElement ele3 = driver.findElement(By.xpath("//input[@type='checkbox']"));
    boolean b3= ele.isSelected();
    if(b3)
    {
    	System.out.println("aytho");
    }
    /*else 
    {
    	System.out.println("illa");
    }*/
    
    Thread.sleep(2000);
    
    
    driver.quit();
	}
}
