package com.latihan;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Faqih","Faqih");
        map.put("Egy","Egy");
        map.put("Hapis","Hapis");

        for(var key : map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Faqih"));
        System.out.println(map.higherKey("Faqih"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for(var key : mapDesc.keySet()){
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("Faqih", "Faqih"); // ERROR
    }
}