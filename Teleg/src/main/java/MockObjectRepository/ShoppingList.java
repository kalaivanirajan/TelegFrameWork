package MockObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingList {

	public ShoppingList(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//span[.='Shopping cart']")
private WebElement shoppingListOption;
@FindBy(linkText = "Orders")
private WebElement myOrderOption;
@FindBy(xpath="//tr[@class='cart-item-row']//input[@value='4203897']")
private WebElement removeOption;
@FindBy(xpath="updatecart")
private WebElement updateClickOption;
@FindBy(xpath="//input[@name='termsofservice']")
private WebElement agreeBoxOption;
@FindBy(id="checkout")
private WebElement checkOutOption;
public WebElement getShoppingListOption() {
	return shoppingListOption;
}
public WebElement getMyOrderOption() {
	return myOrderOption;
}
public WebElement getRemoveOption() {
	return removeOption;
}
public WebElement getUpdateClickOption() {
	return updateClickOption;
}
public WebElement getAgreeBoxOption() {
	return agreeBoxOption;
}
public WebElement getCheckOutOption() {
	return checkOutOption;
}

}
