package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			// you can specify which feature you want to run, we can also run all features
			features = "src/test/resources/features/",
			
			// shows where we can find the implementation regarding the steps in feature files above	
			glue = "com.neotech.steps",

			
			// if true, it does not really run the steps. it just check if every step in feature files is defined in code
			dryRun = false,
			
//			we run the tags from feature files 
			tags = "@apiTest",
			
			monochrome = true,
			plugin = {
					"pretty", //prints gherkin steps in console
					"html:target/cucumber-default-report", //create a basic html report in target folder
					"json:target/cucumber.json",
					"rerun:target/failed.txt" // this will store the path of feature file and line number in that feature file where the 
					//scenario that failed is located
					
			}

		)

public class TestRunner {

}
