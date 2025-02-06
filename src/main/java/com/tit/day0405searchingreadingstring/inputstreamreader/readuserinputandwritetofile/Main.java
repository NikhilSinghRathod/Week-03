package com.tit.day0405searchingreadingstring.inputstreamreader.readuserinputandwritetofile;

public class Main {
    public static void main(String[] args)
    {
        // Create an instance of ReadUserInputAndWriteToFile
        ReadUserInputAndWriteToFile readerWriter = new ReadUserInputAndWriteToFile();

        // Specify the file path (update this path to your local file)
        String filePath = "src/main/java/com/tit/day0405searchingreadingstring/inputstreamreader/readuserinputandwritetofile/ConsoleInputFile.txt";

        // Read user input from the console and write it to the file using the ReadUserInputAndWriteToFile class
        readerWriter.readInputAndWriteToFile(filePath);
    }
}
