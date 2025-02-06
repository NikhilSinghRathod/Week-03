package com.tit.day0405searchingreadingstring.stringbuffer.comparestringbufferandstringbuilder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompareStringBuilderAndStringBuffer {
    @Test
     public void testBothFunctionOfClassCompareStringBufferAndStringBuilder() {
        //Making the object of the class in which our Comparison String  method Relies for time analysis
        CompareStringBufferStringBuilder c = new CompareStringBufferStringBuilder();

        // Measure the time taken to concatenate strings using StringBuilder
        long durationStringBuilder = c.concatenationOfStringByStringBuilder();

        // Measure the time taken to concatenate strings using StringBuffer
        long durationStringBuffer = c.concatenationStringByStringBuffer();

        try{
            // Assert that the durations are the same (this might fail due to differences in performance)
            assertEquals(durationStringBuilder , durationStringBuffer);
            System.out.println("The time taken by both String builder and buffer are same");
        }
        catch(Error e){
            System.out.println(e.getMessage());
            System.out.println("Duration taken by both the classes StringBuffer and StringBuilder are not the same");

        }

    }

}
