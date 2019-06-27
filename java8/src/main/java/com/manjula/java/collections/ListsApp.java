package com.manjula.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class ListsApp {

    public static void main(String[] args) {
        // add operation
        long start = System.nanoTime();
        List<String> arrayList = new ArrayList<>();
        IntStream.range(0, 10000).forEach(i -> arrayList.add("Hello"));
        long arrayListAdd = System.nanoTime() - start;

        start = System.nanoTime();
        List<String> linkedList = new LinkedList<>();
        IntStream.range(0, 10000).forEach(i -> linkedList.add("Hello"));
        long linkedListAdd = System.nanoTime() - start;
        
        System.out.println(arrayListAdd - linkedListAdd);
        
        // get operation
        start = System.nanoTime();
        IntStream.range(0, 10000).forEach(arrayList::get);
        long arrayListGet = System.nanoTime() - start;
        
        start = System.nanoTime();
        IntStream.range(0, 10000).forEach(i -> linkedList.get(i));
        long linkedListGet = System.nanoTime() - start;
        
        System.out.println(arrayListGet - linkedListGet);
    }

}
