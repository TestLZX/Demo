package snippet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testMB {

	/**
	 * @param args
	 */
	//����
	WebDriver dd=new FirefoxDriver();
	@Before
	public void setUp() throws Exception{
		dd.get("http://www.baid8u.com");
	
	}
	@Test
	public void  testMB() throws Exception{
		dd.manage().window().maximize();
	}
	@After
	public void tearDown() throws Exception{
		dd.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}