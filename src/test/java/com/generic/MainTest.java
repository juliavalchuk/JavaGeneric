package com.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by julia
 */
public class MainTest {

    @Test
    public void testFromArrayToCollectionNotEmptyArrayAndCollection() throws Exception {
        Integer[] array = {1, 2, 3, 4, 5};
        Collection<Integer> actCollection = new ArrayList<>();
        Collection<Integer> expCollection = new ArrayList<>();
        com.generic.Main.fromArrayToCollection(array, actCollection);
        expCollection.add(1);
        expCollection.add(2);
        expCollection.add(3);
        expCollection.add(4);
        expCollection.add(5);


        assertEquals(expCollection, actCollection);
    }
}
