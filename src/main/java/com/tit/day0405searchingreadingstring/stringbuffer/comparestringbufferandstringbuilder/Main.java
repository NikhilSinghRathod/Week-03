package com.tit.day0405searchingreadingstring.stringbuffer.comparestringbufferandstringbuilder;

public class Main {
    public static void main(String[] args)
    {
        // Create an instance of CompareStringBufferAndStringBuilder
        CompareStringBufferStringBuilder compare = new CompareStringBufferStringBuilder();

        // Measure the time taken to concatenate strings using StringBuilder
        long durationStringBuilder = compare.concatenationOfStringByStringBuilder();

        // Measure the time taken to concatenate strings using StringBuffer
        long durationStringBuffer = compare.concatenationStringByStringBuffer();

        // Output the time taken by both classes for comparison
        System.out.println("Time Taken to concatenate string 1000000 times is as follows:");
        System.out.println("StringBuffer: " + durationStringBuffer + " nanoseconds");
        System.out.println("StringBuilder: " + durationStringBuilder + " nanoseconds");
    }
}
