package com.bridgelab.Day13_Generic_UC1;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest1 {

	@Test
	// Test Case for the Integer where max_Value at First Position
	public void integerAtFirstPosition() {
		MaximumValues log = new MaximumValues();
		int actualResult = log.findMax(16, 15, 10);
		System.out.println("First Position is: " + actualResult);
		int expectedResult = 16;
		Assert.assertEquals(expectedResult, actualResult);
	}

	@Test
	// Test Case for the Integer where max_Value at second Position
	public void integerAtSecondPosition() {
		MaximumValues log = new MaximumValues();
		int actualResult = log.findMax(10, 15, 11);
		System.out.println("Second Position is: " + actualResult);
		int expectedResult = 15;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the Integer where max_Value at Third Position
	@Test
	public void integerAtThirdPosition() {
		MaximumValues log = new MaximumValues();
		int actualResult = log.findMax(11, 10, 12);
		System.out.println("Third Position is: " + actualResult);
		int expectedResult = 12;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the float where max_Value at First Position
	@Test
	public void floatAtFirstPosition() {
		MaximumValues log = new MaximumValues();
		float actualResult = log.findMax(11.2f, 10.3f, 9.4f);
		float expectedResult = 11.2f;
		Assert.assertEquals(expectedResult, actualResult, expectedResult);
	}

	// Test Case for the float where max_Value at second Position
	@Test
	public void floatAtSecoundPosition() {
		MaximumValues log = new MaximumValues();
		float actualResult = log.findMax(11.2f, 12.3f, 9.4f);
		float expectedResult = 12.3f;
		Assert.assertEquals(expectedResult, actualResult, expectedResult);
	}

	// Test Case for the float where max_Value at third Position
	@Test
	public void floatAtThirdPosition() {
		MaximumValues log = new MaximumValues();
		float actualResult = log.findMax(11.2f, 10.3f, 99.4f);
		float expectedResult = 99.4f;
		Assert.assertEquals(expectedResult, actualResult, expectedResult);
	}

	// Test Case for the String where max_Value at First Position
	@Test
	public void stringAtFirstPosition() {
		MaximumValues log = new MaximumValues();
		String actualResult = log.findMax("Banana", "Peach", "Apple");
		String expectedResult = "Peach";
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Test Case for the String where max_Value at Second Position
	@Test
	public void stringAtSecondPosition() {
		MaximumValues log = new MaximumValues();
		String actualResult = log.findMax("Banana", "Peach", "Apple");
		String expectedResult = "Peach";
		Assert.assertEquals(expectedResult, actualResult);
	}

	//  Test Case for the String where max_Value at third Position
	@Test
	public void stringAtThirdPosition() {
		MaximumValues log = new MaximumValues();
		String actualResult = log.findMax("Banana", "Apple", "Peach");
		String expectedResult = "Peach";
		Assert.assertEquals(expectedResult, actualResult);
	}
}
