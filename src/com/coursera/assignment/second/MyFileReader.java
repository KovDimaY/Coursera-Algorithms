package com.coursera.assignment.second;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {
	
	private String path;
	
	public MyFileReader(String fileName) {
		this.path = "./resources/" + fileName;
	}
	
	private List<Integer> readFile(){
		List<Integer> result = new ArrayList<Integer>();
		
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
	
	public int[] getValue() {
		List<Integer> list = this.readFile();
		int[] array = new int[list.size()];
		
		for (int i=0; i<list.size(); i++){
			array[i]=list.get(i).intValue();
		}
		return array;
	}
}
