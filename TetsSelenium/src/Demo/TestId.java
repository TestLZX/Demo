package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestId {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		//打开地址
		driver.get("http://www.baidu.com");
		//定位ID元素
		WebElement sea=driver.findElement(By.id("kw"));
		sea.sendKeys("test");
//		定位搜索框
		WebElement seaB=driver.findElement(By.id("su"));
		seaB.click();
//		退出
		driver.close();
		
	}

}
