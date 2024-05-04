package MockObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookSoryBy {

	public BookSoryBy(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Books")
	private WebElement bookLinkOption;
@FindBy(linkText = "Computing and Internet")
private WebElement computerAndInternetBookOption;
@FindBy(xpath="//input[@value='Add to cart']")
private WebElement addToCardOption;
@FindBy(id="products-orderby")
private WebElement sortByOption;

@FindBy(id="products-pagesize")
private WebElement Display;
@FindBy(id="products-viewmode")
private WebElement viewAs;
@FindBy(xpath="//option[.='Price: High to Low']")
private WebElement highToLowOptions;
@FindBy(xpath="//option[.='4']")
private WebElement fourOptionDisplay;
@FindBy(xpath="//option[.='List']")
private WebElement listViewAsOption;
@FindBy(xpath="//strong[.='Filter by price']")
private WebElement filterByPriceOption;
@FindBy(xpath="//input[@value='Email a friend']")
private WebElement emailAFriendOption;
@FindBy(xpath="//input[@value='Add to compare list']")
private WebElement addToCompareList;
@FindBy(xpath="//input[@id='FriendEmail']")
private WebElement friendEmailOption;
@FindBy(xpath="//input[@id='YourEmailAddress']")
private WebElement ourMailIdOption;
@FindBy(xpath="//input[@value='Send email']")
private WebElement sendEmailOption;
public WebElement getSortByOption() {
	return sortByOption;
}
public WebElement getDisplay() {
	return Display;
}
public WebElement getViewAs() {
	return viewAs;
}
public WebElement getHighToLowOptions() {
	return highToLowOptions;
}
public WebElement getFourOptionDisplay() {
	return fourOptionDisplay;
}
public WebElement getListViewAsOption() {
	return listViewAsOption;
}
public WebElement getFilterByPriceOption() {
	return filterByPriceOption;
}
public WebElement getBookLinkOption() {
	return bookLinkOption;
}
public WebElement getComputerAndInternetBookOption() {
	return computerAndInternetBookOption;
}
public WebElement getAddToCardOption() {
	return addToCardOption;
}
public WebElement getEmailAFriendOption() {
	return emailAFriendOption;
}
public WebElement getAddToCompareList() {
	return addToCompareList;
}
public WebElement getFriendEmailOption() {
	return friendEmailOption;
}
public WebElement getOurMailIdOption() {
	return ourMailIdOption;
}
public WebElement getSendEmailOption() {
	return sendEmailOption;
}

}




