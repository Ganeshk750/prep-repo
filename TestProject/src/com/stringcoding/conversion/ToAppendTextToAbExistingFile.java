package com.stringcoding.conversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ToAppendTextToAbExistingFile {

	public static void main(String[] args) {

		
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		PrintWriter printWriter = null;
		
		try {
			
			fileWriter = new FileWriter("C:\\Users\\HP\\Documents\\workspace\\TestProject\\sample.txt", true);
		    bufferedWriter = new BufferedWriter(fileWriter);
		    printWriter = new PrintWriter(bufferedWriter);
		    printWriter.println();
		    
		  //Writing text to file
            
            printWriter.println("Venkatesh : 789546");
             
            printWriter.println("Daniel : 874566");
             
            printWriter.println("Shankar : 789546");
             
            System.out.println("Done");
		}catch (IOException e) {
			e.printStackTrace();
		}
		 finally {
			// closing resource
			 try {
				 printWriter.close();
				 bufferedWriter.close();
				 fileWriter.close();
			 }catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
