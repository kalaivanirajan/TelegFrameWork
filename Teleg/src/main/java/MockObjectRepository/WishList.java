package MockObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {

	public WishList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//span[.='Wishlist']")
private WebElement wishListLink;
public WebElement getWishListLink() {
	return wishListLink;
}

}
