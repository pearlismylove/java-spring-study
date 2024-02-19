package com.pearlismylove.javaspringstudy.java;

import java.util.List;

public class CopyList {

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry");

        try {
            fruits.add("Date");
        } catch (UnsupportedOperationException e) {
            System.out.println("fruits.add(\"Date\") is not allowed.");
        }
    }
}
