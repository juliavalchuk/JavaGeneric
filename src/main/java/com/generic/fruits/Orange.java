package com.generic.fruits;

/**
 * Created by julia
 */
public class Orange extends Fruit {
    public Orange(int size) {
        super(size);
    }
    @Override
    public String toString(){
        return "Orange " + size;
    }
}
