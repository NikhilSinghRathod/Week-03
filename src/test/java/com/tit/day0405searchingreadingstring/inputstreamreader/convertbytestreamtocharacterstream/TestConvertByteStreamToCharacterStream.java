package com.tit.day0405searchingreadingstring.inputstreamreader.convertbytestreamtocharacterstream;


import org.junit.jupiter.api.Test;

public class TestConvertByteStreamToCharacterStream {
    @Test
    public void testingReadBinaryDataAsCharacters() {
        // Creating an instance of ConvertByteStreamToCharacterStream class
        ConvertByteStreamToCharacterStream obj = new ConvertByteStreamToCharacterStream();

        // Path to the test file
        String filePath = "src/test/java/com/tit/day0405searchingreadingstring/inputstreamreader/convertbytestreamtocharacterstream/large_text_file.txt";

        // Calling the readBinaryDataAsCharacters method with the specified file path and target word
        obj.readBinaryDataAsCharacters(filePath);

        // Printing a message to indicate the function is working as expected
        System.out.println("readBinaryDataAsCharacters function working like expected");
    }
}

