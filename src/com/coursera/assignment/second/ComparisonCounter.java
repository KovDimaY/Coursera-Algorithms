package com.coursera.assignment.second;

import java.util.Arrays;

public class ComparisonCounter {
	
	public long numberComparisonFirst(int[] data) {
		int[] temp = Arrays.copyOf(data, data.length);
		long result = this.sortFirst(temp, 0, temp.length);
		System.out.println(Arrays.toString(temp));
		return result;
	}
		
	public long numberComparisonLast(int[] data) {
		int[] temp = Arrays.copyOf(data, data.length);
		long result = this.sortLast(temp, 0, temp.length);
		System.out.println(Arrays.toString(temp));
		return result;		
	}
	
	public long numberComparisonMiddle(int[] data) {
		int[] temp = Arrays.copyOf(data, data.length);
		long result = this.sortMiddle(temp, 0, temp.length);
		System.out.println(Arrays.toString(temp));
		return result;		
	}
	
	private long sortFirst(int[] data, int begin, int end){
		if (end - begin < 2){
			return 0;
		} else {
			int i = begin+1;
			
			for (int j = begin+1; j < end; j++){
				if (data[begin] > data[j]){
					if(j != i) {
						// swap of values
						data[i] = data[i] + data[j];
						data[j] = data[i] - data[j];
						data[i] = data[i] - data[j];					
					}
					i++;
				}
			}
			if ((i-1) != begin) {
				// final swap of the pivot element
				data[i-1] = data[i-1] + data[begin];
				data[begin] = data[i-1] - data[begin];
				data[i-1] = data[i-1] - data[begin];
			}	
			long left = this.sortFirst(data, begin, i-1);
			long right = this.sortFirst(data, i, end);
			return left + right + end - begin - 1; 
		}
	}

	private long sortLast(int[] data, int begin, int end){
		if (end - begin < 2){
			return 0;
		} else {
			
			// swap of values
			data[begin] = data[begin] + data[end-1];
			data[end-1] = data[begin] - data[end-1];
			data[begin] = data[begin] - data[end-1];
			
			int i = begin+1;
						
			for (int j = begin+1; j < end; j++){
				if (data[begin] > data[j]){
					if(j != i) {
						// swap of values
						data[i] = data[i] + data[j];
						data[j] = data[i] - data[j];
						data[i] = data[i] - data[j];					
					}
					i++;
				}
			}
			if ((i-1) != begin) {
				// final swap of the pivot element
				data[i-1] = data[i-1] + data[begin];
				data[begin] = data[i-1] - data[begin];
				data[i-1] = data[i-1] - data[begin];
			}	
			long left = this.sortLast(data, begin, i-1);
			long right = this.sortLast(data, i, end);
			return left + right + end - begin - 1; 
		}
	}
	
	private long sortMiddle(int[] data, int begin, int end){
		if (end - begin < 2){
			return 0;
		} else {
			
			int middleIndex = (begin + end)/2;
			int medianIndex = this.medianIndex(data[begin], data[middleIndex], data[end-1], 
												begin, middleIndex, end-1);
			
			
			 System.out.println(data[begin] + ", " + data[middleIndex] + ", " + data[end-1] +
					" => " + data[medianIndex]);
			 
			 System.out.println(begin + ", " + end + " => " + middleIndex);
			
			
			// swap of values
			data[begin] = data[begin] + data[medianIndex];
			data[medianIndex] = data[begin] - data[medianIndex];
			data[begin] = data[begin] - data[medianIndex];
			
			int i = begin+1;
			
			for (int j = begin+1; j < end; j++){
				if (data[begin] > data[j]){
					if(j != i) {
						// swap of values
						data[i] = data[i] + data[j];
						data[j] = data[i] - data[j];
						data[i] = data[i] - data[j];					
					}
					i++;
				}
			}
			if ((i-1) != begin) {
				// final swap of the pivot element
				data[i-1] = data[i-1] + data[begin];
				data[begin] = data[i-1] - data[begin];
				data[i-1] = data[i-1] - data[begin];
			}	
			long left = this.sortMiddle(data, begin, i-1);
			long right = this.sortMiddle(data, i, end);
			return left + right + end - begin - 1; 
		}
	}
	
	private int medianIndex(int a, int b, int c, int ia, int ib, int ic) {
		if ((a < b && b < c) || (c < b && b < a)) {
			return ib;
		} else if ((a < c && c < b) || (b < c && c < a)) {
			return ic;
		} else if ((c < a && a < b) || (b < a && a < c)){
			return ia;
		} else if (a==b || a==c) {
			return ia;
		} else {
			return ib;
		}
		
	}
}
