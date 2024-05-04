package ObjectForDemoMock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookLink {

	public BookLink(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Books")
	private WebElement bookLinkOption;
	@FindBy(id="products-orderby")
	private WebElement sortByOption;
	@FindBy(id="products-pagesize")
	private WebElement displayOption;
	@FindBy(id="products-viewmode")
	private WebElement viewAsOption;
	@FindBy(xpath="//option[.='Price: High to Low']")
	private WebElement highToLow;

	public WebElement getBookLinkOption() {
		return bookLinkOption;
	}

	public WebElement getSortByOption() {
		return sortByOption;
	}

	public WebElement getDisplayOption() {
		return displayOption;
	}

	public WebElement getViewAsOption() {
		return viewAsOption;
	}

	public WebElement getHighToLow() {
		return highToLow;
	}

	
	
}
