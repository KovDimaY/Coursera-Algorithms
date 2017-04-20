package com.coursera.assignment.second;

import java.util.Arrays;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyFileReader dataFile = new MyFileReader("data.txt");
		InversionCounter counter = new InversionCounter();
				
		int[] a = {1, 5, 4};
		
		int b = counter.numberInversions(a);
		
		System.out.println(b);
		
		
		
	}

}
