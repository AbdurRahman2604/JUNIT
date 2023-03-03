package com.pageexecution.junit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({HotelLoginPageExecution.class,HotelSearchPageExecution.class,HotelSelectPageExecution.class,HotelBookingPageExecution.class})

public class HotelRunnerClass {
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("before class method");
	}
	@AfterClass
	public static void afterClassMethod() {
		System.out.println("after class method");
	}
}
