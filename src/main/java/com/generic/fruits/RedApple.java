package com.generic.fruits;

/**
 * Created by julia
 */
public class RedApple extends Apple {
    public RedApple(int size) {
        super(size);
    }
    @Override
    public String toString(){
        return "RedApple " + size;
    }
}
