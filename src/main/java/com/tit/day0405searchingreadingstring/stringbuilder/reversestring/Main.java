package com.tit.day0405searchingreadingstring.stringbuilder.reversestring;
import java.net.StandardSocketOptions;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //calling scanner class to take the user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");

        //Making the string type variable to store the value
        String str = sc.next();

        //calling the method reverse String
        System.out.println(ReverseString.reverseString(str));
    }
}
