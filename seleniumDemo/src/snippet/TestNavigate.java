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
		//刷新页面
		driver.navigate().refresh();
		//后退
		driver.navigate().back();
		System.out.println("UrR"+driver.getCurrentUrl());
		//	前进
		driver.navigate().forward();
		System.out.println("UrR"+driver.getCurrentUrl());

	

	}

}
