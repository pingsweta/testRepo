package com.trimble.ModifyPost;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\ModifyPost.feature"},
		
		glue = {"com\\trimble\\ModifyPost"}
		
		)


public class RunModifyPostData {	
	
}
