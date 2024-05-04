package MockObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelPage {

	public ApparelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='page-title']/h1")
	private WebElement pageTitle;
	
	public WebElement getPageTitle() {
		return pageTitle;
	}
	
	

}
