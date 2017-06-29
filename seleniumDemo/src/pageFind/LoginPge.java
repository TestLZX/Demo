package pageFind;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPge {
	WebDriver driver;
	@FindBy(how=How.ID,id="sbdk")
	WebElement username;
	
	@FindBy(how=How.ID,id="LZX317995")
	WebElement password;
	@FindBy(how=How.ID,id="btLogin")
	WebElement loginbutton;
	
	public LoginPge(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void login(String ss,String passWord){
		
		username.sendKeys("username");//sendKeys
		password.sendKeys("password");
	}
	
}
