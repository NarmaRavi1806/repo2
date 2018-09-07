package com.cg.registration.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * Class name : EducationalDetailsPage
 * Purpose :Bean class created for Page object model of Educational Details
 * Attributes : graduation, percentage, passingYear, projectName, technologiesUsed,
 * 				otherTechnologies,registerMe
 * Author : Narmatha
 * Date of Creation : 23-August-2018
 * 
 * Last Modification Date : 23-August-2018
 *
 */
public class EducationalDetailsPage {

	@FindBy(how=How.NAME,name="graduation")
	private List<WebElement> graduation;

	@FindBy(how=How.ID,id="txtPercentage")
	private WebElement percentage;

	@FindBy(how=How.ID,id="txtPassYear")
	private WebElement passingYear;

	@FindBy(how=How.ID,id="txtProjectName")
	private WebElement projectName;

	@FindBy(how=How.ID,id="cbTechnologies")
	private List<WebElement> technologiesUsed;

	@FindBy(how=How.ID,id="txtOtherTechs")
	private WebElement otherTechnologies;

	@FindBy(how=How.ID,id="btnRegister")
	private WebElement registerMe;

	public void setGraduation(String graduation) {
		Select select = new Select(this.graduation.get(0));
		select.selectByVisibleText(graduation);
	}

	public String getPercentage() {
		return percentage.getAttribute("value");
	}

	public void setPercentage(String percentage) {
		this.percentage.sendKeys(percentage);
	}

	public String getPassingYear() {
		return passingYear.getAttribute("value");
	}

	public void setPassingYear(String passingYear) {
		this.passingYear.sendKeys(passingYear);
	}

	public String getProjectName() {
		return projectName.getAttribute("value");
	}

	public void setProjectName(String projectName) {
		this.projectName.sendKeys(projectName);
	}

	public void clickTechnologiesUsed() {
		WebElement radio=technologiesUsed.get(3);
		radio.click();
	}

	public String getOtherTechnologies() {
		return otherTechnologies.getAttribute("value");
	}

	public void setOtherTechnologies(String otherTechnologies) {
		this.otherTechnologies.sendKeys(otherTechnologies);
	}

	public void clickRegisterMeButton() {
		registerMe.click();
	}



}
