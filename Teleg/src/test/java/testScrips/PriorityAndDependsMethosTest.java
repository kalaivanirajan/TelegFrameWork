package testScrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityAndDependsMethosTest {
@Test(groups = "Regression")
//preority staring accept the value from low number
public void Register() {
	WebDriver driver=new ChromeDriver();
	System.out.println("register");
}
@Test(dependsOnMethods ="Register",groups = "smoke" )
//dependans we are using for preoriyty basci 
public void Login() {
	WebDriver driver=new ChromeDriver();
	System.out.println("login");
}
@Test(dependsOnMethods = "Login")
public void AddToCard() {
	WebDriver driver=new ChromeDriver();
	System.out.println("Add to card");
}
@Test(dependsOnMethods = "AddToCard",groups = "inter")
public void Payment() {
	WebDriver driver=new ChromeDriver();
	System.out.println("payment");
}
@Test(dependsOnMethods = "Payment")
public void ConformPayment() {
	WebDriver driver=new ChromeDriver();
	System.out.println("Conform payment");
}
}