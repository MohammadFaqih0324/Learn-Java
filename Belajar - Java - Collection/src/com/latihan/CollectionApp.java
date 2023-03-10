package com.latihan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Mohamad ");
        collection.add("Faqih ");
        collection.add("Egy ");
        collection.addAll(List.of("Programmer ","Zaman ","Now "));

        for(var value : collection){
            System.out.print(value);
        }

        System.out.println("\nREMOVE");

        collection.remove("Mohamad");
        collection.removeAll(List.of("Zaman","Now"));

        for(var value : collection){
            System.out.print(value);
        }

        System.out.println(
                collection.contains("Mohamad")
        );

        System.out.println(
                collection.containsAll(List.of("Egy","Now"))
        );

        System.out.println(collection.size());
    }
}
