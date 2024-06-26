package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
  @FindBy(linkText = "Books")
  private WebElement bookslink;
public WebElement getBookslink() {
	return bookslink;
}
  
}
