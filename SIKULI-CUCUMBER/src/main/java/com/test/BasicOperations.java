package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		features = "C:\\Users\\Desenvolvimento01\\eclipse-workspace\\SIKULI-CUCUMBER\\src\\main\\java\\com\\test",
		tags = "@BasicOperations",
		glue = "C:\\Users\\Desenvolvimento01\\eclipse-workspace\\SIKULI-CUCUMBER\\src\\test\\java\\com\\test\\steps",
		monochrome = true,
		dryRun = true)


public class BasicOperations {
}