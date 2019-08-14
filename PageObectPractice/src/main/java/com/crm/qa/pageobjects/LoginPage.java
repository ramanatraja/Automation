package com.crm.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath ="//img[@class='img-responsive']")
	WebElement image;
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	public boolean impageCheck() {
		return image.isDisplayed();
	}
	public HomePage loginPage() {
		username.sendKeys(pop.getProperty("username"));
		password.sendKeys(pop.getProperty("password"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		submit.click();
		return new HomePage();
	}
	
}
