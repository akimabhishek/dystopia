package com.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class CountingStars {
	
	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException{
		
	
	File file = new File("C:\\Users\\Abhishek\\Desktop\\1.txt");
    FileInputStream fileStream = new FileInputStream(file);
    InputStreamReader input = new InputStreamReader(fileStream);
    @SuppressWarnings("resource")
	BufferedReader reader = new BufferedReader(input);
     
    //String line;
    
    int line = 0;
    String read= null;
    
    while((read=reader.readLine())!=null) {
    	HashMap<String,HashSet<Integer>> map = null;
    	line = line +1;
    	
    	String[] words = read.split("\\W+");
    	for(String str : words) {
    		if(map.containsKey(str)){
    			HashSet<Integer> h = map.get(str);
    			h.add(line);
    		}
    		else {
    			HashSet<Integer> set = new HashSet<Integer>();
    			set.add(line);
    			map.put(str,set);
    		}
    	}
    }
}
}
	

