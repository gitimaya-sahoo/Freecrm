package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath="//*[text()='Log In']")
	WebElement Loginbtn;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement submit;
	
	public void Launchpage() {
		Loginbtn.click();
				
	}
	
	public void Loginpage(String user,String pwd) {
		
		username.sendKeys(user);
		password.sendKeys(pwd);
		submit.click();
		
	}
}
