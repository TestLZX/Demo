package snippet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNavigate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
			//
		driver.get("http://www.baidu.com");
		System.out.println("UrR"+driver.getCurrentUrl());
		driver.navigate().to("http://www.zhihu.com");
		System.out.println("UrR"+driver.getCurrentUrl());
		//ˢ��ҳ��
		driver.navigate().refresh();
		//����
		driver.navigate().back();
		System.out.println("UrR"+driver.getCurrentUrl());
		//	ǰ��
		driver.navigate().forward();
		System.out.println("UrR"+driver.getCurrentUrl());

	

	}

}