package com.tit.day0405searchingreadingstring.stringbuilder.reversestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseString {
    @Test
    public void testReverseString(){
        //Making the object of the class in which our reverse method relies
        ReverseString rs = new ReverseString();
        //Creating a new variable to store the result
        String str = rs.reverseString("madam");
      //this method checks whether the answer are same or different
        assertEquals("madam",str);
       //if both are same then print the given below
        System.out.println("Both the string are equal");
    }

}
