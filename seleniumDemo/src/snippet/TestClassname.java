package snippet;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClassname {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver tcn=new FirefoxDriver();
		tcn.get("http://www.taobao.com");
		
		//��λclassname
		WebElement seacn=tcn.findElement(By.className("search-combobox-input"));
		seacn.sendKeys("test");
		seacn.click();
		tcn.close();
	}

}
