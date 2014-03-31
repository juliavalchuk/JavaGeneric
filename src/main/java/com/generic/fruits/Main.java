package com.generic.fruits;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by julia
 */
public class Main {

    public static void main(String[] args) {

        FruitFactory<Fruit> fruitFactory = Fruit::new;
        FruitFactory<Apple> appleFactory = Apple::new;
        FruitFactory<RedApple> redAppleFactory = RedApple::new;
        FruitFactory<Orange> orangeFactory = Orange::new;
        FruitFactory<Melon> melonFactory = Melon::new;

        List<Fruit> fr = generateFruitList(fruitFactory);
        List<Apple> app = generateFruitList(appleFactory);
        List<Orange> or = generateFruitList(orangeFactory);
        List<RedApple> rapp = generateFruitList(redAppleFactory);
        List<Melon> mel = generateFruitList(melonFactory);

        //or.forEach(System.out::println);
       // copyAll(or, fr);
        copyAll(fr, or);
        or.forEach(System.out::println);

        Orange orange = orangeFactory.create(5);
        System.out.println("Fruit: " + orange);
        collectionOverTheGiven(or, orange).forEach(System.out::println);

    }

    public static <E, T>  void copyAll(Collection<E> collection, Collection<T> out){
       // collection = collection == null ? new ArrayList<>(): collection;\
        out.addAll(collection.stream().map(c -> (T) c).collect(Collectors.toList()));
    }

    public static <E extends Fruit> Collection<E> collectionOverTheGiven(Collection<E> collection, E obj){
        return (collection.stream().filter((E c) -> c.getSize() > obj.getSize()).collect(Collectors.toList()));
    }

    public static <E extends Fruit> List<E> generateFruitList(FruitFactory factory){
        int k = 10;
        int n = rnd(k) + 5;

        List<E> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add((E) factory.create(rnd(k)));
        }
        return list;
    }

    public static int rnd(int n){
        return (int)(Math.random() * n);
    }

//    public static <E extends Fruit> List<Fruit>  generateList(List<Fruit> list) throws IllegalAccessException, InstantiationException, InvocationTargetException {
//        int n = (int)(Math.random() * 10) + 5;
//        Constructor<E> ctor = E.class.asSubclass().getConstructor(Integer.class);
//
//        for (int i = 0; i < n; i++) {
//            list.add(ctor.newInstance((int)(Math.random() * 10)));
//        }
//        return list;
//    }
}
