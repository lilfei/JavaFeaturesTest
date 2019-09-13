package com.llf.javaTest.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 这个类演示了文档注释
 * eclipse中加入后面一句：-encoding utf-8 -charset utf-8
 * @author Administrator
 * @version 1.2
 * 
 */
public class JavadocTest {

	/**
	 * This method returns the square of num. This is a multiline description. You
	 * can use as many lines as you like.
	 * 
	 * @param num The value to be squared.
	 * @return num squared.
	 */
	public double square(double num) {
		return num * num;
	}

	/**
	 * This method inputs a number from the user.
	 * 
	 * @return The value input as a double.
	 * @exception IOException On input error.
	 * @see IOException
	 */
	public double getNumber() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inData = new BufferedReader(isr);
		String str;
		str = inData.readLine();
		return (new Double(str)).doubleValue();
	}

	/**
	 * This method demonstrates square().
	 * 
	 * @param args Unused.
	 * @exception IOException On input error.
	 * @see IOException
	 */
	public static void main(String args[]) throws IOException {
		JavadocTest ob = new JavadocTest();
		double val;
		System.out.println("Enter value to be squared: ");
		val = ob.getNumber();
		val = ob.square(val);
		System.out.println("Squared value is " + val);
	}

}
