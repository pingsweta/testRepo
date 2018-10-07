package com.trimble.ModifyPost;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\ModifyPost.feature"},
		
		glue = {"com\\trimble\\ModifyPost"},
				plugin={"pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report6222.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
				}
		
		)


public class RunModifyPostData {	
	
}
