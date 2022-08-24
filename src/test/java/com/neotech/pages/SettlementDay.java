package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;
import com.neotech.utils.CommonMethods;

public class SettlementDay extends CommonMethods  {
	@FindBy(xpath = "/html/body")
	public WebElement bodyText;
	
	public SettlementDay() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
