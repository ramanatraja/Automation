package com.crm.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pageobjects.DealsPage;
import com.crm.qa.pageobjects.HomePage;
import com.crm.qa.pageobjects.LoginPage;

public class DealsPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	DealsPage dealspage;
	
	@BeforeMethod
	public void setUp() {
		initialize();
		loginpage=new LoginPage();
		homepage=loginpage.loginPage();
		homepage.clickOnDeals();
	}
	@Test
	public void validateDeatilsPage() {
		dealspage.verifyDetailsPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
