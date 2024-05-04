package MockTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MockObjectRepository.BookSoryBy;
import MockObjectRepository.ComputersLink;
import MockObjectRepository.Login;

public class TestCase19 {
	@Test
	public void TestCase19() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Login loginPage=new Login(driver);
		loginPage.getLoginButton().click();
		loginPage.getMailIdLogin().sendKeys("kalairajan0802@gmail.com");
		loginPage.getPasswordLogin().sendKeys("kalai123");
		loginPage.getLoginButtonEnt().click();
		BookSoryBy book=new BookSoryBy(driver);
		book.getBookLinkOption().click();
		book.getComputerAndInternetBookOption().click();
		book.getEmailAFriendOption().click();
}
}