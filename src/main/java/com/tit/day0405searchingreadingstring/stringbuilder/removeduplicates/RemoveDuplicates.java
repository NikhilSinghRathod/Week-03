package com.tit.day0405searchingreadingstring.stringbuilder.removeduplicates;
import java.util.HashSet;
 class RemoveDuplicates {
     // Method to remove duplicate characters from a string while maintaining order
     public static String removeDuplicates(String str) {
         // StringBuilder to store the result
         StringBuilder sb = new StringBuilder();
         // HashSet to track encountered characters
         HashSet<Character> hs = new HashSet<>();

         // Iterate through each character in the input string
         for(char ch : str.toCharArray()){
             // If character is not already in HashSet, add it to both HashSet and StringBuilder
             if(!hs.contains(ch)){
                 hs.add(ch);
                 sb.append(ch);
             }
         }
         // Return the final string without duplicates
         return sb.toString();
     }
}
