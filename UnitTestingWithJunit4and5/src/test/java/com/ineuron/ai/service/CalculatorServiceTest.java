package com.ineuron.ai.service;

import org.junit.Test;

public class CalculatorServiceTest {

	
	//test method to ad  two numbers
	
	@Test
	public void addTwoNumberTest() {
		int result=CalculatorService.addTwoNumbers(12, 13);
		
		int expectedResult=25;
		org.junit.Assert.assertEquals(expectedResult, result);
		
		//actual result
		
		//expected result
		
		
	}
}
