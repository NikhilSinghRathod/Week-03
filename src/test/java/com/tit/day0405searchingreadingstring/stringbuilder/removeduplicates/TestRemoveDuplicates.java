package com.tit.day0405searchingreadingstring.stringbuilder.removeduplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRemoveDuplicates {
    @Test
    public void  testRemoveDuplicates(){
        //Making the object of the class in which our remove duplicate method relies
        RemoveDuplicates rd = new RemoveDuplicates();
        //create a new variable to store the result
        String str =  rd.removeDuplicates("Programming");
        //Method to check whether the give input meet the excepted output or not
        assertEquals("Progamin",str);
        //if both are same then print the given below
        System.out.println("The gven input meet the excepted output");
    }
}
