package com.ineuron.ai.service;

public class CalculatorService {
	
	
	
	public static int addTwoNumbers(int a, int b) {
	return a+b;	
	}
	
	
	
	public static int divideTwoNumbers(int a, int b) {
		return a/b;
		
	}
	
	
	
	public static int multiplyTwoNumbers(int a, int b) {
		return a*b;
	}
	
	
	
	public static int sumAnyNumbers(int ...numbers) {
		int sum=0;
		for(int s:numbers) {
			sum=s+sum;
		}
		return sum;
	}
}
