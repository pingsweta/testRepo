package com.trimble.TestTags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//dryRun=true,
		tags={"@Important"}, //All scenario executed if this is tag for feature file
		 //tags={"@Smoke"}, //only tag with @smoke
		//tags={"@Smoke","@Regression"}, //AND condition
		 //tags={"@Smoke,@Regression"} , // OR condiction
		monochrome=true,
		dryRun=true,
		features= {"src/test/resources/com/trimble/FeatureFiles/TestTagsFeatureFile.feature"},
		glue={"com\\trimble\\TestTags"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report6.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}
	)


public class RunTagsTesting {

}
