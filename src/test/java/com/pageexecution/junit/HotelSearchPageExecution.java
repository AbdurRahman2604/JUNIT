package com.pageexecution.junit;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.baseclass.junit.BaseClass;
import com.pagerefactory.junit.HotelSearchPage;

public class HotelSearchPageExecution {
	@Before
	public void browserLaunch() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.urlLaunch(BaseClass.getExcel(1, 0));

	}
	@Test
	public void withValidDetails() throws IOException, AWTException {
		HotelLoginPageExecution lp=new HotelLoginPageExecution();
		lp.withValidDetails();
		HotelSearchPage sp=new HotelSearchPage();
		sp.selectLocation.sendKeys(BaseClass.getExcel(1, 3));
		sp.selectHotel.sendKeys(BaseClass.getExcel(1, 4));
		sp.selectRoomType.sendKeys(BaseClass.getExcel(1, 5));
		sp.selectNoOfRoom.sendKeys(BaseClass.getExcel(1, 6));
		sp.checkInDate.clear();
		sp.checkInDate.sendKeys(BaseClass.getExcel(1, 7));
		sp.checkOutDate.clear();
		sp.checkOutDate.sendKeys(BaseClass.getExcel(1, 8));
		sp.NoOfAdult.sendKeys(BaseClass.getExcel(1, 9));
		sp.NoOfChild.sendKeys(BaseClass.getExcel(1, 10));
		BaseClass.takeScreenshotFull("searchPage1.png");
		sp.searchBtn.click();
	}
	@After
	public void afterMethod() {
		BaseClass.browserClose();
	}

}
