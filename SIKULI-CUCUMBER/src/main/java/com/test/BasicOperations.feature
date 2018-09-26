@BasicOperations
Feature: Test Windows calculator basic operations

	Scenario: the calculator should add two numbers
		Given the calculator is opened
		When I add two plus two
		Then the result should be four
		
	Scenario: the calculator should subtract two numbers
		Given the calculator is opened
		When I subtract five from ten
		Then the result should be five

	Scenario: the calculator should multiply two numbers
		Given the calculator is opened
		When I multiply five times five
		Then the result should be twenty five

	Scenario: the calculator should divide two numbers
		Given the calculator is opened
		When I divide twenty five by five
		Then the result should be five