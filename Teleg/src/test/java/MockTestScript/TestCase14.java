package MockTestScript;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import MockObjectRepository.ComputersLink;
import MockObjectRepository.Login;
import MockObjectRepository.ShoppingList;

public class TestCase14 {
	@Test
	public void TestCase14() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Login loginPage=new Login(driver);
		loginPage.getLoginButton().click();
		loginPage.getMailIdLogin().sendKeys("kalairajan0802@gmail.com");
		loginPage.getPasswordLogin().sendKeys("kalai123");
		loginPage.getLoginButtonEnt().click();
		ComputersLink computer = new ComputersLink(driver);
		computer.getComputerLinkText().click();
		computer.getDesktopOptions().click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,200)");
		computer.getBuildYourOwnCheap().click();
		computer.getAddToCardComputer().click();
		ShoppingList shoppingListOption=new ShoppingList(driver);
		shoppingListOption.getShoppingListOption().click();
		Thread.sleep(1000);
		shoppingListOption.getRemoveOption().click();
		shoppingListOption.getMyOrderOption().click();
		js.executeScript("window.scrollTo(0,50)");
		shoppingListOption.getAgreeBoxOption().click();
		shoppingListOption.getCheckOutOption().click();
		
		
		driver.quit();
}
}