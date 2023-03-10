package com.latihan;

import com.latihan.data.Person;
import com.latihan.data.PersonComparator;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {

    public static void main(String[] args) {

//        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Faqih"));
        people.add(new Person("Egy"));
        people.add(new Person("Hapis"));
        people.add(new Person("Babon"));
        people.add(new Person("Mamah Neni"));

        for(var person : people){
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
//        sortedSet.add(new Person("Faqih"));

    }
}
