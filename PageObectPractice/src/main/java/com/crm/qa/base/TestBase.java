package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestTimes;

public class TestBase {
	public static WebDriver driver;
	public static Properties pop;
	
	public TestBase() {
		try {
			pop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\x243469\\eclipse-workspace\\PageObectPractice\\src\\main\\java\\com\\crm\\qa\\environment\\config.properties");
			pop.load(fis);
					
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public static void initialize() {
		System.setProperty("webdriver.chrome.driver", "C://Users//x243469//Downloads//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestTimes.PAGE_LOADS_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestTimes.PAGE_IMPLICIT_TIME, TimeUnit.SECONDS);
		driver.get(pop.getProperty("url"));
	}

}
