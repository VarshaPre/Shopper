package TESTNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActiRunner extends ActiTime
{
    	 @Test
  	   public void validLogin()
  	   {
  		   driver.findElement(By.name("username")).sendKeys("admin");
  		   driver.findElement(By.name("password")).sendKeys("varsha");
  		   driver.findElement(By.xpath("//span[.='Sign up']")).click();
  		   String title=driver.getTitle();
  		   System.out.println(title);
  		   Assert.assertEquals(title, "Instagram");
  		   System.out.println("1");
  	   }
     
}
