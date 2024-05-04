package testScrips;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.BookTitlePage;
import ObjectRepository.WelcomePage;

public class BooksLinks {
	@Test(groups ="smoke")
public void Book_001() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WelcomePage welcomePage=new WelcomePage(driver);
	welcomePage.getBookslink().click();
	BookTitlePage bookTitlePage=new BookTitlePage(driver);
	if(bookTitlePage.getBooksPageTitle().getText().equals("Books"))
	{
		System.out.println("Testcase pass");
	}
	else {
		System.out.println("TestCase fail");
	}
	driver.quit();
}
}
