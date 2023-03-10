package com.latihan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Faqih","Faqih Value");
        map.put("Egy","Egy Value");
        map.put("Hapis","Hapis Value");

        Set<Map.Entry<String,String>> entries = map.entrySet();

        for(var entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
