package com.cg.registration.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * 
 * Class name : TestRunner
 * Purpose :TestRunner class created to run the selenium automation code written in Stepdefinition class
 * Author : Narmatha
 * Date of Creation : 23-August-2018
 * 
 * Last Modification Date : 23-August-2018
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue= {"com.cg.registration.stepDefinitions"}
		)
public class TestRunner {

}
