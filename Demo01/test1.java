package Demo;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;

public class test1 {
	public static void main(String[] args) {
		System.out.println("Start selelium");
		WebDriver driver = new FirefoxDriver();
		// ���������ַ"http://www.baidu.com/"

		
		try {
			driver.get("https://www.bai2du.com/");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// �����ͣ
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.linkText("����"))).perform();
		// ��λ������������������
		WebElement txtbox = driver.findElement(By.id("kw"));
		txtbox.sendKeys("selenium java");
		WebElement btn = driver.findElement(By.id("su"));
		btn.click();
		driver.close();
		System.out.println("end selenium");
	}
}