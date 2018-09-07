package com.cg.product.StepDefinition;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OnlineShoppingFeatureStepDefinition {
	
	private TestRestTemplate restTemplate;
	private ResponseEntity<String> responseEntity;
	
	@Before
	public void setUpTestEnv() {
		restTemplate=new TestRestTemplate();
	}
	
	@When("^user gives null productCode$")
	public void user_gives_null_productCode() throws Throwable {
	   responseEntity=restTemplate.getForEntity("http://localhost:9999/sayHello", String.class) ;
	}

	@Then("^'Product of given productCode cannot be found' message should be displayed on the page$")
	public void product_of_given_productCode_cannot_be_found_message_should_be_displayed_on_the_page() throws Throwable {
	   Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode()); 
	   Assert.assertEquals("Hello World from RESTFullWebServices", responseEntity.getBody());
	}

}
