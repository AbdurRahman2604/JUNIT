package com.pagerefactory.junit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.junit.BaseClass;


public class HotelBookingPage extends BaseClass{
	public HotelBookingPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	public WebElement firstName;
	@FindBy(xpath="//input[@id='last_name']")
	public WebElement lastName;
	@FindBy(xpath="//textarea[@id='address']")
	public WebElement billingAddress;
	@FindBy(xpath="//input[@id='cc_num']")
	public WebElement creditCardNo;
	@FindBy(xpath="//select[@id='cc_type']")
	public WebElement creditCardType;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	public WebElement creditCardExpiryMonth;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	public WebElement creditCardExpiryYear;
	@FindBy(xpath="//input[@id='cc_cvv']")
	public WebElement creditCardCvvNo;
	@FindBy(xpath="//input[@id='book_now']")
	public WebElement bookNowBtn;
	

}
