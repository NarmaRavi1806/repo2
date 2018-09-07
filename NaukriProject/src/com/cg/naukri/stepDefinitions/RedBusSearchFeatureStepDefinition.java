package com.cg.naukri.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cg.naukri.beans.RedBusSearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusSearchFeatureStepDefinition {

	private WebDriver driver;
	private RedBusSearchPage searchPage;

	@Given("^User is on the search page of 'Redbus\\.com'$")
	public void user_is_on_the_search_page_of_Redbus_com() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMI74Pgk-7p3AIV7b3tCh0WrAL0EAAYASAAEgIj8PD_BwE");
		searchPage=new RedBusSearchPage();
		PageFactory.initElements(driver, searchPage);

	}

	@When("^user types the from , to and onward date field$")
	public void user_types_the_from_to_and_onward_date_field() throws Throwable {

		/*WebElement fromElement= driver.findElement(By.xpath("//*[@id=\"src\"]"));
	   fromElement.sendKeys("Bangalore");
	   fromElement.sendKeys(Keys.TAB);*/

		/*Select select= new Select(fromElement);
	    //select.selectByVisibleText("Bangalore");
	    select.selectByIndex(0);*/
		/* WebElement toElement= driver.findElement(By.xpath("//*[@id=\"dest\"]"));
	   toElement.sendKeys("Chennai");
	   toElement.sendKeys(Keys.TAB);*/
		

		

	  searchPage.setSource("Bangalore");
	  searchPage.setDestination("Hyderabad");
	   WebElement onwardDateElement= driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span"));
	   onwardDateElement.click();
	   WebElement dateElement=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[3]"));
	   dateElement.click();
	   //searchPage.setOnwardDate("17-Aug-2018");
	   
	   WebElement selectCity = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]"));
	   WebElement selectcity2=driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]"));
		selectCity.click();
		selectcity2.click(); 
	  
	   WebElement searchElement=driver.findElement(By.id("search_btn"));
	   searchElement.click();
	   //searchPage.clickSearchBtn();
		//driver.navigate().forward();
		//driver.navigate().to("https://www.redbus.in/search?fromCityName=Bangalore&fromCityId=122&toCityName=Chennai&toCityId=123&onward=17-Aug-2018&opId=0&busType=Any");

		/*WebElement fromCity= driver.findElement(By.id("src"));
		fromCity.sendKeys("Bangalore");

		WebElement toCity= driver.findElement(By.id("dest"));
		toCity.sendKeys("Hyderabad"); 
		WebElement fromDate = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span"));
		fromDate.click();
		WebElement Date = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[3]"));
		Date.click();

		WebElement selectCity = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]"));
		WebElement selectcity2=driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]"));
		selectCity.click();
		selectcity2.click(); 
		WebElement searchElement1 = driver.findElement(By.id("search_btn"));
		searchElement1.click(); */
	}

	@Then("^the list of buses available on that date should be listed$")
	public void the_list_of_buses_available_on_that_date_should_be_listed() throws Throwable {
		String actualTitle=driver.getTitle();
		String expectedTitle="Search Bus Tickets";
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
	}


}
