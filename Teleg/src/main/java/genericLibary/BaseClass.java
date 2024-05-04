package genericLibary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import MockObjectRepository.Login;

public class BaseClass {
	//we use wedriver drive in global variable because we can access all the so we use in globa variable 
	public WebDriver driver;
@BeforeSuite
public void bs()
{
	System.out.println("Before suite");
}
@BeforeTest
public void bt()
{
	System.out.println("Before test");
}
@BeforeClass
public void lanchBrowser()
{
	//we use class because of only lanch the browser
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@BeforeMethod
public void login()
{
	//in thus session we completedly login the process so we enter in our all value
	Login login=new Login(driver);
	login.getLoginButton().click();
	login.getMailIdLogin().sendKeys("kalairajan0802@gmail.com");
	login.getPasswordLogin().sendKeys("kalai123");
	login.getLoginButtonEnt().click();
}
@AfterSuite
public void as()
{
	System.out.println("After suite");
}
@AfterTest
public void at()
{
	System.out.println("After test");
}
@AfterClass
public void closebrowser()
{
	driver.quit();
}
@AfterMethod
public void am()
{
	Login logout=new Login(driver);
	logout.getLogoutOption();
	System.out.println("After method");
}

}
