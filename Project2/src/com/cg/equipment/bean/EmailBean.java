package com.cg.equipment.bean;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class EmailBean {
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\\\"txtUserName\\\"]")
	private WebElement userName;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\\\"txtPassword\\\"]\"")
	private WebElement password;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\\\"txtConfPassword\\\"]")
	private WebElement confirmPassword;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\\\"txtFirstName\\\"]")
	private WebElement firstName;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\\\"txtLastName\\\"]")
	private WebElement lastName;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"rbFemale\"]")
	private WebElement gender;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\\\"txtAddress\\\"]")
	private WebElement address;
	
	@FindBy(how=How.XPATH, xpath="/html/body/form/table/tbody/tr[10]/td[2]/select/option[4]")
	public List<WebElement> city;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\\\"txtEmail\\\"]")
	private WebElement email;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\\\"txtPhone\\\"]")
	private WebElement phone;
	
	@FindBy(how=How.XPATH, xpath="")
	private WebElement hobbies;
	
	@FindBy(how=How.XPATH, xpath="/html/body/form/table/tbody/tr[13]/td/input")
	public WebElement submit;

	public String getUserName() {
		return userName.getAttribute("value");
	}

	public void setUserName(String userName) {
		this.userName.sendKeys(userName);
	}

	public String getPassword() {
		return password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public String getConfirmPassword() {
		return confirmPassword.getAttribute("value");
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword.sendKeys(confirmPassword);
	}

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

	public String getGender() {
		return gender.getAttribute("value");
	}

	public void setGender(String gender) {
		this.gender.sendKeys(gender);
	}

	public String getAddress() {
		return address.getAttribute("value");
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public void getCity(String city) {
		Select select = new Select(this.city.get(0));
	    select.selectByVisibleText(city);
	}

	/*public void setCity(List<String> city) {
		this.city = city;
	}*/

	public String getEmail() {
		return email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public String getPhone() {
		return phone.getAttribute("value");
	}

	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public void getSubmitBtn() {
		submit.submit();
	}

	/*public void setSubmit(WebElement submit) {
		this.submit = submit;
	}*/
	
	

}
