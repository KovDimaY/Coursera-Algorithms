package com.coursera.assignment.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapMedians {
	
	private List<Integer> smallHeap;
	private List<Integer> bigHeap;
	
	public HeapMedians() {
		this.smallHeap = new ArrayList<>();
		this.bigHeap = new ArrayList<>();
	}
	
	public int sumOfMedians(int[] data) {
		System.out.println(Arrays.toString(data) + "\n\n");
		
		int result = 0;
		for (int i = 0; i < data.length; i++) {
			System.out.println("Step " + (i+1) + ":");
			
			if (data[i] > this.getMaxSmallHeap()) {
				this.insertToBigHeap(data[i]);
			} else {
				this.insertToSmallHeap(data[i]);
			}
			
			if (this.bigHeap.size() > this.smallHeap.size()) {
				this.insertToSmallHeap(this.extractMinFromBigHeap());
			} else if (this.smallHeap.size() - this.bigHeap.size() > 1) {
				this.insertToBigHeap(this.extractMaxFromSmallHeap());
			}
			
			
			result += this.getMaxSmallHeap();
			result %= 10000;
			System.out.println(result);
			System.out.println();
		}
		
		return result;
	}
	
	private void insertToSmallHeap(int number) {
		
	}
	
	private void insertToBigHeap(int number) {
		
	}
	
	private int extractMaxFromSmallHeap() {
		return 0;
	}
	
	private int extractMinFromBigHeap() {
		return 0;
	}
	
	private int getMaxSmallHeap() {
		return 0;
	}
	
	private int getMinBigHeap() {
		return 0;
	}
	
	
}
