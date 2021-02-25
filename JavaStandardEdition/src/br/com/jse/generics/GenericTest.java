package br.com.jse.generics;

import br.com.jse.domain.Cereal;
import br.com.jse.domain.Fruit;
import br.com.jse.domain.RedFruits;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Arrays.asList;

public class GenericTest {
    public static void main(String[] args) {
        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.add(new Fruit("Apple"));
        fruitBasket.add(new Fruit("Banana"));
        fruitBasket.add(new Fruit("Orange"));
        fruitBasket.add(new Fruit("Mango"));
        System.out.println(fruitBasket.isEmpty());
        System.out.println(fruitBasket.count());
        System.out.println(fruitBasket.displayItems());
        System.out.println("------------------------");

        Basket<Cereal> cerealBasket = new Basket<>();
        cerealBasket.add(new Cereal("Rice"));
        cerealBasket.add(new Cereal("Bean"));
        cerealBasket.add(new Cereal("Corn"));
        cerealBasket.add(new Cereal("Wheat"));
        System.out.println(cerealBasket.isEmpty());
        System.out.println(cerealBasket.count());
        System.out.println(cerealBasket.displayItems());
        System.out.println(cerealBasket.getCerealsThatStartsWithB(
                asList(
                        new Cereal("Bean"),
                        new Cereal("Beans Red Type"),
                        new Cereal("Rice")
                )
                )
        );

        System.out.println("------------------------");

        Basket<RedFruits> redFruitsBasket = new Basket<>();
        Collection<RedFruits> redFruitsList = new ArrayList<>();
        RedFruits cherry = new RedFruits("Cherry");
        RedFruits  strawberry = new RedFruits("Strawberry");
        redFruitsList.add(cherry);
        redFruitsList.add(strawberry);
        redFruitsBasket.addAll(redFruitsList);
        System.out.println(redFruitsBasket.count());
        System.out.println(redFruitsBasket.displayItems());
        System.out.println("------------------------");

    }
}
