package testScrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InovocationThreadPoolSize {
	//invovation how many time the script will be executed
	//threadpoolsize is use to how many browser at the same time execute
@Test(invocationCount = 5,threadPoolSize = 3,enabled  =false,groups = "FT" )
public void Register() {
	WebDriver driver = new ChromeDriver();
	System.out.println("register");
	driver.quit();
}
}
