package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","html:Reports","junit:Reports/cucumber.xml","json:Reports/cucumber.json"},
		features="src\\test\\java\\com\\cucumber\\feature",
		glue = "com.cucumber.stepdefinition",
		tags= {"@E2E","~@Ignore"},
		dryRun=false, strict=false, monochrome=true
		)


public class TestRunner {

}
