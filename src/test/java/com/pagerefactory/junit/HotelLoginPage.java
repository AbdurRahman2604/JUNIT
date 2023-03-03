package com.pagerefactory.junit;
import java.awt.AWTException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.junit.BaseClass;

public class HotelLoginPage extends BaseClass {
	public HotelLoginPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@id='username']")
	public WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	public WebElement passWord;
	@FindBy(xpath="//input[@id='login']")
	public WebElement loginBtn;

}
