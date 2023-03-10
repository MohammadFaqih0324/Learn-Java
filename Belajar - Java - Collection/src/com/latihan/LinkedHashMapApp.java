package com.latihan;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Faqih");
        map.put("last", "Egy");
        map.put("middle", "Hapis");

        Set<String> keys = map.keySet();
        for(var key : keys){
            System.out.println(key);
        }
    }
}
