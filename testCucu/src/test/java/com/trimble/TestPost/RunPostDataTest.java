package com.trimble.TestPost;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\PostFeatureFile.feature"},
		
		glue = {"com\\trimble\\TestPost"}
		
		)

public class RunPostDataTest {

}
