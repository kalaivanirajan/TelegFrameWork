package MockTestScript;

import org.testng.annotations.Test;

import MockObjectRepository.WelcomePage;
import genericLibary.BaseClass;

public class ApparelPage extends BaseClass{
@Test
public void Apprel_001() {
  WelcomePage welcome= new WelcomePage(driver);
  welcome.getApparelLink().click();
  
}
}
