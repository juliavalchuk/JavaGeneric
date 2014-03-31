package com.generic.fruits;

/**
 * Created by julia
 */
public class Apple extends Fruit implements Comparable<Apple> {

    public Apple(int size) {
        super(size);
    }

    @Override
    public int compareTo(Apple o) {
        return 0;
    }

    @Override
    public String toString(){
        return "Apple " + size;
    }
}
