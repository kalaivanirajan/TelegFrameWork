package genericLibary;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityMethods {
public static void getWebPageScreenshot(WebDriver driver) {
	//step1
	TakesScreenshot ts=(TakesScreenshot) driver;
	//step2
 File temp=ts.getScreenshotAs(OutputType.FILE);
 //step 3
File permanent=new File("/.Screenshot/"+getTime()+".png");
//step4
try {
	FileHandler.copy(temp,permanent);
}catch (IOException e) {
	// TODO: handle exception
	e.printStackTrace();
}
}
public static void getWebElementScreenshot(WebElement element)
{
	//step1
	File temp=element.getScreenshotAs(OutputType.FILE);
	//step2
	File permanent= new File("./Screenshot/"+getTime()+".png");
	//step3
	FileHandler.copy(temp,permanent);
	
}
}
