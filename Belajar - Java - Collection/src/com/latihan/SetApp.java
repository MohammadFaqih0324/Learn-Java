package com.latihan;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

    public static void main(String[] args) {

//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();

        names.add("Faqih");
        names.add("Egy");
        names.add("Hapis");
        names.add("Faqih");
        names.add("Egy");
        names.add("Hapis");

        for(var name : names){
            System.out.println(names);
        }
    }
}