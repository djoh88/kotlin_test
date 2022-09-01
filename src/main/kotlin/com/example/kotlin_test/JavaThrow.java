package com.example.kotlin_test;

import java.io.IOException;

public class JavaThrow {
    
    public void throwIOException() throws IOException{
        throw new IOException("체크드 익셉션인 IOException 발생");
    }
    
    public static void main(String[] args) {
/*

        JavaThrow javaThrow = new JavaThrow();
        try {
            javaThrow.throwIOException();

        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        KotlinThrow kotlinThrow = new KotlinThrow();
        kotlinThrow.throwIOException();

    }
}
