package com.crm.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase {
	@FindBy(xpath="//td[contains(text(),'Keyword'")
	WebElement KeywordText;
	
	public DealsPage() {
		PageFactory.initElements(driver, this);
	}
	public void verifyDetailsPage() {
		Assert.assertEquals(KeywordText.getText(), "Keyword", "keyword message found");
		
	}
}
