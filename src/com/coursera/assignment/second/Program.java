package com.coursera.assignment.second;

import java.util.List;
import java.util.Arrays;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// files with data provided by Coursera
		MyFileReader inversionsDataFile = new MyFileReader("InversionsData.txt", 
															MyFileReader.DataType.NUMBER);
		MyFileReader sortDataFile = new MyFileReader("ComparisonsData.txt",
													  MyFileReader.DataType.NUMBER);
		MyFileReader treeDataFile = new MyFileReader("test.txt", 
													  MyFileReader.DataType.LINE);

		// initializing counters
		InversionCounter inversionCounter = new InversionCounter();
		ComparisonCounter comparisonCounter = new ComparisonCounter();

		// getting data from the file
		int[] data4inversions = inversionsDataFile.getContentNumArray();
		int[] data4sort = sortDataFile.getContentNumArray();
		List<int[]> data4tree = treeDataFile.getContenLinetList();

		// solving the problem of inversions if it is possible
		if (data4inversions != null && data4inversions.length > 0) {
			long answer = inversionCounter.numberInversions(data4inversions);

			// printing the result
			System.out.println("RESULTS OF THE INVERSIONS PROBLEM:");
			System.out.println("Number of inversions: " + answer + "\n\n");
		} else {

			System.out.println("Sorry, but your data is invalid. "
					+ "Check it please and try again!");
		}
		
		// solving the problem of comparison if it is possible
		if (data4sort != null && data4sort.length > 0) {
			long answerFirst = comparisonCounter.numberComparisonFirst(data4sort);
			long answerSecond = comparisonCounter.numberComparisonLast(data4sort);
			long answerThird = comparisonCounter.numberComparisonMiddle(data4sort);
			long answerFourth = comparisonCounter.numberComparisonRandom(data4sort);
	
			// printing the result
			System.out.println("RESULTS OF THE COMPARISONS PROBLEM:");
			System.out.println("Comparisons first pivot: " + answerFirst);
			System.out.println("Comparisons last pivot: " + answerSecond);
			System.out.println("Comparisons central pivot: " + answerThird);
			System.out.println("Comparisons random pivot: " + answerFourth + "\n\n");
		} else {
	
			System.out.println("Sorry, but your data is invalid. "
					+ "Check it please and try again!");
		}
		
		for (int i=0; i<data4tree.size(); i++){
			System.out.println(Arrays.toString(data4tree.get(i)));
		}
		

	}
	
	

}
