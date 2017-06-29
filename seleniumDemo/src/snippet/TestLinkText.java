package snippet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLinkText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver tlt=new FirefoxDriver();
		tlt.get("http://www.csdn.com");
		
		WebElement conlt=tlt.findElement(By.linkText("联系方式"));
		
		conlt.click();
		//tlt.close();
		
	}

}
