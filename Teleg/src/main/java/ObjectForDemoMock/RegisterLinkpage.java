package ObjectForDemoMock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterLinkpage {
	public RegisterLinkpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Register")
	private WebElement registerLinkForDemo;
	@FindBy(id="gender-female")
	private WebElement genderFemaleOptipns;
	@FindBy(id="FirstName")
	private WebElement firstNameOptions;
	@FindBy(id="LastName")
	private WebElement lastNameOptions;
	
	@FindBy(id="Email")
	private WebElement emailOptions ;
	@FindBy(id="Password")
	private WebElement passwordOptions ;
	@FindBy(id="ConfirmPassword")
	private WebElement ConfoemPasswordOptions ;
	@FindBy(id="register-button")
	private WebElement registerButtonn ;
	public WebElement getRegisterLinkForDemo() {
		return registerLinkForDemo;
	}
	public WebElement getGenderFemaleOptipns() {
		return genderFemaleOptipns;
	}
	public WebElement getFirstNameOptions() {
		return firstNameOptions;
	}
	public WebElement getLastNameOptions() {
		return lastNameOptions;
	}
	public WebElement getEmailOptions() {
		return emailOptions;
	}
	public WebElement getPasswordOptions() {
		return passwordOptions;
	}
	public WebElement getConfoemPasswordOptions() {
		return ConfoemPasswordOptions;
	}
	public WebElement getRegisterButtonn() {
		return registerButtonn;
	}
}

