package com.bridgelabz.junittest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bridgelabz.practice.Maximum;
//Uc1
public class MaximumTest {
	@Test
	public void firstMaxTestValidator() {
		assertEquals(30,Maximum.getMax(30,20,10));
	}
	@Test
	public void secondMaxTestValidator() {
		assertEquals(20,Maximum.getMax(3,20,5));
	}
	@Test
	public void thirdMaxTestValidator() {
		assertEquals(5,Maximum.getMax(3,2,5));
	}
	
}
