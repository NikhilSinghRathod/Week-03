package com.tit.day0405searchingreadingstring.stringbuilder.removeduplicates;

public class Main {
    public static void main(String[] args) {
        String input = "programming"; // Input string
        String result = RemoveDuplicates.removeDuplicates(input); // Call method to remove duplicates

        // Print the original and modified strings
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}
