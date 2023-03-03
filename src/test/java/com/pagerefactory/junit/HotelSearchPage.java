package com.pagerefactory.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.junit.BaseClass;

public class HotelSearchPage extends BaseClass {
	public HotelSearchPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//select[@id='location']")
	public WebElement selectLocation;
	@FindBy(xpath="//select[@id='hotels']")
	public WebElement selectHotel;
	@FindBy(xpath="//select[@id='room_type']")
	public WebElement selectRoomType;
	@FindBy(xpath="//select[@id='room_nos']")
	public WebElement selectNoOfRoom;
	@FindBy(xpath="//input[@id='datepick_in']")
	public WebElement checkInDate;
	@FindBy(xpath="//input[@id='datepick_out']")
	public WebElement checkOutDate;
	@FindBy(xpath="//select[@id='adult_room']")
	public WebElement NoOfAdult;
	@FindBy(xpath="//select[@id='child_room']")
	public WebElement NoOfChild;
	@FindBy(xpath="//input[@id='Submit']")
	public WebElement searchBtn;
}
