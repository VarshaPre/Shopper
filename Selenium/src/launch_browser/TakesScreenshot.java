package launch_browser;

import java.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//step1
		TakesScreenshot ts=(TakesScreenshot) driver;
		//step2
		File  src = ts.getScreenshotAs(OutputType.FILE);
		//step3
		File dst=new File("C:\\Users\\varsh\\OneDrive\\Desktop\\Selenium\\act.jpeg");
		//step4
		FileHandler.copy(src, dst);
		Thread.sleep(2000);
	}
}
