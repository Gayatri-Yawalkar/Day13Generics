package com.bridgelabz.junittest;
//Refactor 2
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bridgelabz.practice.MaximumUsingGenericClass;
import com.bridgelabz.practice.MaximumUsingGenericMethod;

public class MaximumUsingGenericClassTest {
	@Test
	public void givenThreeIntNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		MaximumUsingGenericClass<Integer> genericClass=new MaximumUsingGenericClass(3,2,1);
		int result=genericClass.getMax();
		assertEquals(3,result);
	}
	@Test
	public void givenThreeIntNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		MaximumUsingGenericClass<Integer> genericClass=new MaximumUsingGenericClass(3,20,1);
		int result=genericClass.getMax();
		assertEquals(20,result);
	}
	@Test
	public void givenThreeIntNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		MaximumUsingGenericClass<Integer> genericClass=new MaximumUsingGenericClass(3,2,10);
		int result=genericClass.getMax();
		assertEquals(10,result);
	}
	@Test
	public void givenThreeFloatNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		MaximumUsingGenericClass<Float> genericClass=new MaximumUsingGenericClass(3.3f,2.2f,1.1f);
		float result=genericClass.getMax();
		assertEquals(3.3f,result,3.3f);
	}
	@Test
	public void givenThreeFloatNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		MaximumUsingGenericClass<Float> genericClass=new MaximumUsingGenericClass(3.1f,20.2f,2f);
		float result=genericClass.getMax();
		assertEquals(20.2f,result,20.2f);
	}
	@Test
	public void givenThreeFloatNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		MaximumUsingGenericClass<Float> genericClass=new MaximumUsingGenericClass(3.1f,2.3f,15.7f);
		float result=genericClass.getMax();
		assertEquals(15.7f,result,15.7f);
	}
	@Test
	public void givenThreeStringNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		MaximumUsingGenericClass<String> genericClass=new MaximumUsingGenericClass("xyz","abc","pqr");
		String result=genericClass.getMax();
		assertEquals("xyz",result);
	}
	@Test
	public void givenThreeStringNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		MaximumUsingGenericClass<String> genericClass=new MaximumUsingGenericClass("abc","xyz","lmn");
		String result=genericClass.getMax();
		assertEquals("xyz",result);
	}
	@Test
	public void givenThreeStringNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		MaximumUsingGenericClass<String> genericClass=new MaximumUsingGenericClass("hij","abx","xyz");
		String result=genericClass.getMax();
		assertEquals("xyz",result);
	}
}
