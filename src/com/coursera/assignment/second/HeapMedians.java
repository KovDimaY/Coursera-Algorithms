package com.coursera.assignment.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.coursera.helpers.MaxHeap;
import com.coursera.helpers.MinHeap;

public class HeapMedians {
	
	private MaxHeap smallHeap;
	private MinHeap bigHeap;
	
	public HeapMedians(int sizeOfData) {
		this.smallHeap = new MaxHeap((sizeOfData / 2) + 2);
		this.bigHeap = new MinHeap((sizeOfData / 2) + 2);
	}
	
	public int sumOfMedians(int[] data) {
		System.out.println(Arrays.toString(data) + "\n\n");
		
		int result = 0;
		System.out.println("Step 1:");
		System.out.println(data[0]);
		this.smallHeap.insert(data[0]);		
		result += this.smallHeap.getMax();
		result %= 10000;
		System.out.println(result);
		System.out.println();
		
		for (int i = 1; i < data.length; i++) {
			System.out.println("Step " + (i+1) + ":");
			System.out.println(data[i]);
			System.out.println(this.smallHeap.print());
			System.out.println(this.bigHeap.print());
			
			if (data[i] > this.smallHeap.getMax()) {
				this.bigHeap.insert(data[i]);
			} else {
				this.smallHeap.insert(data[i]);
			}
			
			if (this.bigHeap.size() > this.smallHeap.size()) {
				this.smallHeap.insert(this.bigHeap.remove());
			} else if (this.smallHeap.size() - this.bigHeap.size() > 1) {
				this.bigHeap.insert(this.smallHeap.remove());
			}
			
			result += this.smallHeap.getMax();
			result %= 10000;
			System.out.println("median = " + this.smallHeap.getMax());
			System.out.println(result);
			System.out.println();
		}
		
		return result;
	}	
}
