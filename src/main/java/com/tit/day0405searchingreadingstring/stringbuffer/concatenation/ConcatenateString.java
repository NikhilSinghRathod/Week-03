package com.tit.day0405searchingreadingstring.stringbuffer.concatenation;

// Creating a class ConcatenateStrings to represent the string concatenation using StringBuffer
class ConcatenateString {
    // Method to concatenate an array of strings using StringBuffer
    public static String concatenateStringUsingStringBuffer(String[] input) {

        // Create a new StringBuffer object to store the concatenated string
        StringBuffer sb = new StringBuffer();

        //Iterate through each string in the array and append it to the string buffer
        for (String s : input){
            sb.append(s);
        }
        // Convert the StringBuffer back to a string and return it
        return sb.toString();
    }
}
