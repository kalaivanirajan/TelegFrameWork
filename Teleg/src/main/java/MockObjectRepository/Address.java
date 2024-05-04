package MockObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {

	public Address(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(linkText = "Addresses")
private WebElement addressOption;
@FindBy(xpath="//input[@value='Add new']")
private WebElement addAddressOption;
@FindBy(id="Address_FirstName")
private WebElement firstNameOption;
@FindBy(id="Address_LastName")
private WebElement lastAddressOption;
@FindBy(id="Address_Email")
private WebElement emailOption;
@FindBy(id="Address_Company")
private WebElement companyOption;
@FindBy(id="Address_CountryId")
private WebElement countryDropdown;
@FindBy(id="Address_City")
private WebElement cityOption;
@FindBy(id="Address_Address1")
private WebElement address1Option;
@FindBy(id="Address_Address2")
private WebElement address2Option;
@FindBy(id="Address_ZipPostalCode")
private WebElement zipCodeOption;
@FindBy(id="Address_PhoneNumber")
private WebElement addPhoneNumber;
@FindBy(xpath="//input[@value='Save']")
private WebElement saveOption;
@FindBy(xpath="//input[@value='Delete']")
private WebElement delectAddressOption;
public WebElement getAddressOption() {
	return addressOption;
}
public WebElement getAddAddressOption() {
	return addAddressOption;
}
public WebElement getFirstNameOption() {
	return firstNameOption;
}
public WebElement getLastAddressOption() {
	return lastAddressOption;
}

public WebElement getEmailOption() {
	return emailOption;
}

public WebElement getCompanyOption() {
	return companyOption;
}
public WebElement getCountryDropdown() {
	return countryDropdown;
}
public WebElement getCityOption() {
	return cityOption;
}
public WebElement getAddress1Option() {
	return address1Option;
}
public WebElement getAddress2Option() {
	return address2Option;
}
public WebElement getZipCodeOption() {
	return zipCodeOption;
}
public WebElement getAddPhoneNumber() {
	return addPhoneNumber;
}
public WebElement getSaveOption() {
	return saveOption;
}
public WebElement getDelectAddressOption() {
	return delectAddressOption;
}

}
