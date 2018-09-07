package com.cg.equipment.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue= {"com.cg.equipment.stepDefinitions"},tags= {"@Execute1"})
public class TestRunner {

}
