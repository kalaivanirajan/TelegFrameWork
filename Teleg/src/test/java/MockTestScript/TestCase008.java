package MockTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MockObjectRepository.BookSoryBy;
import MockObjectRepository.Login;
import genericLibary.BaseClass;

public class TestCase008 extends BaseClass {
	@Test
	public void TestCase008()
	 {
		
		BookSoryBy bookLink=new BookSoryBy(driver);
		bookLink.getBookLinkOption().click();
		bookLink.getComputerAndInternetBookOption().click();
		bookLink.getAddToCardOption().click();
		
}
}