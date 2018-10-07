package com.trimble.MultipleData;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\PostMultipleDataFile.feature"},
		
		glue = {"com\\trimble\\MultipleData"},
				plugin={"pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report61.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
				}
		
		)


public class RunMultipleData {

}
