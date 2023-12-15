package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Thread.sleep(2000);
        WebElement src=driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement dst=driver.findElement(By.xpath("//div[@id='box103']"));
        Actions act=new Actions(driver);// Actions takes the application address which we have already stored in driver ref_var
        act.dragAndDrop(src, dst).perform();
	}

}
