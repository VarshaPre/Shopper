package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchurl 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	//  not saved url in any other variable and used equals()
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Hello world"))
		{
			System.out.println("title is equal");
		}
		else 
		{
			System.out.println("title is not equal");
		}
	// saved url in string and used == operator	
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String url1="https://www.youtube.com/";
		if(url==url1) 
		{
			System.out.println("url is equal");
		}
		else 
		{
			System.out.println("url is not equal");
		}
		
	}

}
