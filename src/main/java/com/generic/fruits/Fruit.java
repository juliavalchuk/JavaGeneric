package com.generic.fruits;

/**
 * Created by julia
 */
public class Fruit {
    final int size;

    public Fruit(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString(){
        return "Fruit " + size;
    }
}
