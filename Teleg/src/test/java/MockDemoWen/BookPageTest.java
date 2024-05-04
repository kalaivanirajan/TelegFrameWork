package MockDemoWen;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectForDemoMock.BookLink;
import ObjectForDemoMock.LoginForDemo;

public class BookPageTest {
@Test
public void TestCase_005() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	LoginForDemo login=new LoginForDemo(driver);
	login.getLoginButton().click();
	login.getMailIdLogin().sendKeys("kalairajan0802@gmail.com");
	login.getPasswordLogin().sendKeys("kalai123");
	login.getLoginButtonEnt().click();
	BookLink books=new BookLink(driver);
	books.getBookLinkOption().click();
	books.getSortByOption().click();
    books.getHighToLow().click();

}
}
