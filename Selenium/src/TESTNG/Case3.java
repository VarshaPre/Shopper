package TESTNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Case3 extends Case1
{
	@Test
	   public void validLogin()
	   {
		   driver.findElement(By.xpath("//span[.='Sign up']")).click();
	   }
}
