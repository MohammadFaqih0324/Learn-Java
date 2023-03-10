package com.latihan;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Faqih","Faqih");
        map.put("Egy","Egy");
        map.put("Hapis","Hapis");

        for(var key : map.keySet()){
            System.out.println(key);
        }
    }
}
