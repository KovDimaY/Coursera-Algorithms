package com.coursera.assignment.second;

import java.util.Arrays;

public class ComparisonCounter {
	
	public long numberComparisonFirst(int[] data) {
		int[] temp = Arrays.copyOf(data, data.length);
		long result = this.sortFirst(temp, 0, temp.length);
		return result;
	}
		
	public long numberComparisonLast(int[] data) {
		int[] temp = Arrays.copyOf(data, data.length);
		long result = this.sortLast(temp, 0, temp.length);
		return result;		
	}
	
	public long numberComparisonMiddle(int[] data) {
		int[] temp = Arrays.copyOf(data, data.length);
		long result = this.sortMiddle(temp, 0, temp.length);
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
}
