package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class src
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.myntra.com/");
	  String src=driver.getPageSource();
	  System.out.println(src);
  }
}
