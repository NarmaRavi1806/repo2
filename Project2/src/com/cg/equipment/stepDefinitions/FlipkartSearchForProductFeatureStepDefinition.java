package com.cg.equipment.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartSearchForProductFeatureStepDefinition {

	private WebDriver driver;

	@Before
	public void setUpStepEvent() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	}

	@Given("^user is on the main page of Flipkart\\.com$")
	public void user_is_on_the_main_page_of_Flipkart_com() throws Throwable {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMI7crO3-WC3QIVUrbACh1-Ogx2EAAYASAAEgIOH_D_BwE&semcmpid=sem_8024046704_brand_eta_goog&s_kwcid=AL!739!3!284726417975!e!!g!!flipkart&ef_id=W1WfewAAAJDX_RCq:20180823085627:s");
		

	}

	@When("^user searches for a product$")
	public void user_searches_for_a_product() throws Throwable {

		WebElement searchElement=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input"));
		searchElement.sendKeys("Dslr");
		WebElement buttonElement = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button"));
		buttonElement.submit();
	}

	@Then("^the page should be updated with that particular product details$")
	public void the_page_should_be_updated_with_that_particular_product_details() throws Throwable {

		String actualTitle=driver.getTitle();
		String expectedTitle="Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More";
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
	}
//Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More
	


}
