package com.cg.project.stepDefinitions;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchFeatureSetpDefinition {

	private WebDriver driver;

	@Given("^user is on Google homepage$")
	public void user_is_on_Google_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@When("^user searches for 'Agile methodology'$")
	public void user_searches_for_Agile_methodology() throws Throwable {
		WebElement searchElement=driver.findElement(By.id("lst-ib"));
		searchElement.sendKeys("Agile methodology");
		searchElement.submit();
	}

	@Then("^all page links should be displayed for 'Agile methodology'$")
	public void all_page_links_should_be_displayed_for_Agile_methodology() throws Throwable {
		String actualTitle=driver.getTitle();
		String expectedTitle="Agile methodology - Google Search";
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
	}

	/*driver.Close();*/
}
