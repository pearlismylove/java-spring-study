package com.pearlismylove.javaspringstudy.java;

import java.util.Objects;

public class ObjectMethods {

    public static void main(String[] args) {
        String str = "Hello, World!";
        String strByReference = str;
        String strByValue = "Hello, World!";
        System.out.println("str.hashCode() = " + str.hashCode());
        System.out.println("strByReference.equals() = " + str.equals(strByReference));
        System.out.println("strByValue.equals() = " + str.equals(strByValue));
        System.out.println("Object.hash=" + Objects.hash(str));
    }
}
