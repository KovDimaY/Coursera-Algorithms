package com.coursera.helpers;

public class CustomListHashTable {
	
	private CustomListElement[] table;
	private int size;
	private int maxSize;
	
	public CustomListHashTable(int maxSize) {
		this.maxSize = 2*maxSize;
		this.table = new CustomListElement[2*maxSize];
		this.size = 0;
	};
	
	public int size() {
		return this.size;
	}
	
	public int maxSize() {
		return this.maxSize/2;
	}
	
	public void insert(long element) {
		if (this.size < this.maxSize) {
			int hash = this.hashFunction(element);
			this.size++;
			if (this.table[hash] == null) {
				this.table[hash] = new CustomListElement(element, true); 
			} else {
				this.table[hash].put(element, true); 
			}
		} else {
			System.out.println("Sorry, but Hash Table is full!");
		}
	}
	
	public void delete(int element) {
		int hash = this.hashFunction(element);
		if (this.table[hash] != null) {
			this.table[hash].delete(element);
		}
	}
	
	public boolean find(long element) {
		int hash = this.hashFunction(element);
		if (this.table[hash] != null) {
			return this.table[hash].findKey(element);
		} else {
			return false;
		}
	}
	
	private int hashFunction(long element) {
		int result = (int) (element % (this.maxSize - 1));
		if (result < 0) {
			result *= -1;
		}
		return result;
	}
}
