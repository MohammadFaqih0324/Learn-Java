package com.latihan;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name","Faqih");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Faqih");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Faqih",
                "middle","Egy",
                "last", "Hapis"
        );

//        map.put("a", "A"); error
    }
}
