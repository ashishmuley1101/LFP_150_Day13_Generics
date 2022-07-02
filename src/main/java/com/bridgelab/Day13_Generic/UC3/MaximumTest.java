package com.bridgelab.Day13_Generic.UC3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumTest {

	@Test
	public void integerTest() {
		assertEquals((Integer)815, FindMaxUC3.findMax( 705, 652, 815));
	}
	
	@Test
	public void floatTest() {
		assertEquals((Float)882.22f, FindMaxUC3.findMax(740.23f, 882.22f, 561.11f));
	}
	
	@Test
	public void stringTest() {
		assertEquals("ashish", FindMaxUC3.findMax("Hi", "ashish", "muley"));
	}
}
