package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCss {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver t =new FirefoxDriver();
			t.get("https://www.google.com.hk/?gws_rd=ssl");
			
			WebElement sa=t.findElement(By.cssSelector("#st-lb"));
			sa.sendKeys("test");
			sa.click();
			t.close();
	}

}
