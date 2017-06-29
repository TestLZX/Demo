package snippet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testwait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
	
//		//打开百度
//		driver.get("http://www.baidu.com");
//		WebElement seaBox=driver.findElement(By.name("wd"));
//		seaBox.sendKeys("selenium");
//		seaBox.submit();
		
		//打开google
		driver.get("https://www.google.com.hk/?gws_rd=ssl");
		WebElement seaBox=driver.findElement(By.name("q"));
		seaBox.sendKeys("selenium");
		seaBox.submit();
		//等待new WebDriverWait(driver,10).until(
		(new WebDriverWait(driver,10)).
				until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return d.getTitle().toLowerCase().startsWith("selenium");
			}
		});
		System.out.println("页面"+driver.getTitle());
		
		
//		//implicit wait
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			System.out.println("-----");
//			
//			driver.findElement(By.id("su")).click();
//			System.out.println("++++++++");
//			driver.quit();
			
	}
}
