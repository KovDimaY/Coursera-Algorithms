package com.coursera.assignment.second;

import java.util.Arrays;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyFileReader dataFile = new MyFileReader("test.txt");
		System.out.print(Arrays.toString(dataFile.getValue()));
	}

}
