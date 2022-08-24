package com.neotech.testbase;

import com.neotech.pages.SettlementDay;


public class PageInitializer extends BaseClass {

	public static SettlementDay settlement;
	

	

	public static void initialize() {
		settlement = new SettlementDay();
		
		
	}

}