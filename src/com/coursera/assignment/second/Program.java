package com.coursera.assignment.second;

import java.util.List;
import java.util.Arrays;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Divide and Conquer Algorithms 
		// uncomment next line to see results
		// firstCourseProblems();
		
		// Graph Search Algorithms
		secondCourseProblems();
	}
	
	public static void firstCourseProblems() {
		// files with data provided by Coursera
		MyFileReader inversionsDataFile = new MyFileReader("InversionsData.txt", 
															MyFileReader.DataType.NUMBER);
		MyFileReader sortDataFile = new MyFileReader("ComparisonsData.txt",
													  MyFileReader.DataType.NUMBER);
		MyFileReader graphDataFile = new MyFileReader("MinCutData.txt", 
													  MyFileReader.DataType.LINE);

		// initializing counters
		InversionCounter inversionCounter = new InversionCounter();
		ComparisonCounter comparisonCounter = new ComparisonCounter();
		MinCutCounter grapghCut = new MinCutCounter();

		// getting data from the file
		int[] data4inversions = inversionsDataFile.getContentNumArray();
		int[] data4sort = sortDataFile.getContentNumArray();
		List<int[]> data4graph = graphDataFile.getContenLinetList();

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
		
		// solving the problem of min cut if it is possible
		if (data4graph != null && data4graph.size() > 0) {
			int minCut = grapghCut.minCut(data4graph);
	
			// printing the result
			System.out.println("RESULTS OF THE MIN CUT PROBLEM:");
			System.out.println("Min Cut: " + minCut);
		} else {
			
			System.out.println("Sorry, but your data is invalid. "
					+ "Check it please and try again!");
		}
	}

	public static void secondCourseProblems() {
		// files with data provided by Coursera
		MyFileReader SCCDataFile = new MyFileReader("test.txt", 
													MyFileReader.DataType.LINE);
		
		// initializing counters
		SCCCounter sccCounter = new SCCCounter();
		
		// getting data from the file
		List<int[]> SCCData = SCCDataFile.getContenLinetList();
		
		for (int i=0; i<SCCData.size(); i++){
			System.out.println(Arrays.toString(SCCData.get(i)));
		}
		System.out.println("*****************************************");
		
		// solving the problem of min cut if it is possible
		if (SCCData != null && SCCData.size() > 0) {
			int[] scc = sccCounter.fiveLargestSCC(SCCData, 9);
	
			// printing the result
			System.out.println("RESULTS OF THE SCC PROBLEM:");
			System.out.println("Five biggest SCCs: " + Arrays.toString(scc));
		} else {
			
			System.out.println("Sorry, but your data is invalid. "
					+ "Check it please and try again!");
		}
		
	}
}
