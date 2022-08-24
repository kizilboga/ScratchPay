package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class ApplicationTest extends CommonMethods {
//	Cucumber hooks should be commented out while API Testing
	
// I set the URL as /api/v1/settlementDate and test the below 4 code
	@Then("Validate businessDate")
	public void validate_business_date() {
			
//		Testing the bussines date
		wait(1);
		String expectedText = "\"businessDate\":null";
		String actualText = settlement.bodyText.getText();
		
		Assert.assertTrue("The date is not set!",actualText.contains(expectedText));

	}
	
//	Testing the holiday date
	@Then("Validate holidayDays")
	public void validate_holiday_days() {
		wait(1);
		String expectedText = "\"holidayDays\":0";
		String actualText = settlement.bodyText.getText();
		
		Assert.assertTrue("Holiday is not set!",actualText.contains(expectedText));
	}
	
//	Testing totaldays
	@Then("Validate totalDays")
	public void validate_total_days() {
		wait(1);
		String expectedText = "\"totalDays\":null";
		String actualText = settlement.bodyText.getText();

		Assert.assertTrue("Total days are empty!",actualText.contains(expectedText));
	}
	
//	Testing the weekend days
	@Then("Validate weekendDays")
	public void validate_weekend_days() {
		wait(1);
		String expectedText = "\"weekendDays\":0";
		String actualText = settlement.bodyText.getText();
		
		Assert.assertTrue("Weekdays are empty!",actualText.contains(expectedText));
	}
	// I set the URL as /api/v1/isBusinessDay and test the below code
	
//	Testing the a valid bussines date
	@Then("Validate business Dates")
	public void validate_business_dates() {
		wait(1);
		String expectedText = "A valid date is required";
		String actualText = settlement.bodyText.getText();
		
		Assert.assertTrue("A date is required!!!",actualText.contains(expectedText));
	}
}
