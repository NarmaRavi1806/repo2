package com.cg.naukri.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NaukriRegisterFeatureStepDefinition {

	private WebDriver driver;
	
	@Given("^user is on the mainpage of 'Naukri\\.com'$")
	public void user_is_on_the_mainpage_of_Naukri_com() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@When("^user provide the valid details for registration$")
	public void user_provide_the_valid_details_for_registration() throws Throwable {
	    driver.get("https://my.naukri.com/account/createaccount?othersrcp=23531&wExp=N&gclid=EAIaIQobChMImdv2-tbp3AIV1eR3Ch32Pw05EAAYASAAEgKD1PD_BwE");
	    WebElement fresherElement = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/button"));
	    fresherElement.click();
	    WebElement nameElement=driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	    nameElement.sendKeys("Narmatha");
	    WebElement emailElement=driver.findElement(By.xpath("//*[@id=\"email\"]"));
	    emailElement.sendKeys("sure190018@gmail.com");
	    WebElement passwordElement=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[3]/div[1]/div/input"));
	    passwordElement.sendKeys("sure900");
	    WebElement mobileElement=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[4]/div[1]/div/input[2]"));
	    mobileElement.sendKeys("8877556600");
	    WebElement locationElement=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input"));
	    Select select= new Select(locationElement);
	    select.selectByVisibleText("Chennai");
	    WebElement registerElement=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[5]/div/div/div[2]/button"));
	    registerElement.submit();
	    
	    
	    
	}

	@Then("^a new profile for the user should be created in 'Naukri\\.com'$")
	public void a_new_profile_for_the_user_should_be_created_in_Naukri_com() throws Throwable {
	    
	}

}
