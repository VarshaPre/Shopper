package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DemoDragAndDrop
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
//		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	//	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
        WebElement src1=driver.findElement(By.xpath("//div[.='Mobile Charger']"));
        //WebElement src2=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
        WebElement dst1=driver.findElement(By.xpath("//div[.='Mobile Accessories'])"));
//        WebElement src3=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
//        WebElement src4=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
//        WebElement dst2=driver.findElement(By.xpath("(//div[text()='Laptop Accessories'])[1]"));
        Actions act=new Actions(driver);
        act.dragAndDrop(src1, dst1).perform();
//        act.dragAndDrop(src2, dst1).perform();
//        act.dragAndDrop(src3, dst2).perform();
//        act.dragAndDrop(src4, dst2).perform();
	}

}
