package com.pageexecution.junit;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.baseclass.junit.BaseClass;
import com.pagerefactory.junit.HotelSelectPage;

public class HotelSelectPageExecution {
	@Before
	public void beforeMethod() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.urlLaunch(BaseClass.getExcel(4, 0));
	}
	@Test
	public void withValidDetails() throws IOException, AWTException {
		HotelSearchPageExecution hspe=new HotelSearchPageExecution();
		hspe.withValidDetails();
		HotelSelectPage hsp1=new HotelSelectPage();
		hsp1.selectHotel.click();
		BaseClass.takeScreenshotFull("selectPage1.png");
		hsp1.continueBtn.click();
	}
	@After
	public void afterMethod() {
		BaseClass.browserClose();
	}
}
