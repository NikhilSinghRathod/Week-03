package com.tit.day0405searchingreadingstring.filereader.readafile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Creating a class ReadAFiIe to represent reading a file line by line using FileReader
public class ReadAFile {
    // Method to read a file line by line and print each line to the console
    public void readAFileLineByLine(String filePath){
        // Try-with-resources statement to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
             String line;
             //Read line by line
             while((line = br.readLine())!=null){
                 System.out.println(line);
            }
        }
        catch (IOException e ){
            // Print the stack trace if an IOException occurs
            e.getStackTrace();
        }
    }

}
