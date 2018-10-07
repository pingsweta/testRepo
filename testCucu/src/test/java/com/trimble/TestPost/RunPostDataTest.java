package com.trimble.TestPost;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\PostFeatureFile.feature"},
		
		glue = {"com\\trimble\\TestPost"},
				plugin={"pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report643349.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
				}
		
		)

public class RunPostDataTest {

}
