package com.tit.day06runtimeanalysisalgorithm.stringconcatenationperformance;

public class StringBufferConcatenation {
    // Method to concatenate strings using StringBuffer
    public void concatenateWithStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }
}
