package com.latihan;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Faqih", "Egy", "Programmer", "Zaman", "Now"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> faqih = names.tailSet("Faqih", true);

        for (var name : faqih) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("Ups");
    }
}