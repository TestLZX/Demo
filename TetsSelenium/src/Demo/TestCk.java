package Demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCk {

	/**
	 * @param args
	 *            测试cookies
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver we = new FirefoxDriver();
		we.get("https://passport.jd.com/new/login.aspx?ReturnUrl=https%3A%2F%2Fre.jd.com%2Findex%2Fstandard%3Fre_dcp%3D2xE%26cu%3Dtrue%26utm_source%3Dp.egou.com%26utm_medium%3Duniongoubiao%26utm_campaign%3Dt_36378_890839_%26utm_term%3Df9bc6fc140a049c2ab0ffc4680ec5688%26abt%3D3");
		// 通过linktext定位tab页
		we.findElement(By.linkText("账户登录")).click();

		we.findElement(By.name("loginname")).sendKeys("15137129673");
		we.findElement(By.name("nloginpwd")).sendKeys("LIN@jd.xiang");
		we.findElement(By.id("loginsubmit")).click();
		File cookie = new File("1.txt");

		try {
			cookie.delete();
			cookie.createNewFile();
			FileWriter fw = new FileWriter(cookie);
			BufferedWriter bfw = new BufferedWriter(fw);
			for (Cookie cookie1:we.manage().getCookies()){
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
