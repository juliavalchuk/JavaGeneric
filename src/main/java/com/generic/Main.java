package com.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by julia
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 3, 2, 1, 6};
        Collection<Integer> collection = new ArrayList<>();
        fromArrayToCollection(array, collection);

        collection.forEach(System.out::println);

    }

    public static <E> void fromArrayToCollection(E[] a, Collection<E> c){
        for(E i: a){
            c.add(i);
        }
    }

}
