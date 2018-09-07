package com.cg.product.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue= {"com.cg.naukri.stepDefinitions"},tags= {"@Tag"})
public class TestRunner {

}
