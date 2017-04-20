package com.coursera.assignment.second;

import java.util.Arrays;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// file with data provided by Coursera
		MyFileReader dataFile = new MyFileReader("data.txt");

		// initializing my counter
		InversionCounter counter = new InversionCounter();

		// getting data from the file
		int[] data = dataFile.getContentArray();

		// solving the problem if it is possible
		if (data != null) {
			long answer = counter.numberInversions(data);

			// printing the result
			System.out.println("Answer: " + answer);
		} else {

			System.out.println("Sorry, but your data is invalid. "
					+ "Check it please and try again!");
		}

	}

}
