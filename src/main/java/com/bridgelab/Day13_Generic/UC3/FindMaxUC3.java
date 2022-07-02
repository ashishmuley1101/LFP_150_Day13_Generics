package com.bridgelab.Day13_Generic.UC3;

public abstract class FindMaxUC3<E> implements Comparable<E> {
	
	public static <E extends Comparable<E>> E findMax(E num1, E num2, E num3)
	{ 
		System.out.println("The numbers are : " + num1 + ",  "+ num2 + ",   " + num3);
		E max = num1;
		if (max.compareTo(num2) < 0) {
			max = num2;
		}
		if (max.compareTo(num3) < 0) {
			max = num3;
		}
		//System.out.println(max);
		return max;
	}	
	
	public static void main(String[] args) {
		double num1 = Math.random()*1000;
		double num2 = Math.random()*1000;
		double num3 = Math.random()*1000;
		double doubleMax = FindMaxUC3.findMax(num1,num2, num3);
		System.out.println("Greatest number of double type is : " + doubleMax);
		System.out.println();
		
		int num4 = (int)( Math.random()*1000);
		int num5 =   (int)( Math.random()*1000);
		int num6 =  (int)( Math.random()*1000);
		int intMax= FindMaxUC3.findMax(num4,num5,num6);
		System.out.println("Greatest number of int type is : " + intMax);
		System.out.println();
		
		String name1 = "hello ashish";
		String name2 =   "how are you";
		String name3 =  "i am fine!!";
		String stringMax = FindMaxUC3.findMax(name1, name2, name3);
		System.out.println("Greatest number of String type is : " + stringMax);
	}
}
