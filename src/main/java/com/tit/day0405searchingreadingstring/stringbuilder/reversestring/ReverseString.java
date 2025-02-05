package com.tit.day0405searchingreadingstring.stringbuilder.reversestring;

class ReverseString {
    //Making the string builder object
    static StringBuilder sb = new StringBuilder();

    //making the method to reverse the String
    public static String reverseString(String str){
        //Adding every character to the string builder
        sb.append(str);
        //using inbuilt function to reverse the sb
        sb.reverse();
        //now converting it to the Sting using inbuilt function
         String s = sb.toString();
        //now returning the answer
        return s;
    }
}
