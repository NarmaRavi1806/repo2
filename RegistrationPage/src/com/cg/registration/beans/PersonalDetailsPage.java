package com.cg.registration.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * Class name : PersonalDetailsPage
 * Purpose :Bean class created for Page object model of Personal Details
 * Attributes : firstName, lastName, email, contactNo., addressLine1, addressLine2,
 * 				city, state, clickNext
 * Author : Narmatha
 * Date of Creation : 23-August-2018
 * 
 * Last Modification Date : 23-August-2018
 *
 */
public class PersonalDetailsPage {

	@FindBy(how=How.ID,id="txtFirstName")
	private WebElement firstName;

	@FindBy(how=How.ID,id="txtLastName")
	private WebElement lastName;

	@FindBy(how=How.ID,id="txtEmail")
	private WebElement email;

	@FindBy(how=How.ID,id="txtPhone")
	private WebElement contactNo;

	@FindBy(how=How.ID,id="txtAddress1")
	private WebElement addressLine1;

	@FindBy(how=How.ID,id="txtAddress2")
	private WebElement addressLine2;

	@FindBy(how=How.NAME,name="city")
	private List<WebElement> city;

	@FindBy(how=How.NAME,name="state")
	private List<WebElement> state;

	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[11]/td/a")
	private WebElement clickNext;

	public String getFirstName() {
		return firstName.getAttribute("value");
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public String getLastName() {
		return lastName.getAttribute("value");
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public String getEmail() {
		return email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public String getContactNo() {
		return contactNo.getAttribute("value");
	}

	public void setContactNo(String contactNo) {
		this.contactNo.sendKeys(contactNo);
	}

	public String getAddressLine1() {
		return addressLine1.getAttribute("value");
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1.sendKeys(addressLine1);
	}

	public String getAddressLine2() {
		return addressLine2.getAttribute("value");
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2.sendKeys(addressLine2);
	}

	public void setCity(String city) {
		Select select = new Select(this.city.get(0));
		select.selectByVisibleText(city);
	}

	public void setState(String state) {
		Select select = new Select(this.state.get(0));
		select.selectByVisibleText(state);
	}

	public void clickNextButton() {
		clickNext.click();
	}



}
