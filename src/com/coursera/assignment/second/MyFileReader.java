package com.coursera.assignment.second;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {
	
	private String path;
	private int length;
	private List<Integer> contentList;
	private int[] contentArray;
	
	public MyFileReader(String fileName) {
		this.path = "./resources/" + fileName;
		this.contentList = this.readFile();
		this.contentArray = this.convertToArray();		
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int[] getContentArray() { 
		return this.contentArray;
	}
	
	public List<Integer> getContentList() {
		return this.contentList;
	}
	
	public String getPath() {
		return this.path;
	}
	
	private List<Integer> readFile(){
		List<Integer> result = new ArrayList<Integer>();
		this.length = 0;
		
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(this.path);

            // Wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	try {
            	result.add(new Integer(line)); 
            	this.length++;
            	} catch (NumberFormatException e) {
            		System.out.println(line + "does not have correct format");
            		return null;
            	}
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                this.path + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + this.path + "'"); 
        }
        
		return result;
	}
	
	private int[] convertToArray() {
		List<Integer> list = this.readFile();
		int[] array = new int[list.size()];
		
		for (int i=0; i<list.size(); i++){
			array[i]=list.get(i).intValue();
		}
		return array;
	}
}
