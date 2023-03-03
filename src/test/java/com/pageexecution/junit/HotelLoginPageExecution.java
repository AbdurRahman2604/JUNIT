package com.pageexecution.junit;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.baseclass.junit.BaseClass;
import com.pagerefactory.junit.HotelLoginPage;

public class HotelLoginPageExecution {
	@Before
	public  void browserLaunch() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.urlLaunch(BaseClass.getExcel(1, 0));
	}
	@Test
	public  void withValidDetails() throws IOException, AWTException {
		HotelLoginPage lp=new HotelLoginPage();
		lp.userName.sendKeys(BaseClass.getExcel(2, 1));
		lp.passWord.sendKeys(BaseClass.getExcel(2, 2));
		BaseClass.takeScreenshotFull("loginPage1.png");
		lp.loginBtn.click();

	}
	@After
	public void browserClose() {
		BaseClass.browserClose();
	}

}
