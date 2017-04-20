package com.coursera.assignment.second;

import java.util.Arrays;

public class InversionCounter {

	// number of inversions = number of pairs of indices (i,j) 
	// of array A with i<j and A[i] > A[j]
	public int numberInversions(int[] data) {
		System.out.println(Arrays.toString(data) + " - " + data.length);
		
		if (data.length == 1) { 
			System.out.println("return");
			return 0;
		} else 
		{
			int[] left = Arrays.copyOfRange(data, 0, data.length/2);
			int[] right = Arrays.copyOfRange(data, data.length/2, data.length);
						
			int leftInversions = this.numberInversions(left);
			int rightInversions = this.numberInversions(right);
			
			Arrays.sort(left);
			Arrays.sort(right);			
			int splitInversions = this.mergeCount(left, right);	
			
			System.out.println("return");
			return leftInversions + rightInversions + splitInversions;
		}
	}
	
	private int mergeCount(int[] left, int[] right) {
		int idxLeft = 0;
		int idxRight = 0;
		int result = 0;
		
		while (idxLeft < left.length) {
			if (left[idxLeft] < right[idxRight]) {
				idxLeft++;				
			} else if (idxRight < right.length-1) {
				idxRight++;	
				result += left.length - idxLeft;
			}
		}
		return result;
	}
}
