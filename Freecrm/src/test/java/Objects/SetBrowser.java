package Objects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowser {

	//WebDriver driver;
	@SuppressWarnings("deprecation")
	public static WebDriver Browserinit(WebDriver driver, String browsername) throws IOException {
		
		if(browsername=="Chrome") {
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else {
			
			System.out.println("No Driver Found");
		}
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		Configure cg=new Configure();
		String lnk=cg.Propertyset();
		driver.get(lnk);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}
	
	
}
