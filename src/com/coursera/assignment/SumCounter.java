package com.coursera.assignment;
import java.util.Hashtable;

import java.util.Arrays;

import com.coursera.helpers.CustomHashTable;

public class SumCounter {
	
	public int numberSums(long[] data, int[] interval) {
		//System.out.println(Arrays.toString(data) + "\n" + Arrays.toString(interval) + "\n\n");
		Hashtable hashtable = new Hashtable(2000000);
		
		System.out.println(data.length);
		
		
		for (int i = 0; i < data.length; i++) {
			hashtable.put(data[i], true);
		}
		
		
		int result = 0;
		System.out.println(hashtable.size());
		
		
		for(int t = interval[0]; t <= interval[1]; t++) {
			System.out.println("Checking for " + t);
			boolean discovered = false;
			for(int j = 0; j < data.length && !discovered; j++) {
				if (hashtable.containsKey(t - data[j]) && (t != 2*data[j])) {
					//System.out.println(data[j] + "+ ? = " + t);
					result++;
					discovered = true;
				}
			}
		}
		
		
		return result;
	}
	
	
	private boolean has(long[] data, long element) {
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
