package com.bridgelabz.junittest;
//Uc3
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.bridgelabz.practice.MaximumString;
public class MaximumStringTest {
//For String
	@Test
	public void givenThreeStringNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		String result=MaximumString.getMax("xyz","pqr","real");
		assertEquals("xyz",result);
	}
	@Test
	public void givenThreeStringNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		String result=MaximumString.getMax("pqr","xyz","abc");
		assertEquals("xyz",result);
	}
	@Test
	public void givenThreeStringNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		String result=MaximumString.getMax("abc","pwr","xyz");
		assertEquals("xyz",result);
	}
//For Float
	@Test
	public void givenThreeFloatNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		float result=MaximumString.getMax(3.3f,2.1f,2.2f);
		assertEquals(3.3f,result,3.3f);
	}
	@Test
	public void givenThreeFloatNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		float result=MaximumString.getMax(3.3f,4.1f,2.2f);
		assertEquals(4.1f,result,4.1f);
	}
	@Test
	public void givenThreeFloatNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		float result=MaximumString.getMax(3.3f,2.1f,5.2f);
		assertEquals(5.2,result,5.2f);
	}
//For Integer
	@Test
	public void givenThreeNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		assertEquals(30,MaximumString.getMax(30,20,10));
	}
	@Test
	public void givenThreeNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		assertEquals(20,MaximumString.getMax(3,20,5));
	}
	@Test
	public void givenThreeNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		assertEquals(5,MaximumString.getMax(3,2,5));
	}		
			
		
}
