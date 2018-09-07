package com.cg.equipment.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmailRegistrationFeatureStepDefinition {
	
	private WebDriver driver;

	@Before
	public void setUpStepEvent() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	}
	
	@Given("^user is on the Email registrtion page$")
	public void user_is_on_the_Email_registrtion_page() throws Throwable {
		driver=new ChromeDriver();
		driver.get("file://D:/Java%20Full-Stack%20Software/Module%203/BDD%20for%20Full%20Stack/Demos/Lesson%205-HTML%20Pages/WorkingWithForms.html");
		
	}

	@When("^user enters all valid details$")
	public void user_enters_all_valid_details() throws Throwable {
	    WebElement userNameElement=driver.findElement(By.xpath("//*[@id=\"txtUserName\"]"));
	    WebElement passwordElement=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
	    WebElement confirmPasswordElement=driver.findElement(By.xpath("//*[@id=\"txtConfPassword\"]"));
	    WebElement firstNameElement=driver.findElement(By.xpath("//*[@id=\"txtFirstName\"]"));
	    WebElement lastNameElement=driver.findElement(By.xpath("//*[@id=\"txtLastName\"]"));
	    WebElement genderElement=driver.findElement(By.xpath(""));
	    WebElement dobElement=driver.findElement(By.xpath(""));
	    WebElement emailElement=driver.findElement(By.xpath("//*[@id=\"txtEmail\"]"));
	    WebElement addressElement=driver.findElement(By.xpath("//*[@id=\"txtAddress\"]"));
	    WebElement cityElement=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[10]/td[2]/select/option[4]"));
	    WebElement phoneElement=driver.findElement(By.xpath("//*[@id=\"txtPhone\"]"));
	    WebElement hobbiesElement=driver.findElement(By.xpath(""));
	    WebElement submitElement=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[13]/td/input"));
	    submitElement.submit();
	    WebElement rsetElement=driver.findElement(By.xpath("<button id=\"myStyle\" type=\"reset\" name=\"reset\" value=\"Reset\">Reset</button>"));
	    rsetElement.clear();
	}

	@Then("^a new mail Id should be created$")
	public void a_new_mail_Id_should_be_created() throws Throwable {
	    
	}



}
