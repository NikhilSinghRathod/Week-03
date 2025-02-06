package com.tit.day0405searchingreadingstring.stringbuffer.concatenation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConcatenationString {
    @Test
    public void testConcatenateString(){
        //Making the object of the class in which our Concatenate String  method Relies
        ConcatenateString cs = new ConcatenateString();

        // Create an array of strings to concatenate
        String[] input = {"Hello1 ", "Hello2 ", "Hello3 ", "Hello4 ", "Hello5 ", "Hello6 ", "Hello7"};

        // Create an variable of strings to store the result
        String output = "Hello1 Hello2 Hello3 Hello4 Hello5 Hello6 Hello7";

        //create a new variable to store the result
        String s = cs. concatenateStringUsingStringBuffer(input);

        //Method to check whether the give input meet the excepted output or not
        assertEquals(output , s);

        //if both are same then print the given below
              System.out.println("The gven input meet the excepted output");

    }
}
