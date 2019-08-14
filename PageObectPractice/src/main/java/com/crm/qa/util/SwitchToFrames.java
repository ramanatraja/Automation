package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class SwitchToFrames extends TestBase{
	public static void switchToFrame(int i) {
		driver.switchTo().frame(i);
	}

}
