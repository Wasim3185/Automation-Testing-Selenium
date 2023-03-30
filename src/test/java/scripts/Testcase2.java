package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
SkillraryLoginPage s=new SkillraryLoginPage(driver);
s.gearsButton();
s.skillraryDemoapp();

SkillraryDemoApp sd=new SkillraryDemoApp(driver);
driverutilies.switchingTabs(driver);
driverutilies.dropDown(sd.getTestingdd(),pdata.getpropertyData("coursename"));

TestingPage t=new TestingPage(driver);
driverutilies.draganddrop(driver,t.getSeleniumtraining(),t.getCart());
Point loc = t.getFacebook().getLocation();
int x = loc.getX();
int y = loc.getY();
driverutilies.scrollBar(driver, x, y);
t.facebookicon();









	}

}
