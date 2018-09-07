package com.cg.registration.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.registration.beans.EducationalDetailsPage;
import com.cg.registration.beans.PersonalDetailsPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * Class name : RegistrationFeatureStepDefinition
 * Purpose :StepDefinition class created to check the selenium automation code
 * Attributes : driver, personalDetails, educationalDetails 
 * Author : Narmatha
 * Date of Creation : 23-August-2018
 * 
 * Last Modification Date : 23-August-2018
 *
 */
public class RegistrationFeatureStepDefinition {

	private WebDriver driver;
	private PersonalDetailsPage personalDetails;
	private EducationalDetailsPage educationalDetails;

	@Before
	public void setUpStepEvent() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");//connection of WebDriver
	}

	@Given("^user opens the web page 'PersonalDetails\\.html' in the browser$")
	public void user_opens_the_web_page_PersonalDetails_html_in_the_browser() throws Throwable {
		driver = new ChromeDriver();
		driver.get("D:\\WebPages_Set 3\\PersonalDetails.html");
		personalDetails=PageFactory.initElements(driver, PersonalDetailsPage.class);
		educationalDetails=PageFactory.initElements(driver,EducationalDetailsPage.class);
	}

	@Then("^the page should be displayed with title 'Personal Details'$")
	public void the_page_should_be_displayed_with_title_Personal_Details() throws Throwable {
		String expectedTitle="Personal Details";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user clicks next without entering First Name$")
	public void user_clicks_next_without_entering_First_Name() throws Throwable {
		personalDetails.setFirstName("");
		personalDetails.clickNextButton();
	}

	@Then("^'Please fill the First Name' alert message should be displayed$")
	public void please_fill_the_First_Name_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks next without entering Last Name$")
	public void user_clicks_next_without_entering_Last_Name() throws Throwable {
		personalDetails.setFirstName("Narmatha");
		personalDetails.setLastName("");
		personalDetails.clickNextButton();
	}

	@Then("^'Please fill the Last Name' alert message should be displayed$")
	public void please_fill_the_Last_Name_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks next without entering Email$")
	public void user_clicks_next_without_entering_Email() throws Throwable {

		personalDetails.setLastName("Ravi");
		personalDetails.setEmail("");
		personalDetails.clickNextButton();
	}

	@Then("^'Please fill the Email' alert message should be displayed$")
	public void please_fill_the_Email_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss(); 
	}

	@When("^user clicks next by entering invalid Email$")
	public void user_clicks_next_by_entering_invalid_Email() throws Throwable {

		personalDetails.setEmail("narmatha.rgmail.com");
		personalDetails.clickNextButton();
	}

	@Then("^'Please enter valid Email Id' alert message should be displayed$")
	public void please_enter_valid_Email_Id_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please enter valid Email Id.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks next without entering contact number$")
	public void user_clicks_next_without_entering_contact_number() throws Throwable {

		personalDetails.setEmail("narmatha.r@gmail.com");
		personalDetails.setContactNo("");
		personalDetails.clickNextButton();
	}

	@Then("^'Please fill the Contact No\\.' alert message should be displayed$")
	public void please_fill_the_Contact_No_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Contact No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks next by entering invalid contact No\\.$")
	public void user_clicks_next_by_entering_invalid_contact_No() throws Throwable {

		personalDetails.setContactNo("9988");
		personalDetails.clickNextButton();
	}

	@Then("^'Please enter valid Contact No\\.' alert message should be displayed$")
	public void please_enter_valid_Contact_No_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks next without entering address line (\\d+)$")
	public void user_clicks_next_without_entering_address_line(int arg1) throws Throwable {

		personalDetails.setContactNo("776655");
		personalDetails.setAddressLine1("");
		personalDetails.clickNextButton();
	}

	@Then("^'Please fill the address line (\\d+)' alert message should be displayed$")
	public void please_fill_the_address_line_alert_message_should_be_displayed(int arg1) throws Throwable {
		String expectedMessage="Please fill the address line 1";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks next without entering address line (\\d+) after address line (\\d+)$")
	public void user_clicks_next_without_entering_address_line_after_address_line(int arg1, int arg2) throws Throwable {

		personalDetails.setAddressLine1("No:173,Akshay Tech Park");
		personalDetails.setAddressLine2("");
		personalDetails.clickNextButton();
	}

	@Then("^'Please fill the address line (\\d+)' alert message should be displayed for address line (\\d+)$")
	public void please_fill_the_address_line_alert_message_should_be_displayed_for_address_line(int arg1, int arg2) throws Throwable {
		String expectedMessage="Please fill the address line 2";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks next without selecting city$")
	public void user_clicks_next_without_selecting_city() throws Throwable {

		personalDetails.setAddressLine2("Whitefield");
		personalDetails.clickNextButton(); 
	}

	@Then("^'Please select city' alert message should be displayed$")
	public void please_select_city_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks next without selecting state$")
	public void user_clicks_next_without_selecting_state() throws Throwable {

		personalDetails.setCity("Bangalore");
		personalDetails.clickNextButton(); 
	}

	@Then("^'Please select state' alert message should be displayed$")
	public void please_select_state_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks next$")
	public void user_clicks_next() throws Throwable {

		personalDetails.setState("Karnataka");
		personalDetails.clickNextButton();
	}

	@Then("^'Personal details are validated and accepted successfully' alert message should be displayed$")
	public void personal_details_are_validated_and_accepted_successfully_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Personal details are validated and accepted successfully.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@Then("^the browser should navigte to 'Educational Details\\.html' page$")
	public void the_browser_should_navigte_to_Educational_Details_html_page() throws Throwable {
		String expectedTitle="Educational Details";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user clicks on registerMe without selecting Graduation$")
	public void user_clicks_on_registerMe_without_selecting_Graduation() throws Throwable {
		educationalDetails.clickRegisterMeButton();
	}

	@Then("^'Please Select Graduation' alert message should be displayed$")
	public void please_Select_Graduation_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please Select Graduation";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss(); 
	}

	@When("^user clicks on registerMe without entering percentage$")
	public void user_clicks_on_registerMe_without_entering_percentage() throws Throwable {
		educationalDetails.setGraduation("BE");
		educationalDetails.clickRegisterMeButton();
	}

	@Then("^'Please fill Percentage detail' alert message should be displayed$")
	public void please_fill_Percentage_detail_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill Percentage detail";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on registerMe without entering passingYear$")
	public void user_clicks_on_registerMe_without_entering_passingYear() throws Throwable {
		educationalDetails.setPercentage("79%");
		educationalDetails.clickRegisterMeButton();
	}

	@Then("^'Please fill Passing Year' alert message should be displayed$")
	public void please_fill_Passing_Year_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill Passing Year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on registerMe without entering projectName$")
	public void user_clicks_on_registerMe_without_entering_projectName() throws Throwable {
		educationalDetails.setPassingYear("2018");
		educationalDetails.clickRegisterMeButton();
	}

	@Then("^'Please fill Project Name' alert message should be displayed$")
	public void please_fill_Project_Name_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill Project Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on registerMe without selecting TechnologiesUsed$")
	public void user_clicks_on_registerMe_without_selecting_TechnologiesUsed() throws Throwable {
		educationalDetails.setProjectName("MEMS-MicroMixer");
		educationalDetails.clickRegisterMeButton();
	}

	@Then("^'Please Select Technologies Used' alert message should be displayed$")
	public void please_Select_Technologies_Used_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please Select Technologies Used";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user selects other in Technologies used$")
	public void user_selects_other_in_Technologies_used() throws Throwable {
		educationalDetails.clickTechnologiesUsed();
	}

	@When("^clicks on registerMe without entering otherTechnologies$")
	public void clicks_on_registerMe_without_entering_otherTechnologies() throws Throwable {
		educationalDetails.clickRegisterMeButton();
	}

	@Then("^'Please fill other Technologies Used' alert message should be displayed$")
	public void please_fill_other_Technologies_Used_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill other Technologies Used";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on registerMe$")
	public void user_clicks_on_registerMe() throws Throwable {
		educationalDetails.setOtherTechnologies("Comsol Multiphysics");
		educationalDetails.clickRegisterMeButton();
	}

	//Test case fails due to some error in validation.js page
	@Then("^'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!' alert message should be displayed$")
	public void your_Registration_Has_succesfully_done_Plz_check_you_registerd_email_for_account_activation_link_alert_message_should_be_displayed() throws Throwable {
		String expectedMessage="Your Registration Has succesfully done Plz check you registerd email for account activation link !!!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}



}
