package snippet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage1 {
	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement loginButton;

	public loginPage1(WebDriver Driver) {
		this.driver = driver;

		username = driver.findElement(By.id("tbUserName"));
		password = driver.findElement(By.id("tbPassWord"));
		loginButton = driver.findElement(By.id("tbLogin"));
	}

	public void login(String userName, String passWord) {
		username.sendKeys("username");//sendKeys
		password.sendKeys("password");
		loginButton.sendKeys();
		loginButton.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}
}
