package com.generic.fruits;

/**
 * Created by julia
 */
public interface FruitFactory<F extends Fruit> {
    F create(int size);
}
