package com.tit.day0405searchingreadingstring.stringbuffer.concatenation;
import java.util.Arrays;
import java.util.Scanner;

// Creating a class Problem1 to demonstrate the ConcatenateStrings functionality
public class Main {
    public static void main(String[] args)
    {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Create an array of strings to concatenate
        String[] input = {"Hello1 ", "Hello2 ", "Hello3 ", "Hello4 ", "Hello5 ", "Hello6 ", "Hello7"};

        // Concatenate the strings using the ConcatenateStrings class
        String output = ConcatenateString.concatenateStringUsingStringBuffer(input);

        // Display the original string array and the concatenated string
        System.out.println("String Array Before Concatenation: " + Arrays.toString(input));
        System.out.println("String Array After Concatenation: " + output);

        // Close the Scanner object
        sc.close();
    }

}
