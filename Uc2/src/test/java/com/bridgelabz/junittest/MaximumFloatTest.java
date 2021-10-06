package com.bridgelabz.junittest;
//Uc2
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bridgelabz.practice.MaximumFloat;
public class MaximumFloatTest {
//For Float
	@Test
	public void givenThreeFloatNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		float result=MaximumFloat.getMax(3.3f,2.1f,2.2f);
		assertEquals(3.3f,result,3.3f);
	}
	@Test
	public void givenThreeFloatNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		float result=MaximumFloat.getMax(3.3f,4.1f,2.2f);
		assertEquals(4.1f,result,4.1f);
	}
	@Test
	public void givenThreeFloatNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		float result=MaximumFloat.getMax(3.3f,2.1f,5.2f);
		assertEquals(5.2,result,5.2f);
	}
//For Integer
	@Test
	public void givenThreeNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		assertEquals(30,MaximumFloat.getMax(30,20,10));
	}
	@Test
	public void givenThreeNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		assertEquals(20,MaximumFloat.getMax(3,20,5));
	}
	@Test
	public void givenThreeNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		assertEquals(5,MaximumFloat.getMax(3,2,5));
	}
}
