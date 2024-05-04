package MockTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MockObjectRepository.BookSoryBy;
import MockObjectRepository.Login;
import genericLibary.BaseClass;

public class TestCase007 extends BaseClass{
	@Test()
	
	public void TestCase007() {
		
		BookSoryBy bookLink=new BookSoryBy(driver);
		bookLink.getBookLinkOption().click();
		bookLink.getViewAs().click();
		bookLink.getListViewAsOption().click();
	}
}
