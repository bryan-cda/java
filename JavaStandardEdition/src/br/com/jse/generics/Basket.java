package br.com.jse.generics;

import br.com.jse.domain.Cereal;
import br.com.jse.domain.Edible;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Basket<E extends Edible> {

    List<E> list = new ArrayList<>();

    public void add(E item){
        list.add(item);
    }

    public E delete(){
        Random r = new  Random(System.currentTimeMillis());
        return list.remove(r.nextInt());
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public Integer count(){
        return list.size();
    }

    public List<E> displayItems(){
        return list;
    }

    public Collection<E> addAll(Collection<? extends  E> items){
        items.forEach(i -> list.add(i));
        return list;
    }

    public <T extends Cereal> List<T> getCerealsThatStartsWithB(Collection<T> cereals){
        List<T> b = cereals
                .stream()
                .filter(cereal -> cereal.getName().toLowerCase().startsWith("b"))
                .collect(Collectors.toList());

        System.out.println(b);

        return b;
    }

}

