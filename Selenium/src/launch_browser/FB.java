package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Hiii");
		driver.findElement(By.name("pass")).sendKeys("Hello");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title= driver.getTitle();
		System.out.println(title);
		driver.close();
		

	}

}
