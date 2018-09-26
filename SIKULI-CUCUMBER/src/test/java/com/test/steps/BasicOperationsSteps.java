package com.test.steps;


import static org.junit.Assert.assertEquals;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.util.Util;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicOperationsSteps {
	Screen s = new Screen();
	
	public BasicOperationsSteps() {
	}
	
	@Given("^the calculator is opened$")
	public void the_calculator_is_opened() {
		Util.open();
	}

	@When("^I add two plus two$")
	public void i_add_two_plus_two() throws FindFailed {
		s.click("src/main/resources/images/btn2.JPG");
		s.click("src/main/resources/images/btnPlus.JPG");
		s.click("src/main/resources/images/btn2.JPG");
		s.click("src/main/resources/images/btnEquals.JPG");
	}

	@Then("^the result should be four$")
	public void the_result_should_be_four() throws FindFailed {
		assertEquals(true, s.find("src/main/resources/images/result4.JPG") != null ? true : false);
	}
	
	@When("^I subtract five from ten$")
	public void i_subtract_five_from_ten() throws FindFailed {
		s.click("src/main/resources/images/btn1.JPG");
		s.click("src/main/resources/images/btn0.JPG");
		s.click("src/main/resources/images/btnMinus.JPG");
		s.click("src/main/resources/images/btn5.JPG");
		s.click("src/main/resources/images/btnEquals.JPG");
	}

	@Then("^the result should be five$")
	public void the_result_should_be_five() throws FindFailed {
	    assertEquals(true, s.find("src/main/resources/images/result5.JPG") != null ? true : false);
	}
	
	@When("^I multiply five times five$")
	public void i_multiply_five_times_five() throws FindFailed {
		s.click("src/main/resources/images/btn5.JPG");
		s.click("src/main/resources/images/btnMultiply.JPG");
		s.click("src/main/resources/images/btn5.JPG");
		s.click("src/main/resources/images/btnEquals.JPG");
	}

	@Then("^the result should be twenty five$")
	public void the_result_should_be_twenty_five() throws FindFailed {
		assertEquals(true, s.find("src/main/resources/images/result25.JPG") != null ? true : false);
	}
	
	@When("^I divide twenty five by five$")
	public void i_divide_twenty_five_by_five() throws FindFailed {
		s.click("src/main/resources/images/btn2.JPG");
		s.click("src/main/resources/images/btn5.JPG");
		s.click("src/main/resources/images/btnDivide.JPG");
		s.click("src/main/resources/images/btn5.JPG");
		s.click("src/main/resources/images/btnEquals.JPG");
	}
}