package com.crm.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(css="#handle_CRMBLOG")
	WebElement CRMnews;
	@FindBy(xpath="//a[@title='Contacts']")
	WebElement Contacts;
	@FindBy(xpath="//a[@title='Deals']")
	WebElement Deals;
	@FindBy(xpath="//a[@title='Call']")
	WebElement Call;
	@FindBy(css="a[title='New Contact']")
	WebElement newContact;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void homePageVerification() {
		Assert.assertEquals(CRMnews.getText(), "CRMPRO News");
	}
	public ContractsPage clickOnContacts() {
		Contacts.click();
		return new ContractsPage();
	}
	public DealsPage clickOnDeals() {
		 Deals.click();
		 return new DealsPage();
	}
	public CallPage clickOnCall() {
		Call.click();
		return new CallPage();
	}
	public ContractsPage mouseOverToContacts() {
		Actions a=new Actions(driver);
		a.moveToElement(Contacts).build().perform();
		newContact.click();
		return new ContractsPage();
		
	}
}
