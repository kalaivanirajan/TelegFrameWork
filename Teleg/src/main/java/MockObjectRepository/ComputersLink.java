package MockObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersLink {

	public ComputersLink(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Computers")
	private WebElement computerLinkText;
	@FindBy(xpath="//a[@title='Show products in category Desktops']")
	private WebElement desktopOptions;
	@FindBy(xpath="//img[@alt='Picture for category Notebooks']")
	private WebElement noteBooksOptions;
	@FindBy(linkText = "Accessories")
	private WebElement accessroriesOptions;
	@FindBy(xpath="//div[@data-productid='72']")
	private WebElement buildYourOwnCheap;
	@FindBy(xpath="//input[@id='add-to-cart-button-72']")
	private WebElement addToCardComputer;
	
	public WebElement getComputerLinkText() {
		return computerLinkText;
	}
	public WebElement getDesktopOptions() {
		return desktopOptions;
	}
	public WebElement getNoteBooksOptions() {
		return noteBooksOptions;
	}
	public WebElement getAccessroriesOptions() {
		return accessroriesOptions;
	}
	public WebElement getBuildYourOwnCheap() {
		return buildYourOwnCheap;
	}
	public WebElement getAddToCardComputer() {
		return addToCardComputer;
	}
	

}
