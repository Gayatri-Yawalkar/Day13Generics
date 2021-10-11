package com.bridgelabz.junittest;
//Uc4
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.bridgelabz.practice.MaximumWithVariableArguement;
public class MaximumWithVariableArguementTest {
	@Test
	public void givenThreeStringNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		String result=MaximumWithVariableArguement.getMax("xyz","pqr","real");
		assertEquals("xyz",result);
	}
	@Test
	public void givenThreeStringNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		String result=MaximumWithVariableArguement.getMax("pqr","xyz","abc");
		assertEquals("xyz",result);
	}
	@Test
	public void givenThreeStringNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		String result=MaximumWithVariableArguement.getMax("abc","pwr","xyz");
		assertEquals("xyz",result);
	}
	@Test
	public void givenThreeFloatNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		float result=MaximumWithVariableArguement.getMax(3.3f,2.1f,2.2f);
		assertEquals(3.3f,result,3.3f);
	}
	@Test
	public void givenThreeFloatNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		float result=MaximumWithVariableArguement.getMax(3.3f,4.1f,2.2f);
		assertEquals(4.1f,result,4.1f);
	}
	@Test
	public void givenThreeFloatNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		float result=MaximumWithVariableArguement.getMax(3.3f,2.1f,5.2f);
		assertEquals(5.2,result,5.2f);
	}
	@Test
	public void givenThreeNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		int result=MaximumWithVariableArguement.getMax(30,20,10);
		assertEquals(30,result);
	}
	@Test
	public void givenThreeNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		int result=MaximumWithVariableArguement.getMax(3,20,5);
		assertEquals(20,result);
	}
	@Test
	public void givenThreeNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		int result=MaximumWithVariableArguement.getMax(3,2,5);
		assertEquals(5,result);
	}	
	@Test
	public void givenMultipleFloatNumbers_shouldReturnMaxNumber() {
		float result=MaximumWithVariableArguement.getMax(5.0f,7.0f,2.0f,9.0f,22.1f,1.4f);
		assertEquals(22.1f,result,22.1f);
	}
	@Test
	public void givenMultipleStringNumbers_shouldReturnMaxNumber() {
		String result=MaximumWithVariableArguement.getMax("abc","pqr","lmn","def","ead","xyz");
		assertEquals("xyz",result);
	}
	
}

