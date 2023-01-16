package Runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Objects.Login;
import Objects.SetBrowser;

public class RunApp {
	
	WebDriver driver;
	
	@Test
	public void runcrm() throws InterruptedException, IOException {
		
		driver = SetBrowser.Browserinit(driver, "Chrome");
		System.out.println(driver.getTitle());
		Thread.sleep(15000);
		Login login = PageFactory.initElements(driver, Login.class);
		
		login.Launchpage();
		Thread.sleep(5000);
		login.Loginpage("gmisk.1307@gmail.com", "Freecrm23#");
	}
}
