package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.CheckOutPage;
import pomPages.LoginPage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass{
@Test
public void tc3() throws IOException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsButton();
	s.skillraryDemoapp();
	
	SkillraryDemoApp d=new SkillraryDemoApp(driver);
	driverutilies.switchingTabs(driver);
	d.loginbtn();
	
	LoginPage lp=new LoginPage(driver);
	lp.usernametextbox(pdata.getpropertyData("username"));
	lp.passwordtextbox(pdata.getpropertyData("password"));
	lp.loginbutton();
	
	CheckOutPage c=new CheckOutPage(driver);
	c.checkoutbtn();
	driverutilies.switchFrames(driver);
	c.textboxs(pdata.getpropertyData("textvalue"));
	c.appstorebtn();
	
	
	
	
	
	
	
	
	
	
	
}
}
