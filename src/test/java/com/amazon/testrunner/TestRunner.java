package com.amazon.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.amazon.am_helper.FileReaderManager;
import com.baseclass.BaseClass;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\amazon\\feature", glue = "com.amazon.stepdefinition", tags = "@loginData", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\reource\\library\\cucumber-reports\\report.html",
		"pretty", "html:src\\test\\reource\\library", "json:src\\test\\reource\\library\\cucumber.json",
		"junit:src\\test\\reource\\library\\cucumber.xml"},

		strict = true, monochrome = true, dryRun = false)
public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		String browserName = FileReaderManager.getInstance().getConfigReader().getBrowserName();
		driver = BaseClass.browerLaunch(browserName);
	}

	@AfterClass
	public static void tearDown() {
		Reporter.loadXMLConfig(
				new File(System.getProperty("user.dir") + "\\src\\test\\reource\\Resources\\extent-config.xml"));
		driver.quit();
	}
}
