package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.douban.com");
//		通过那么为q 定位
		WebElement seaName=driver.findElement(By.name("q"));
//		搜索name
		seaName.sendKeys("name");
		seaName.click();
		driver.close();
	}

}
