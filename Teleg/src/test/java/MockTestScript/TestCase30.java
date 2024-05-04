package MockTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import MockObjectRepository.Login;

public class TestCase30 {
	@Test
	public void TestCase30() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Login loginPage=new Login(driver);
		loginPage.getLoginButton().click();
		loginPage.getMailIdLogin().sendKeys("kalairajan0802@gmail.com");
		loginPage.getPasswordLogin().sendKeys("kalai123");
		loginPage.getLoginButtonEnt().click();
		String actual= loginPage.getMyAcctountLink().getText();
		String expected="My Account";
		//hardAssert
		//Assert.assertEquals(actual, "My Account");
		//softAssert
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(actual, "My Account");
		driver.quit();
		//we can get the which line we get the error
		soft.assertAll();
}
	}