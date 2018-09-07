package com.cg.naukri.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.naukri.beans.LoginPageFeature;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageFeatureStepDefinition {
	
	private WebDriver driver;
	private LoginPageFeature loginPage;
	
	@Given("^user in on the login page$")
	public void user_in_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("D:\\152859_narmatha\\Html\\Html Assignments\\loginPage.html");
		loginPage=new LoginPageFeature();
		PageFactory.initElements(driver, loginPage);
		
	}

	@When("^user type invalid username and password$")
	public void user_type_invalid_username_and_password() throws Throwable {
		loginPage.setUsername("hema");
		loginPage.setPassword("hema123");
		loginPage.clickSubmitBtn();
	}

	@Then("^'Invalid username and password' message sholud be displayed$")
	public void invalid_username_and_password_message_sholud_be_displayed() throws Throwable {
	    String expectedMsg="Invalid username and password";
	    String actualMsg=driver.switchTo().alert().getText();
	    Assert.assertEquals(expectedMsg, actualMsg);
	}

	@When("^user type valid username and password$")
	public void user_type_valid_username_and_password() throws Throwable {
		/*WebElement nameElement=driver.findElement(By.id("username"));
	    nameElement.sendKeys("Narmatha");
	    WebElement passwordElement=driver.findElement(By.id("password"));
	    passwordElement.sendKeys("narma123");
	    WebElement submitElement=driver.findElement(By.id("submit"));
	    submitElement.submit();*/
		loginPage.setUsername("Narmatha");
		loginPage.setPassword("narma123");
		loginPage.clickSubmitBtn();
		
	}

	@Then("^useraccount page should be displayed$")
	public void useraccount_page_should_be_displayed() throws Throwable {
		String actualTitle=driver.getTitle();
		String expectedTitle="Login Page";
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
	}


}
