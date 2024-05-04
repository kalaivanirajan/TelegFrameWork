package MockTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import MockObjectRepository.Address;
import MockObjectRepository.Login;

public class TestCase26 {
	@Test
	public void TestCase26()  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Login loginPage=new Login(driver);
		loginPage.getLoginButton().click();
		loginPage.getMailIdLogin().sendKeys("kalairajan0802@gmail.com");
		loginPage.getPasswordLogin().sendKeys("kalai123");
		loginPage.getLoginButtonEnt().click();
		Address address=new Address(driver);
		address.getAddressOption().click();
		address.getAddAddressOption().click();
		address.getFirstNameOption().sendKeys("kalai");
		address.getLastAddressOption().sendKeys("vani");
		address.getEmailOption().sendKeys("kalairajan0802@gmail.com");
		address.getCompanyOption().sendKeys("ayx");
		WebElement country=address.getCountryDropdown();
		Select select = new Select(country);
		select.selectByVisibleText("India");
		address.getCityOption().sendKeys("chennai");
		address.getAddress1Option().sendKeys("193");
		address.getAddress2Option().sendKeys("panner nagaer");
		address.getZipCodeOption().sendKeys("600037");
		address.getAddPhoneNumber().sendKeys("9876543212");
		address.getSaveOption().click();
		
		
}
}