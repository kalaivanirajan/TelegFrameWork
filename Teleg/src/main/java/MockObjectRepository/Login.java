package MockObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Log in")
	private WebElement loginButton;
	@FindBy(id="Email")
	private WebElement mailIdLogin;
	@FindBy(id="Password")
	private WebElement passwordLogin;
	@FindBy(className = "login-button")
	private WebElement loginButtonEnt;
	@FindBy(xpath="//input[@value='Search store']")
	private WebElement searchFiledLink;
	@FindBy(linkText = "Log out")
	private WebElement logoutOption;
	@FindBy(linkText = "My account")
	private WebElement myAcctountLink;
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getMailIdLogin() {
		return mailIdLogin;
	}
	public WebElement getPasswordLogin() {
		return passwordLogin;
	}
	public WebElement getLoginButtonEnt() {
		return loginButtonEnt;
	}
	public WebElement getSearchFiled() {
		return searchFiledLink;
	}
	public WebElement getSearchFiledLink() {
		return searchFiledLink;
	}
	public WebElement getLogoutOption() {
		return logoutOption;
	}
	public WebElement getMyAcctountLink() {
		return myAcctountLink;
	}
	
	}
