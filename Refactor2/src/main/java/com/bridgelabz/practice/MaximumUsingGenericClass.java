package com.bridgelabz.practice;
//Refactor 2
public class MaximumUsingGenericClass<T extends Comparable> {
	T first,second,third;
	public MaximumUsingGenericClass(T first,T second,T third) {
		this.first=first;
		this.second=second;
		this.third=third;
	}
	public T getMax() {
		T maxValue=MaximumUsingGenericClass.getMaximum(this.first,this.second,this.third);
		return maxValue;
	}
	public static <T extends Comparable> T getMaximum(T firstInput, T secondInput, T thirdInput) {
		T max;
		if(firstInput.compareTo(secondInput)>0 && firstInput.compareTo(thirdInput)>0) {
			max=firstInput;
		} else if(secondInput.compareTo(firstInput)>0 && secondInput.compareTo(thirdInput)>0) {
			max=secondInput;
		} else {
			max=thirdInput;
		}
		return max;
	}
}
