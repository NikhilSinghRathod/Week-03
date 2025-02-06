package com.tit.day0405searchingreadingstring.filereader.readafile;


public class Main {
    public static void main(String[] args)
    {
        // Create an instance of ReadAFiIe
        ReadAFile reader = new ReadAFile();

        // Specify the file path
        String filePath = "src/main/java/com/tit/day0405searchingreadingstring/filereader/readafile/large_text_file.txt";

        // Read the file line by line using the ReadAFiIe class
        reader.readAFileLineByLine(filePath);
    }
}
