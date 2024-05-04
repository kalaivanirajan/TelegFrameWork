package MockTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MockObjectRepository.Login;
import MockObjectRepository.ShoppingList;
import genericLibary.BaseClass;

public class TestCase10 extends BaseClass{
	@Test()
	public void TestCase009() {
		
		ShoppingList myOrder=new ShoppingList(driver);
		myOrder.getMyOrderOption().click();
		driver.quit();
}
}