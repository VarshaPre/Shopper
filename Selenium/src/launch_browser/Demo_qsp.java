package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_qsp 
{

	public static void main(String[] args) throws InterruptedException
 {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hi@gmail.com");
	driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Hello");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	// driver.findElement(By.cssSelector("a[type='button']")).click();// login button
	// driver.findElement(By.cssSelector("svg[stroke='currentColor']")).click();//registerpage   login button
    driver.findElement(By.cssSelector("a[href='/']")).click();//textbox
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[href='/button']")).click();//button
    driver.findElement(By.cssSelector("button[id='btn'")).click();
    driver.findElement(By.cssSelector("button[id='btn3']")).click();
    driver.findElement(By.cssSelector("button[id='btn6']")).click();
    Thread.sleep(2000);
    //driver.findElement(By.cssSelector("a[href='/link']")).click();//link
   // driver.findElement(By.cssSelector("a[href='/link/contact']")).click();
   // driver.findElement(By.cssSelector("a[href='/link/payment']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[href='/radio']")).click();//radiobutton
    driver.findElement(By.cssSelector("input[value='wallet']")).click();
    driver.findElement(By.cssSelector("input[value='office']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[href='/checkbox']")).click();//checkbox
    driver.findElement(By.cssSelector("input[id='domain1']")).click();
    driver.findElement(By.cssSelector("input[id='mode3']")).click();
    driver.findElement(By.cssSelector("input[id='mode5']")).click();
    driver.close();
     
 }

}
