package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class testXpan {
	WebDriver driver;
  @Test
  public void testGoogole() {
	  driver.get("https://www.google.com.hk/?gws_rd=ssl");
	  
	  WebElement sea=driver.findElement(By.xpath("//*[@id=\"ist-ib\"]"));
	  sea.sendKeys("test");
	  sea.click();
	  
  }
  @BeforeClass
  public void serUP() {
	  driver=new FirefoxDriver();
	  
  }

  @AfterClass
  public void tearDown() {
	  driver.close();
	  driver.quit();
  }

}
