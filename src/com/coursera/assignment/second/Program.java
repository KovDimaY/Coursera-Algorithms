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
		List<int[]> data4graph = graphDataFile.getContenLineList();

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
			System.out.println("Min Cut: " + minCut + "\n\n");
		} else {
			
			System.out.println("Sorry, but your data is invalid. "
					+ "Check it please and try again!");
		}
	}

	public static void secondCourseProblems() {
		// files with data provided by Coursera
		// MyFileReader SCCDataFile = new MyFileReader("CCSData.txt", 
		//											MyFileReader.DataType.LINE);
		
		MyFileReader dijkstraDataFile = new MyFileReader("test.txt", 
				MyFileReader.DataType.ARRAY);
		
		
		// getting data from the file
		// List<int[]> SCCData = SCCDataFile.getContenLineList();
		List<List<int[]>> dijkstraData = dijkstraDataFile.getContentArrayList();
		
		for (int i = 0; i < dijkstraData.size(); i++) {
			for (int j = 0; j < dijkstraData.get(i).size(); j++) {
				System.out.print(Arrays.toString(dijkstraData.get(i).get(j)));
				System.out.print(",  ");
			}
			System.out.println("");
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
		
		
		// initializing counters
		// SCCCounter sccCounter = new SCCCounter(SCCData, 875714);
		DijkstraShortPath dijkstraSPC = new DijkstraShortPath(dijkstraData);
		
		// solving the problem of strongly connected components if it is possible
		/*
		if (SCCData != null && SCCData.size() > 0) {
			int[] scc = sccCounter.fiveLargestSCC();
	
			// printing the result
			System.out.println("RESULTS OF THE SCC PROBLEM:");
			System.out.println("Five biggest SCCs: " + Arrays.toString(scc) + "\n\n");
		} else {
			
			System.out.println("Sorry, but your data is invalid. "
					+ "Check it please and try again!");
		}
		*/
		
		
		// solving the problem of Dijkstra Shortest Path if it is possible
		if (dijkstraData != null && dijkstraData.size() > 0) {
			int[] dijkstraAnswer = dijkstraSPC.dijkstraShortestPath();
	
			// printing the result
			System.out.println("RESULTS OF THE DIJKSTRA SHORTEST PATH PROBLEM:");
			System.out.println("Array with the answer: " + Arrays.toString(dijkstraAnswer) + "\n\n");
		} else {
			
			System.out.println("Sorry, but your data is invalid. "
					+ "Check it please and try again!");
		}
		
		
		
	}
}
