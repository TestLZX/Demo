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
		//�򿪵�ַ
		driver.get("http://www.baidu.com");
		//��λIDԪ��
		WebElement sea=driver.findElement(By.id("kw"));
		sea.sendKeys("test");
//		��λ������
		WebElement seaB=driver.findElement(By.id("su"));
		seaB.click();
//		�˳�
		driver.close();
		
	}

}
