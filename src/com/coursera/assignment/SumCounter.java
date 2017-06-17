package com.coursera.assignment;

import java.util.Arrays;

import com.coursera.helpers.CustomHashTable;

public class SumCounter {
	
	public int numberSums(int[] data, int[] interval) {
		System.out.println(Arrays.toString(data) + "\n" + Arrays.toString(interval) + "\n\n");
		
		int result = 0;
		for(int t = interval[0]; t <= interval[1]; t++) {
			boolean discovered = false;
			for(int j = 0; j < data.length && !discovered; j++) {
				if (this.has(data, t - data[j]) && (t - 2*data[j]) != 0) {
					System.out.println(data[j] + "+ ? = " + t);
					result++;
					discovered = true;
				}
			}
		}
		
		return result;
	}
	
	
	private boolean has(int[] data, int element) {
		for(int j = 0; j < data.length; j++) {
			if (data[j] == element) {
				return true;
			}
		} 
		return false;
	}
	
	private CustomHashTable convertToHashTable(int[] data) {
		return null;
	}

}
