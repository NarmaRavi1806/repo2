package com.cg.naukri.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedBusSearchPage {
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"src\"]")
	private WebElement source;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"dest\"]")
	private WebElement destination;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"search_btn\"]")
	private WebElement button;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"onward_cal\"]")
	private WebElement onwardDate;
	
	/*@FindBy(how=How.XPATH,xpath="//*[@id=\\\"search\\\"]/div/div[3]/span")
	private WebElement onwardDate;*/

	public String getSource() {
		return source.getAttribute("value");
	}

	public void setSource(String source) {
		this.source.sendKeys(source);
	}

	public String getDestination() {
		return destination.getAttribute("value");
	}

	public void setDestination(String destination) {
		this.destination.sendKeys(destination);
	}

	public void clickSearchBtn() {
		button.click();
	}

	public String getOnwardDate() {
		return onwardDate.getAttribute("value");
	}

	public void setOnwardDate(String onwardDate) {
		this.onwardDate.sendKeys(onwardDate);;
	}
	

	/*public void setButton(WebElement button) {
		this.button = button;
	}*/

	/*public WebElement getOnwardDate() {
		return onwardDate;
	}

	public void setOnwardDate(WebElement onwardDate) {
		this.onwardDate = onwardDate;
	}
	*/
	

}
