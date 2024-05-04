package MockDemoWen;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectForDemoMock.RegisterLinkpage;

public class RegisterLinkLogin {
	@Test
	
	public void TestCase_01() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		RegisterLinkpage register = new RegisterLinkpage(driver);
		register.getRegisterLinkForDemo().click();
		register.getGenderFemaleOptipns().click();
		register.getFirstNameOptions().sendKeys("kalai");
		register.getLastNameOptions().sendKeys("vani");
		register.getEmailOptions().sendKeys("kalairajan0802@gmail.com");
		register.getPasswordOptions().sendKeys("kalai123");
		register.getConfoemPasswordOptions().sendKeys("kalai123");
		register.getRegisterButtonn().click();
}
	
}
	