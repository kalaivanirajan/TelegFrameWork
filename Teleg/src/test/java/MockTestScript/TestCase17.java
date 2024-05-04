package MockTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MockObjectRepository.Login;
import MockObjectRepository.WishList;

public class TestCase17 {
	@Test
	public void TestCase17() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Login loginPage=new Login(driver);
		loginPage.getLoginButton().click();
		loginPage.getMailIdLogin().sendKeys("kalairajan0802@gmail.com");
		loginPage.getPasswordLogin().sendKeys("kalai123");
		loginPage.getLoginButtonEnt().click();
		WishList wishList=new WishList(driver);
		wishList.getWishListLink().click();
}
}