package com.tit.day0405searchingreadingstring.inputstreamreader.convertbytestreamtocharacterstream;

public class Main {
    public static void main(String[] args)
    {
        // Create an instance of ConvertByteStreamToCharacterStream
        ConvertByteStreamToCharacterStream converter = new ConvertByteStreamToCharacterStream();

        // Specify the file path (update this path to your local file)
        String filePath = "src/main/java/com/tit/day0405searchingreadingstring/inputstreamreader/convertbytestreamtocharacterstream/large_text_file.txt";

        // Read binary data from the file and print it as characters using the ConvertByteStreamToCharacterStream class
        converter.readBinaryDataAsCharacters(filePath);
    }
}
