package TESTNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Case2 extends Case1
{
	@Test
	   public void validLogin()
	   {
		   driver.findElement(By.name("username")).sendKeys("admin");
	   }
	@Test
	public void validPsw()
	{
		driver.findElement(By.name("password")).sendKeys("varsha");
	}
}

