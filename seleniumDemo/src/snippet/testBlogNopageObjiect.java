package snippet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 class testBlogNopageObjiect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		//��½
		driver.get("https://www.cnblogs.com/");
		driver.findElement(By.partialLinkText("��¼")).click();
	
		//�ȴ����ֵ�½ҳ��
		WebDriverWait wait=new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("input1")));
		System.out.println("11111");
		//��½�˺�4
		driver.findElement(By.id("input1")).sendKeys("sbdk");
		System.out.println("222");

		driver.findElement(By.id("input2")).sendKeys("1q2w!Q@W");
		driver.findElement(By.id("signin")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//message page
		driver.findElement(By.partialLinkText("����Ϣ")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//send message
		driver.findElement(By.linkText("׫д�¶���Ϣ")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.id("txtIncept")).sendKeys("seleniumpageobject");
		driver.findElement(By.id("txtTitle")).sendKeys("���⣺");
		driver.findElement(By.id("txtContent")).sendKeys("���ݣ� ");
		driver.findElement(By.id("btnSend")).click();
		//logoutwW
		driver.findElement(By.linkText("�˳�")).click();
		driver.quit();
		
			
	}

}
