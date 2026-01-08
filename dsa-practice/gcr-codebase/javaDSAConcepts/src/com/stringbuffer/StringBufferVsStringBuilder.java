package com.stringbuffer;

public class StringBufferVsStringBuilder {

    public static void main(String[] args) {

        int count = 1_000_000;

        // -------- StringBuffer Test --------
        StringBuffer stringBuffer = new StringBuffer();
        long startBufferTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            stringBuffer.append("hello");
        }

        long endBufferTime = System.nanoTime();
        long bufferDuration = endBufferTime - startBufferTime;

        // -------- StringBuilder Test --------
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilderTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            stringBuilder.append("hello");
        }

        long endBuilderTime = System.nanoTime();
        long builderDuration = endBuilderTime - startBuilderTime;

        // -------- Results --------
        System.out.println("StringBuffer time (ns): " + bufferDuration);
        System.out.println("StringBuilder time (ns): " + builderDuration);
    }
}

