package com.tit.day06runtimeanalysisalgorithm.largefilereadingefficiency;

import java.io.*;

// Creating a class FileReadingComparison to compare the performance of FileReader and InputStreamReader methods
class FileReadingComparison
{
    public static void main(String[] args) throws IOException {
        // String array to store file paths
        String[] filePaths = new String[3];
        filePaths[0]="src/main/java/com/tit/day06runtimeanalysisalgorithm/largefilereadingefficiency/1MBFile.txt.txt";
        filePaths[1]="src/main/java/com/tit/day06runtimeanalysisalgorithm/largefilereadingefficiency/100MBFile.txt";

        // Creating objects of FileReaderEfficiency and InputStreamReaderEfficiency classes
        FileReaderEfficiency fileReaderEfficiency = new FileReaderEfficiency();
        InputStreamReaderEfficiency inputStreamReaderEfficiency = new InputStreamReaderEfficiency();

        // Measure and display performance for each file path
        for (String filePath : filePaths) {
            System.out.println("File Path: " + filePath);

            // Measure time for FileReader
            long fileReaderTime = fileReaderEfficiency.readFileUsingFileReader(filePath);
            System.out.println("FileReader Time: " + fileReaderTime + " ms");

            // Measure time for InputStreamReader
            long inputStreamReaderTime = inputStreamReaderEfficiency.readFileUsingInputStreamReader(filePath);
            System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");

            System.out.println();
        }
    }
}
