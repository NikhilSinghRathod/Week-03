package com.tit.day0405searchingreadingstring.filereader.readafile;

import org.junit.jupiter.api.Test;


public class TestReadFile {
    @Test
    public void testReadAFileLineByLine()
    {
        // Creating an instance of ReadAFiIe class
        ReadAFile raf = new ReadAFile();
        // Path to the test file
        String filePath = "src/test/java/com/tit/day0405searchingreadingstringstype/filereader/readafile/large_text_file.txt";
        // Calling the readAFileLineByLine method with the specified file path
        raf.readAFileLineByLine(filePath);
        // Printing a message to indicate the function is working as expected
        System.out.println("readAFileLineByLine function working like expected");

    }
}
