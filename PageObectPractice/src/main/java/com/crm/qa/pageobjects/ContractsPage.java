package com.crm.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.crm.qa.base.TestBase;
import com.crm.qa.testdata.GetTestData;

public class ContractsPage extends TestBase {
	
	@FindBy(name="title")
	WebElement title;
	@FindBy(css="#first_name")
	WebElement Fname;
	@FindBy(name="surname")
	WebElement Lname;
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement saveButton;
	public ContractsPage() {
		PageFactory.initElements(driver, this);
	}
	public void createNewContact(String titles,String Fnames,String Lnames) {
		Select s=new Select(title);
		s.selectByVisibleText(titles);
		Fname.sendKeys(Fnames);
		Lname.sendKeys(Lnames);
		saveButton.click();
		
	}
	

}
