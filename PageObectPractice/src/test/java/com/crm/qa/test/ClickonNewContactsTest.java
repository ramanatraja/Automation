package com.crm.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pageobjects.ContractsPage;
import com.crm.qa.pageobjects.HomePage;
import com.crm.qa.pageobjects.LoginPage;
import com.crm.qa.testdata.GetTestData;
import com.crm.qa.util.SwitchToFrames;

public class ClickonNewContactsTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ContractsPage contactpage;
	@BeforeMethod
	public void intializeBrowser() {
		initialize();
		loginpage=new LoginPage();
		homepage=loginpage.loginPage();
		SwitchToFrames.switchToFrame(1);
		contactpage=homepage.mouseOverToContacts();
	}
	@Test(dataProvider="getTestData")
	public void verifyCreateContacts(String title,String Fname,String Lname) {
		contactpage.createNewContact(title, Fname, Lname);
		
	}

	@DataProvider
	public Object[][] getTestData() throws IOException {
		return GetTestData.getTestData();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
