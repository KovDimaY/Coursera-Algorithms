package com.coursera.assignment;
import java.util.Hashtable;

import java.util.Arrays;

import com.coursera.helpers.CustomHashTable;
import com.coursera.helpers.CustomListHashTable;

public class SumCounter {
	
	public int numberSums(long[] data, int[] interval) {
		//System.out.println(Arrays.toString(data) + "\n" + Arrays.toString(interval) + "\n\n");
		//Hashtable hashtable = new Hashtable(2*data.length);
		CustomHashTable hashtable2 = new CustomHashTable(data.length);
		CustomListHashTable hashtable = new CustomListHashTable(data.length);
		
		// System.out.println("Elements in the input array: " + data.length);
		for (int i = 0; i < data.length; i++) {
			hashtable.insert(data[i]);
		}
		for (int i = 0; i < data.length; i++) {
			hashtable2.insert(data[i]);
		}
		System.out.println("Size of the hash-table: " + hashtable2.maxSize());
		System.out.println("Size of the list hash-table: " + hashtable.maxSize());
		System.out.println("Elements in the resulting hash-table: " + hashtable2.size());
		System.out.println("Elements in the resulting list hash-table: " + hashtable.size());
		
		
		int result = 0;
		
		for(int t = interval[0]; t <= interval[1]; t++) {
			if (t%100 == 0) {
				System.out.println("Checking for " + t);
			}
			boolean discovered = false;
			for(int j = 0; j < data.length && !discovered; j++) {
				if (hashtable.find(t - data[j]) && (t != 2*data[j])) {
					//System.out.println(data[j] + "+ ? = " + t);
					result++;
					discovered = true;
				}
			}
		}
		
		return result;
	}

}
