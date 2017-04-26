package com.coursera.assignment.second;

import java.util.Arrays;

public class ComparisonCounter {
	
	public long numberComparisonFirst(int[] data) {
		return 1;
	}
	
	public long numberComparisonLast(int[] data) {
		return 2;		
	}
	
	public long numberComparisonMediana(int[] data) {
		return 3;		
	}
	// function that calculates split inversions
	private long mergeCount(int[] left, int[] right) {
		int idxLeft = 0;
		int idxRight = 0;
		long result = 0;

		// basic merge subroutine (adapted)
		while (idxLeft < left.length && idxRight < right.length) {
			if (left[idxLeft] <= right[idxRight]) {
				idxLeft++;
			} else {
				idxRight++;
				// if there are smaller elements in the right part
				// so all elements that left on the left part are inversions
				result += left.length - idxLeft;
			}
		}
		return result;
	}
}
