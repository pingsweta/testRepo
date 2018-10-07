package com.trimble.MultipleData;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\PostMultipleDataFile.feature"},
		
		glue = {"com\\trimble\\MultipleData"}
		
		)


public class RunMultipleData {

}
