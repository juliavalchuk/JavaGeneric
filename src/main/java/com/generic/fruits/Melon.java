package com.generic.fruits;

/**
 * Created by julia
 */
public class Melon extends Fruit{

    public Melon(int size) {
        super(size);
    }

    @Override
    public String toString(){
        return "Melon " + size;
    }
}
