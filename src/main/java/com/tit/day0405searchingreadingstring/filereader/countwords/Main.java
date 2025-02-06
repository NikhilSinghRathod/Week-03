package com.tit.day0405searchingreadingstring.filereader.countwords;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        // Create an instance of CountWordOccurrences
        CountWordsOccurences counter = new CountWordsOccurences();

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Specify the file path
        String filePath = "src/main/java/com/tit/day0405searchingreadingstring/filereader/countwords/large_text_file.txt";

        // Prompt the user to enter the target word
        System.out.print("Please Enter the Word to Count: ");
        String targetWord = sc.nextLine();

        // Count the occurrences of the target word in the file
        int count = counter.countWordOccurrences(filePath, targetWord);

        // Print the final count
        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");

        // Close the Scanner object
        sc.close();
    }
}
