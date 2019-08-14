package com.crm.qa.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pageobjects.CallPage;
import com.crm.qa.pageobjects.ContractsPage;
import com.crm.qa.pageobjects.DealsPage;
import com.crm.qa.pageobjects.HomePage;
import com.crm.qa.pageobjects.LoginPage;
import com.crm.qa.util.SwitchToFrames;

public class ClickOnLinks extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	DealsPage dealspage;
	ContractsPage contractspage;
	CallPage callpage;
	
	@BeforeTest()
	public void EnvSetup() {
	TestBase.initialize();
	loginpage=new LoginPage();
	homepage=loginpage.loginPage();
	
	}
	@Test(priority=1)
	public void validateHomePage() {
		SwitchToFrames.switchToFrame(1);
		homepage.homePageVerification();
	}
	
	@Test(priority=2)
	public void clickOnDealsLink() {
		
	dealspage=	homepage.clickOnDeals();
	}
	@Test(priority=3)
	public void clickOnCallLink() {
		
		callpage= homepage.clickOnCall();
	}
	@Test(priority=4)
	public void clickOnContactsLink() {
		
		contractspage=	homepage.clickOnContacts();
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
