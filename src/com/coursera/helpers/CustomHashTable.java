package com.coursera.helpers;

public class CustomHashTable {
	
	private int[] table;
	private int size;
	private int maxSize;
	
	public CustomHashTable(int maxSize) {
		this.maxSize = maxSize;
		this.table = new int[2*maxSize];
		this.size = 0;
	};
	
	public int size() {
		return this.size;
	}
	
	public int maxSize() {
		return this.maxSize;
	}
	
	public void insert(int element) {
		// inserting to the table
	}
	
	public void delete(int element) {
		// deleting from the table
	}
	
	public int find(int element) {
		return 0;
	}
	
	private int hashFunction(int element) {
		return 0;
	}
	
	
	
}
