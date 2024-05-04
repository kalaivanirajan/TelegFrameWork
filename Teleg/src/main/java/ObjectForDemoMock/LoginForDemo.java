package ObjectForDemoMock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginForDemo {
	
public LoginForDemo(WebDriver driver) {
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

}
