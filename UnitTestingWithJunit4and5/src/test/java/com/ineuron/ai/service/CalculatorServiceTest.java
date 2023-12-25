package com.ineuron.ai.service;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorServiceTest {

	//saare test cases chalne se agar hm koi logic run karna chahte hain to 
	//hm use karenge @BeforeClass and agar saare test cases pass hone ke baad 
	//agar hm koi logic run karna chahte hain to @AfterClass.
	//aur haan dono method class level ki hogi ,means static hogi 
	
	@AfterClass
	public static void cleanUpLogic() {
		System.out.println("After all test Cases:");
		System.out.println("ended test"+new Date());
	}
	
	@BeforeClass
	public static void intialize() {
		System.out.println("before all test cases:");
		System.out.println("started test"+new Date());
	}
	
	
	//executes before and after each test case. not a class level annotaiton .method level 
	//annotation so no need of void.
	@Before
	public  void initial() {
		System.out.println("aap har test case se pehle chaliyega");
	}
	@After
	public void baadMeinChalega() {
		System.out.println("aap har test case ke baad chaliyega");
	}
	
	
	//test method to add  two numbers
	
	@Test
	public void addTwoNumberTest() {
		System.out.println("execution thread is in addTwoNumberTest Method");
		int result=CalculatorService.addTwoNumbers(12, 13);
		
		int expectedResult=25;
		org.junit.Assert.assertEquals(expectedResult, result);
		
		//actual result
		
		//expected result
		
		
	}
	
	
	@Test
	public void sumAnyNumbersTest() {
		System.out.println("execution thread is in sumAnyNumbersTest Method");
	int result=CalculatorService.sumAnyNumbers(3,45,6,7,4);
	
	int expectedResult=65;
	Assert.assertEquals(expectedResult, result);
	}
	

}
