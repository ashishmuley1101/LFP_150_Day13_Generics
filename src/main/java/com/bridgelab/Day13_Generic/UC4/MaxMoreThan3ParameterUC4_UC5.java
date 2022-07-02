package com.bridgelab.Day13_Generic.UC4;

import java.util.Arrays;
import java.util.List;

public class MaxMoreThan3ParameterUC4_UC5 {

	public static <T extends Comparable<T>> T findMax(List<T> arr) {

		T max = arr.get(0);
		for (T key : arr) {
			if (key.compareTo(max) > 0)
				max = key;
		}
		return max;
	}
	//************UC4***********************************
	public static <T extends Comparable<T>> T printMax() {

		System.out.println("The Maximum integer num is : " + findMax(Arrays.asList(4, 7, 8, 9, 65, 55)));
		System.out.println("The Maximum float num is: " + findMax(Arrays.asList(4.9f, 7.8f, 8.0f, 9.6f, 44.7f, 55.6f)));
		System.out.println(
				"The Maximum String  is: " + findMax(Arrays.asList("Hello", "Ashish", "Welcome", "GoodBye", "GoodDay")));
		return null;
	}
//*****************************UC5*****************************
	public static void main(String[] args) {
		System.out.println("Printing the Maximum Values...!!");
		printMax();

	}

}

