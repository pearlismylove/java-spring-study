package com.pearlismylove.javaspringstudy.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape");

        Stream<String> stream = list.stream();
        stream.forEach(ParallelStream::print);

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelStream::print);
    }

    public static void print(String str) {
        System.out.printf("Thread[%s] : %s%n", Thread.currentThread().getName(), str);
    }
}
