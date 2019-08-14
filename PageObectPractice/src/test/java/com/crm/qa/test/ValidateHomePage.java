package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pageobjects.HomePage;
import com.crm.qa.pageobjects.LoginPage;


public class ValidateHomePage extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeTest()
		public void EnvSetup() {
		TestBase.initialize();
		loginpage=new LoginPage();
		}
	@Test()
	public void pageValidation() {
		Assert.assertEquals(loginpage.verifyPageTitle(), "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test()
	public void imageValidation() {
		Assert.assertTrue(loginpage.impageCheck());
	}
	@Test()
	public void validateHomePage() {
		homepage=loginpage.loginPage();
	}
	
	@AfterTest()
	public void teamDown() {
		driver.quit();
	}
}
