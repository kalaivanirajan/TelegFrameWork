package MockDemoWen;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectForDemoMock.BookLink;
import ObjectForDemoMock.LoginForDemo;

public class BookLinkPage {
@Test
public void TestCase_004() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	LoginForDemo login=new LoginForDemo(driver);
	login.getLoginButton().click();
	login.getMailIdLogin().sendKeys("kalairajan0802@gmail.com");
	login.getPasswordLogin().sendKeys("kalai123");
	login.getLoginButtonEnt().click();
	BookLink book=new BookLink(driver);
	String actualTitle=book.getBookLinkOption().getText();
	String expectedTitle="BOOKS" ;
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("pass");
		System.out.println(actualTitle);
		System.out.println(expectedTitle);
	}
	else
	{
		System.out.println("fail");
	}
	driver.quit();
}

}
