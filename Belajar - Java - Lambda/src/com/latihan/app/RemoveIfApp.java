package com.latihan.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Mohamad", "Faqih", "Egy"));

        // for loop // ConcurrentModificationException
//        for(var name : names){
//            if(name.length() > 5){
//                names.remove(name);
//            }
//        }

        // Remove If anonymous class
//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return value.length() > 5;
//            }
//        });

        // lambda
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}
