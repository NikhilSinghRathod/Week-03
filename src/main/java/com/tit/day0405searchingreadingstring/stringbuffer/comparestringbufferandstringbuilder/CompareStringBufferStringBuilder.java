package com.tit.day0405searchingreadingstring.stringbuffer.comparestringbufferandstringbuilder;

// Creating a class CompareStringBufferAndStringBuilder to compare the performance of StringBuffer and StringBuilder
public class CompareStringBufferStringBuilder {
    // Method to concatenate strings using StringBuilder and measure the time taken
    public long concatenationOfStringByStringBuilder(){
        int numberofString = 1000000;
        String s = "Hello";
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for(int i=0 ; i<numberofString ; i++){
            sb.append(s);
        }
        long end = System.nanoTime();
        long duration = end - start;
        return duration;
    }

    // Method to concatenate strings using StringBuffer and measure the time taken
    public static long concatenationStringByStringBuffer()
    {
        int numberOfString = 1000000;
        String s = "Hello";
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();
        for (int i = 0; i < numberOfString; i++)
            sb.append(s);
        long end = System.nanoTime();
        long duration = end - start;
        return duration;
    }
}

