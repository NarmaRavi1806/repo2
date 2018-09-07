package com.cg.project.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearchFeatureStepDefinition {
	
	private WebDriver driver;
	
	@Given("^user is on the main page of Amazon website$")
	public void user_is_on_the_main_page_of_Amazon_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@When("^user search for Redmi Note(\\d+) mobile in search tab$")
	public void user_search_for_Redmi_Note_mobile_in_search_tab(int arg1) throws Throwable {
		driver.get("https://www.amazon.com/");
		WebElement usernameElement=driver.findElement(By.id("twotabsearchtextbox"));
		usernameElement.sendKeys("Redmi Note5");
		usernameElement.submit();
	}

	@Then("^the page should be updated with various models of Redmi Note(\\d+) mobile$")
	public void the_page_should_be_updated_with_various_models_of_Redmi_Note_mobile(int arg1) throws Throwable {
		String actualTitle=driver.getTitle();
		String expectedTitle="Amazon.com: Redmi Note5 - Unlocked Cell Phones / Cell Phones: Cell Phones & Accessories";
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
	}


}
