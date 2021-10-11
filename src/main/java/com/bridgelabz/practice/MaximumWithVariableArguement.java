package com.bridgelabz.practice;
import java.util.Arrays;
//Uc4
public class MaximumWithVariableArguement {
	public static <T extends Comparable> T getMax(T...var) {
		Arrays.sort(var);
		T max=var[var.length-1];
		return max;
	}
}