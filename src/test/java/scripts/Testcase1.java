package scripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass{

	@Test
	public void tc1() throws InterruptedException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsButton();
	s.skillraryDemoapp();
	
	
	SkillraryDemoApp sd=new SkillraryDemoApp(driver);
	driverutilies.switchingTabs(driver);
	driverutilies.mouseHover(driver,sd.getCoursebtn());
	sd.seleniumtrainingtab();
	
	AddtocartPage ad=new AddtocartPage(driver);
	driverutilies.doubleClick(driver,ad.getAddbtn());
	ad.addtocartbtn();
	driverutilies.alertPopup(driver);

	
	
	
	}
	

}
